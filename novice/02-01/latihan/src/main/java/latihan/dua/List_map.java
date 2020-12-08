package latihan.dua;

import fj.data.List;
import static fj.data.List.list;
import static fj.function.Integers.add;
import static fj.Show.intShow;
import static fj.Show.listShow;

public final class List_map {
    public static void mulai(){
        final List<Integer> a = list(1,2,3);
        final List<Integer> b = a.map(add.f(42));
        final List<Integer> c = a.map(i -> i = 42);
        listShow(intShow).println(b); //outputnya [43,44,45] hampir sama denggan Array_map
    }
}