function readData() {
    let json = '{ "age": 30 }';
  
    try {
      // ...
      blabla(); // error!
    } catch (e) {
      // ...
      if (e.name != 'SyntaxError') {
        throw e; // rethrow (don't know how to deal with it)
      }
    }
  }
  
  try {
    readData();
  } catch (e) {
    alert( "External catch got: " + e ); // caught it!
  }