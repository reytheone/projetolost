function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    document.getElementById("fotoUser").innerHTML = `<img src= ${user.linkFoto}>`
    document.getElementById("dadosUser").innerHTML = `${user.nome} (<b>${user.racf}</b>)`;
    

}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function buscarAlarmes() {
    fetch("http://localhost:8080/alarme/all")
        .then(res => tratarRetorno(res))
}

function tratarRetorno(resposta) {
    if (resposta.status == 200) {
        resposta.json().then(res => exibirTodos(res));
    } else {
        document.getElementById("usuarios").innerHTML = "Nenhum alarme cadastrado!";
    }
}

function exibirTodos(lista) {
    let tabela = `<table class="table" table-sm> <tr> <th>Nome</th> <th>Descrição</th> </tr>`;

    for (i = 0; i < lista.length; i++) {
        tabela += `<tr> <td>${lista[i].nome}</td> <td>${lista[i].descricao}</td> </tr>`
    }

    tabela += `</table>`;
    document.getElementById("alarme").innerHTML = tabela;
}