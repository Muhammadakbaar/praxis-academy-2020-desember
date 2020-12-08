package math.functions;

import static java.lang.Math.abs;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // todo: add simple functions to the function map (abs, sng, increment, decrement, square)


        // absolute
        intFunctionMap.addFunction("absolute", i -> Math.abs(i));
        // signum
        intFunctionMap.addFunction("signum", i -> (i!=0) ? i/abs(i) : 0);
        // increment
        intFunctionMap.addFunction("increment", i -> i+1 );
        // decrement
        intFunctionMap.addFunction("decrement", i -> i-1);
        // square
        intFunctionMap.addFunction("square", i -> i*i);
        return intFunctionMap;
    }
}
