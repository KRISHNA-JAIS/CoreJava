package core18;

import java.util.function.BiFunction;
class Addition{
    public int add(int a, int b){
        return a+b;
    }
}

public class InstanceMethod{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>adder = new Addition()::add;
        int result = adder.apply(10, 20);
        System.out.println("Addition Using Instance Method of 10 and 20 is = "+ result);
    }
}
