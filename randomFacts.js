// Wait for the DOM to fully load before executing the script
document.addEventListener('DOMContentLoaded', function() {
  // Attach event listeners and initialize random fact
  document.getElementById("buttonShuffle").addEventListener('click', randomFact);
  randomFact();
});

function randomFact() {
  // Generate a random index
  var random = Math.floor(Math.random() * 4);

  // Get all elements with the class 'funfact'
  var funfacts = document.getElementsByClassName('funfact');

  // Hide all funfacts
  for (var i = 0; i < funfacts.length; i++) {
    funfacts[i].style.display = 'none';
  }

  // Display the selected random funfact
  funfacts[random].style.display = 'block';
}

