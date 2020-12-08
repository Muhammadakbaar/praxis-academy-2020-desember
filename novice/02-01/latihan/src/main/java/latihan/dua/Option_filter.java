package latihan.dua;

import fj.F;
import fj.data.Option;
import static fj.Show.intShow;
import static fj.Show.optionShow;
import static fj.data.Option.none;
import static fj.data.Option.some;
import static fj.function.Integers.even; 

public final class Option_filter {
    public static void mulai() {
        final Option<Integer> o1 = some(7);
        final Option<Integer> o2 = none();
        final Option<Integer> o3 = some(8);

        final Option<Integer> o4 = o1.filter(even);
        final Option<Integer> o5 = o2.filter(even);
        final Option<Integer> o6 = o3.filter(even);

        F<Integer, Boolean> f = i -> i % 2 ==0;
        final Option<Integer> o7 = o1.filter(f);
        final Option<Integer> o8 = o2.filter(f);
        final Option<Integer> o9 = o3.filter(f);

        optionShow(intShow).println(o4);// outputnya none karena 7 angka ganjil/ 7%2 != 0
        optionShow(intShow).println(o5);// outputnya none
        optionShow(intShow).println(o6);// outputnya some(8) karen angka genapa / 8%2 == 0
    }
}