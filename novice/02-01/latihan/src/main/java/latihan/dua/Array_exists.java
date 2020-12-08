package latihan.dua;
import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public final class Array_exists {
    public static void mulai () {
        final Array<String> a = array("Hello", "There", "what", "DAY", "iS", "iT");
        final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));
        System.out.println(b); // true (because word "what" is all lower case, if we remove it it'll print false)
    }
}