package latihan.dua;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public final class Array_forall {
    public static void mulai() {
        final Array<String> a = array("hello", "There", "what", "day", "is", "it");
        final boolean b = a.forall(s -> fromString(s).forall(isLowerCase));
        System.out.println(b); //output false karena ada "There"(tidak huruf kecil semua)
    }
}