function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "/index.html";  
    }

    let user = JSON.parse(userTxt);  // transforma texto no objeto

    document.getElementById("imgUser").innerHTML = `<img src="${user.linkFoto}">`;
    document.getElementById("user").innerHTML = `${user.nome} (${user.racf})`;

/*     "texto" + user.nome
    'testo' + user.nome
    `texto ${user.nome}`  */

    carregar(user);
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "/index.html";
}

function carregar(user) {

    let usuario = {
        id: user.id
    }

    let msg = {
        method: 'POST',
        body: JSON.stringify(usuario),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/comunidade/user", msg)
        .then(res => res.json())
        .then(res => preenche(res));
}

function preenche(comunidades) {
    let tabelaComunidades = '<table class="table table-sm"> <tr> <th>Nome</th> <th></th> </tr>';
    
    for (i = 0; i < comunidades.length; i++) {
        tabelaComunidades = tabelaComunidades + `<tr> 
                            <td> ${comunidades[i].nome} </td> 
                            <td class="text-center"> <button class="btn btn-sm btn-outline-success" onclick="novaModernizacao(${comunidades[i].id}, '${comunidades[i].nome}')">NOVO</button> 
                            <button class="btn btn-sm btn-outline-primary" onclick="exibirModernizacao(${comunidades[i].id}, '${comunidades[i].nome}')">EXTRATO</button> </td> 
                        </tr>`;
    }
    tabelaComunidades += '</table>';
    document.getElementById("tabela").innerHTML = tabelaComunidades;

}

function novaModernizacao(id, nome) {
    let comunidade ={
        id,
        nome
    }
    localStorage.setItem("comunidade", JSON.stringify(comunidade));
    window.location = "nova.html";
}

function exibirModernizacao(id, nome) {
    let comunidade ={
        id,
        nome
    }
    localStorage.setItem("comunidade", JSON.stringify(comunidade));
    window.location = "listar.html";
}

