/* Synchronous execution usually refers to code executing in sequence. 
Asynchronous execution refers to execution that doesn't run in the sequence it appears in the code. 
In the following example, the synchronous operation causes the alerts to fire in sequence. 
In the async operation, while alert(2) appears to execute second, it doesn't. */

// Synchronous: 1, 2, 3
alert(1);
alert(2);
alert(3);

// Asynchronous 1, 3, 2
alert(1);
setTimeout(() => alert(2), 0);
alert(3);

/* 

    Blocking vs Non-blocking
    Blocking refers to operations that block further execution until that operation finishes. Non-blocking
    refers to code that doesn't block execution. In the given example, localStorage is a blocking
    operation as it stalls execution to read. On the other hand, fetch is a non-blocking operation
    as it does not stall alert(3) from execution.

*/

// Blocking: 1, ... 2
alert(1);
var value = localStorage.getItem('foo');
alert(2);

// Non-blocking: 1, 3, ... 2
alert(1);
fetch('example.com').then(() => alert(2));
alert(3);

/*

    Advantages
    One advantage of non-blocking, asynchronous operations is that you can maximize the usage of a
    single CPU as well as memory.

    Synchronous, blocking example
    An example of synchronous, blocking operations is how some web servers like ones in Java or PHP
    handle IO or network requests. If your code reads from a file or the database, your code "blocks"
    everything after it from executing. In that period, your machine is holding onto memory and processing
    time for a thread that isn't doing anything.

    In order to cater other requests while that thread has stalled depends on your software. What most
    server software do is spawn more threads to cater the additional requests. This requires more memory
    consumed and more processing.

    Asynchronous, non-blocking example
    Asynchronous, non-blocking servers - like ones madi in Node - only use one thread to service all
    requests. This means an instance of Node makes the most out of a single thread. The creators
    designed it with the premise that the I/O and network operations are the bottleneck.

    When requests arrive at the server, they are serviced one at a time. However, when the code serviced
    needs to query the DB for example, it sends the callback to a second queue and the main thread will
    continue running (it doesn't wait). Now when the DB operation completes and returns, the
    corresponding callback pulled out of the second queue and queued in a third queue where they are
    pending execution. When the engine gets a chance to execute something else (like when the execution 
    stack is emptied), it picks up a callback from the third queue and executes it.

*/