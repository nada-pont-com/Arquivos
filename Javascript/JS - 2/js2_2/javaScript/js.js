/*
Author:Vinicius D. O. Gonçalves
Data:21/06/2017
*/

var funcionarios;
funcionarios = "";


function cadastrarFuncionarios(){
  var funcionario;
  funcionario = document.frmcadfuncionario.txtnome.value;
  document.frmcadfuncionario.txtnome.focus();
  if (funcionario!="") {
    funcionarios = funcionarios + "\n" +funcionario;
    alert("Cadastro efetuado com sucesso.");
  }else {
    alert("informe um nome.");
    document.frmcadfuncionario.txtnome.focus();
  }
  document.frmcadfuncionario.txtnome.value="";
}

function visualizarFuncionarios(){
  alert("lista:"+funcionarios);
}
