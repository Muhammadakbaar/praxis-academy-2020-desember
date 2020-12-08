package latihan.dua;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.function.Integers.add;
import static fj.Show.arrayShow;
import static fj.Show.intShow;

public final class Array_map {
    public static void mulai() {
        final Array<Integer> a = array(1,2,3);
        final Array<Integer> b = a.map(add.f(42));
        final Array<Integer> c = a.map(i -> i +10);

        arrayShow(intShow).println(b); // outputnya {43, 44, 45} karena {1+42, 2+42, 3+42}
        arrayShow(intShow).println(c); // outputnya {11,12,13} karena {1+10,2+10,3+10}
    }
}