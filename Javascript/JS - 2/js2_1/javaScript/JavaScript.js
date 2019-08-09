/*
Autor: Vinicius D. O Gonçalves
Data: 19/06/2017
*/
var quantit, valort;
valort = 0;
quantit = 0;

function estoque(){
  if (document.frmquantiValor.txtquanti.value==""){
    alert("Preencha o campo de quantidade!");
    document.frmquantiValor.txtquanti.focus();
    return false;
  }else if (document.frmquantiValor.txtvalor.value=="") {
    alert("Preencha o campo de Valor!");
    document.frmquantiValor.txtvalor.focus();
    return false;
  }else if (isNaN(document.frmquantiValor.txtvalor.value)){
    alert("Preencha o campo Valor somente com números!");
    document.frmquantiValor.txtvalor.focus();
    return false;
  }else if (isNaN(document.frmquantiValor.txtquanti.value)) {
    alert("Preencha o campo Quantidade somente com números!");
    document.frmquantiValor.txtquanti.focus();
    return false;
  }
  var quanti, valoru, valor;
  quanti = parseInt(document.frmquantiValor.txtquanti.value);
  valoru = parseFloat(document.frmquantiValor.txtvalor.value);
  valor = quanti*valoru;
  valort = valort+valor;
  quantit = quantit+quanti;
  document.frmquantiValor.txtvalor.value="";
  document.frmquantiValor.txtquanti.value="";
  alert("Efetuado com sucesso!")
}

function quanti(){
  alert(quantit);
}

function valor(){
  alert(valort);
}

function valorQuanti(){
  alert("O valor total é: "+valort +"\nA quantidade total é: "+quantit)
}

function zerar(){
  quantit = 0;
  valort = 0;
}
