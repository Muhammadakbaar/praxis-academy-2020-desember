package latihan.satu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FunctionExample {

    public static void mulai() {
        Function<Long, Long> adderLambda = (value) -> value + 3;
        Long hasil = adderLambda.apply((long)7);
        System.out.println("Hasil 7+3 menggunakan lambda = "+hasil);

        Predicate predicate = (value) -> value != null;
        Boolean cek = predicate.test("null");
        System.out.println(cek); //akan menampilkan true karena "null" != null

        UnaryOperator<Person> unaryOperator = 
            (person) -> {person.name = "New Name"; return person;};
        
        BinaryOperator<MyValue> binaryOperator =
        (value1, value2) -> { value1.add(value2); return value1; };

        Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
        Integer coba = supplier.get();
        System.out.println(coba);

        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(34);


        // AND(&&)
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX   = (text) -> text.endsWith("x");

        Predicate<String> startsWithAAndEndsWithX =
                (text) -> startsWithA.test(text) && endsWithX.test(text);

        String  input  = "A hardworking person must relax";
        boolean result = startsWithAAndEndsWithX.test(input);
        System.out.println(result);

        //AND .and()
        Predicate<String> startsWithA2 = (text) -> text.startsWith("A");
        Predicate<String> endsWithX2   = (text) -> text.endsWith("x");

        Predicate<String> composed2 = startsWithA2.and(endsWithX2);

        String input2 = "A hardworking person must relax";
        boolean result2 = composed2.test(input2);
        System.out.println(result2);

        //OR .or()
        Predicate<String> startsWithA3 = (text) -> text.startsWith("A");
        Predicate<String> endsWithX3   = (text) -> text.endsWith("x");

        Predicate<String> composed3 = startsWithA3.or(endsWithX3);

        String input3 = " hardworking person must relax sometimes";
        boolean result3 = composed3.test(input3);
        System.out.println(result3);

        // tambah dulu baru kali kali.compose(tambah)
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        Integer result4 = addThenMultiply.apply(3);
        System.out.println(result4);

        //kali dulu baru tambah kali.anThen(tambah)
        Function<Integer, Integer> multiply2 = (value) -> value * 2;
        Function<Integer, Integer> add2      = (value) -> value + 3;

        Function<Integer, Integer> multiplyThenAdd = multiply2.andThen(add2);

        Integer result5 = multiplyThenAdd.apply(3);
        System.out.println(result5);

        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        //long count = 
        stream
            .map((value) -> { return value.toLowerCase(); })
            .forEach(element -> {System.out.println(element);});
            //.count();

        //System.out.println("count = " + count);

        // /stream.forEach(element -> {System.out.println(element);});

    }
}

class Person {
    public String name;
}

class MyValue {

    Integer value1, value2;
    public MyValue(Integer value1, Integer value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public void add(MyValue value2) {
    }
    
}