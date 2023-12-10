// cost.js

// Function to calculate total cost for electric vehicle
function elec() {
        var kWhCost = parseFloat(document.getElementById("firstNumber").value);
        var batterySize = parseFloat(document.getElementById("secondNumber").value);
      
        var totalCost = kWhCost * batterySize;
        document.getElementById("Total Cost to Charge").innerText = "$" + totalCost.toFixed(2);
      }
      
      // Function to calculate total cost for gas vehicle
      function gas() {
        var pricePerGallon = parseFloat(document.getElementById("thirdNumber").value);
        var tankSize = parseFloat(document.getElementById("fourthNumber").value);
      
        var totalCost = pricePerGallon * tankSize;
        document.getElementById("Total Cost for Gas").innerText = "$" + totalCost.toFixed(2);
      }
      
      // Function to calculate cost difference between electric and gas vehicles
      function costDifference() {
        var chargeCost = parseFloat(document.getElementById("fifthNumber").value);
        var gasCost = parseFloat(document.getElementById("sixthNumber").value);
      
        var difference = chargeCost - gasCost;
        document.getElementById("Difference").innerText = "$" + difference.toFixed(2);
      }
      

