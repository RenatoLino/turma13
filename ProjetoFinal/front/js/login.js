
function autenticar(event) {
    event.preventDefault();

    let txtInput = document.getElementById("txtInput");
    let txtSenha = document.getElementById("txtSenha");


    let loginMsg = {
        email: txtInput.value,
        racf: txtInput.value,
        senha: txtSenha.value
    }


    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/usuario/login", cabecalho)
        .then(res => tratarResultado(res));
}

function tratarResultado(res) {
    if (res.status == 200) {
        res.json().then(res => logarUsuario(res));
    }
    else {
        document.getElementById("msgError").innerHTML = "Usuário/Senha Inválida";
    }
}

function logarUsuario(res) {
    localStorage.setItem("userLogged", JSON.stringify(res));
    window.location = "diretor.html";
}