function calculate() {
    var quantityInput = document.forms["myform"]["qty"];
    var costInput = document.forms["myform"]["Cost"];
    var resultOutput = document.forms["myform"]["textbox5"];
  
    var quantity = isNaN(quantityInput.value) || quantityInput.value === "" ? 0 : parseInt(quantityInput.value);
    var cost = isNaN(costInput.value) || costInput.value === "" ? 0 : parseFloat(costInput.value);
  
    resultOutput.value = quantity * cost;
  }
  