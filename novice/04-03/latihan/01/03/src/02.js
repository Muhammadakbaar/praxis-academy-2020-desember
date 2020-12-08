try {

    alert('Start of try runs');  // (1) <--
  
    lalala; // error, variable is not defined!
  
    alert('End of try (never reached)');  // (2)
  
  } catch(err) {
  
    alert(`Error has occurred!`); // (3) <--
  
  }