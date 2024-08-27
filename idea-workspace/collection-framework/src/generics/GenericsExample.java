package generics;

class Calculator<T>{

    private T value;

    public Calculator(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }

    public T doubleValue(){
        return switch (value){
            case Integer i -> (T)Integer.valueOf(i*2);
            case String str -> (T)(str+str);

            default -> value;
        };
    }

}

public class GenericsExample {

    public static void main(String[] args) {
        Calculator<Integer> calc1 = new Calculator<>(10);

        System.out.println(calc1.doubleValue());

        Calculator<? super Number> calc2 = new Calculator<>(10);

        System.out.println(calc2.doubleValue());


    }
}
