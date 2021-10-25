package core18;

import java.util.function.BiFunction;
class Arithmetic{
    public static int add(int a, int b){
        return a*b;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>Multiplier = Arithmetic::add;
        int result = Multiplier.apply(10, 20);
        System.out.println(" Multiply Using Static Method of 10 and 20 is = "+ result);
    }
}
