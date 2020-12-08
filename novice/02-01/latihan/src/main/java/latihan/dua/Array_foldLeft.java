package latihan.dua;

import fj.F;
import fj.data.Array;
import static fj.data.Array.array;
import static fj.function.Integers.add;

public final class Array_foldLeft {
    public static void mulai() {
        final Array<Integer> a = array(97,44,67,3,22,90,1,77,98,1078,6,64,6,79,42);
        final int b = a.foldLeft(add, 0);

        F<Integer, F<Integer, Integer>> add2 = i -> (j -> i+j);
        final int c = a.foldLeft(add2, 26);
        System.out.println(b); //outputnya 1774 karena (0+97+44+67+3+22+90+1+77+98+1078+6+64+6+79+42)
        System.out.println(c); //outputnya 1800 karena (26+97+44+67+3+22+90+1+77+98+1078+6+64+6+79+42 = 1800)
    }
}