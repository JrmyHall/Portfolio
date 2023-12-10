"use strict";

// Get Submit Button
let submitButton = document.getElementById('submitButton');
// Get Password Fields
let pwd = document.getElementById('pwd');
let pwd2 = document.getElementById('pwd2');

// Add Listener To Submit Button
submitButton.addEventListener('click', validatePasswords);

// Function to validate passwords
function validatePasswords() {
    // Check if the password meets the pattern requirement
    if (pwd.validity.patternMismatch) {
        // Set custom validation message
        pwd.setCustomValidity('Your password must be at least 8 characters with at least one letter and one number.');
    } else if (pwd.value !== pwd2.value) {
        // Check if password matches confirm password
        // Set custom validation message
        pwd.setCustomValidity('Your passwords must match.');
    } else {
        // If everything is valid, clear custom validation message
        pwd.setCustomValidity('');
    }
}
