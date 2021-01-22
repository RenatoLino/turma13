package br.paduan.projFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.projFinal.model.Comunidade;
import br.paduan.projFinal.model.Modernizacao;
import br.paduan.projFinal.repository.ModernizacaoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/modernizacao")
public class ModernazacaoController {

    @Autowired
    private ModernizacaoRepo repo;

    @PostMapping("/nova")
    public ResponseEntity<Modernizacao> nova(@RequestBody Modernizacao modernizacao) {

        // antes de adicionar precisa verificar:
        // 1. se não é outra inserção no mesmo mês
        Object obj = repo.existe(modernizacao.getComunidade().getId(), modernizacao.getDataModernizacao().getYear(),
                modernizacao.getDataModernizacao().getMonth().getValue());

        if (obj != null) {
            return ResponseEntity.status(400).build();
        }

        // 2. se não ultrapassa 100%
        double percentual = repo.somaPorcentagem(modernizacao.getComunidade().getId(),
                modernizacao.getDataModernizacao().getYear());

        if (percentual + modernizacao.getPercentual() > 100) {
            return ResponseEntity.status(400).build();
        }

        Modernizacao nova = repo.save(modernizacao);

        if (nova != null) {
            return ResponseEntity.ok(nova);
        }
        return ResponseEntity.status(400).build();

    }

    @PostMapping("/busca")
    public List<Modernizacao> busca(@RequestBody Comunidade comunidade) {
        List<Modernizacao> lista = repo.findByComunidadeOrderByDataModernizacaoDesc(comunidade);

        return lista;
    }

}
