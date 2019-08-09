/*
Autor: Vinicius D. O Gonçalves
Data: 19/06/2017
*/
/*
function soma(n1, n2){
  var resultado;
  if((!isNaN(n1))&&(!isNaN(n2))){
    resultado = n1+n2;
    return resultado;
  }else{
  return "DIGITE UM NÚMERO"
  }
}

var numero_1, numero_2, resultadofinal;

numero_1 = parseFloat(prompt("Digite um número"));
numero_2 = parseFloat(prompt("Digite outro número"));

resultadofinal = soma(numero_1, numero_2);
alert(resultadofinal);
*/
/*
function calculadora(numero1, numero2, operacao){
  var resultado;
  switch (operacao) {
    case "+":
      resultado = soma(numero1, numero2);
      break;
    case "-":
      resultado = subtracao(numero1, numero2);
      break;
    default:
      resultado = "Operador invalido";

  }
  return resultado;
}

function soma(num1, num2,){
  return num1+num2;
}

function subtracao(num1, num2){
  return num1+num2;
}

var n1, n2, op;

n1 = parseFloat(prompt("Digite um número:"));
n2 = parseFloat(prompt("Digite outro número:"));
op = prompt("Digite a operação desejada: [+/-]");

alert(calculadora(n1, n2, op));
*/
/*
function teste(n){
 if(n>10){
   return true;
 }else{
   return false;
 }
 alert("Hahaha");
}

var resposta;
resposta = teste(10);
alert(resposta);
*/

function validaTeste(){
  if(document.frmteste.txtnome.value==""){
    alert("Preencha o campo Nome!");
    document.frmteste.txtnome.focus();
  }else if (document.frmteste.txttelefone.value==""){
    alert("Preencha o campo Telefone!");
    document.frmteste.txttelefone.focus();
  }else if (document.frmteste.pwdsenha.value==""){
    alert("Preencha o campo da senha!");
    document.frmteste.pwdsenha.focus();
  }else {
    return true;
  }
  return false;
}


function calcular(){
  var n1, n2, op, resultado;
  n1 = parseFloat(document.frmcalculadora.txtn1.value);
  n2 = parseFloat(document.frmcalculadora.txtn2.value);
  op = document.frmcalculadora.setop.value;

  switch (op) {
    case "+":
      resultado = n1 + n2;
      break;
    case "-":
      resultado = n1 - n2;
      break;

  }
  document.frmcalculadora.txtresultado.value=resultado;
}
