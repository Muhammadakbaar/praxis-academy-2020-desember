package latihan.dua;

import fj.data.Option;
import static fj.Show.intShow;
import static fj.Show.optionShow;
import static fj.data.Option.none;
import static fj.data.Option.some;
import static fj.function.Integers.add;

public final class Option_map {
    public static void mulai() {
        final Option<Integer> o1 = some(7);
        final Option<Integer> o2 = none();
        final Option<Integer> p1 = o1.map(add.f(42));
        final Option<Integer> p2 = o2.map(add.f(42));

        final Option<Integer> p3 = o1.map(i -> i+42);
        final Option<Integer> p4 = o2.map(i -> i+42);

        optionShow(intShow).println(p1);
        optionShow(intShow).println(p2);

        optionShow(intShow).println(p3);
        optionShow(intShow).println(p4);
    }
}