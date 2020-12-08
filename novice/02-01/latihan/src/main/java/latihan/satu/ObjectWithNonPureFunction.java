package latihan.satu;
public class ObjectWithNonPureFunction{
    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
}
