/* package latihan.tiga.testing;

import latihan.tiga.jsr166y.ForkJoinExecutor;
import latihan.tiga.jsr166y.ForkJoinPool;
import latihan.tiga.algorithm.Problem;
import latihan.tiga.algorithm.Solver;

public class Test {

    public static void main(String[] args) {
        Problem test = new Problem();
        // check the number of available processors
        int nThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(nThreads);
        Solver mfj = new Solver(test.getList());
        ForkJoinExecutor pool = new ForkJoinPool(nThreads);
        pool.invoke(mfj);
        long result = mfj.getResult();
        System.out.println("Done. Result: " + result);
        long sum = 0;
        // check if the result was ok
        for (int i = 0; i < test.getList().length; i++) {
            sum += test.getList()[i];
        }
        System.out.println("Done. Result: " + sum);
    }
}

 */