function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "index.html";
    }
}

function buscarPorData() {

    let dataInicial = document.getElementById("dtIni").value
    let dataFinal = document.getElementById("dtFim").value

    let datas = {
        dtIni: dataInicial,
        dtFim: dataFinal
    }

    let msg = {
        method: 'POST',
        body: JSON.stringify(datas),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/evento/data", msg)
        .then(res => tratarRetorno(res))
}

function tratarRetorno(resposta) {
    if (resposta.status == 200) {
        resposta.json().then(res => listarPorData(res));
    } else {
        document.getElementById("evento").innerHTML = "Nenhum evento encontrado!";
    }
}

function listarPorData(lista) {
    let tabela = `<table class="table" table-sm> <tr> <th>Data</th> <th>Alarme</th> <th>Equipamneto</th></tr>`;

    for (i = 0; i < lista.length; i++) {
        tabela += `<tr> <td>${lista[i].dataEvt}</td> <td>${lista[i].alarme.nome}</td> <td>${lista[i].equipamento.hostname}</td></tr>`
    }



    tabela += `</table>`;
    document.getElementById("evento").innerHTML = tabela;

}

function voltar() {
    window.location="interna.html";
    
    
}

