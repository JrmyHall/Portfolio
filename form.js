function formSubmit(form) {
	return false;
  }
  
  function onStringChange(s1, s2, output) {
	let value1 = s1.value;
	let value2 = s2.value;
  
	let result = "<span class=\"span-bold\">Result:&nbsp</span>";
	if (value1 < value2) {
	  result += "string1 is less than string2";
	} else if (value1 > value2) {
	  result += "string1 is greater than string2";
	} else {
	  result += "string1 is equal to string2";
	}
  
	output.innerHTML = result;
  }
  
  document.addEventListener('DOMContentLoaded', function() {
	let s1 = document.querySelector('#string1');
	let s2 = document.querySelector('#string2');
	let output = document.querySelector("#result-box");
  
	const handleStringChange = onStringChange.bind(this, s1, s2, output);
	const eventName = 'input';  // Changed to 'input' for a more immediate response
  
	s1.addEventListener(eventName, handleStringChange);
	s2.addEventListener(eventName, handleStringChange);
  });
  