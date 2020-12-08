package latihan.satu;

public class SleepMessages {
    public static void mulai()
        throws InterruptedException {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }


        // Catch InterruptedException 1
        for (int i = 0; i < importantInfo.length; i++) {
            // Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(importantInfo[i]);
        }

        // InterruptedException handler 2
        /* for (int i = 0; i < importantInfo.length; i++) {
            heavyCrunch(importantInfo[i]);
            if (Thread.interrupted()) {
                // We've been interrupted: no more crunching.
                throw new InterruptedException();
                return;
            }
        } */
        
        

    }
}

