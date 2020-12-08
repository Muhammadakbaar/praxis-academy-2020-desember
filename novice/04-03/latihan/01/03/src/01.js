try {

    alert('Start of try runs');  // (1) <--
  
    // ...no errors here
  
    alert('End of try runs');   // (2) <--
  
  } catch(err) {
  
    alert('Catch is ignored, because there are no errors'); // (3)
  
  }