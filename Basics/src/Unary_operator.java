public class Unary_operator {
    public static void main(String[] args) {
        int a = 6;
        int b = -a; // -6
        System.out.println(b);

        // Instantiate Increment class and call its method
        Increment incrementExample = new Increment();
        incrementExample.incrementValues();

        // Instantiate Decrement class and call its method
        Decrement decrementExample = new Decrement();
        decrementExample.DecrementValues();
    }
}

class Increment {
    void incrementValues() {
        int a = 2;
        System.out.println(a++); // 2 (a becomes 3 after this line)
        System.out.println(a);   // 3
        System.out.println(++a); // 4 (a is incremented before this line)
    }
}

class Decrement {
    void DecrementValues() {
        int b = 1;
        System.out.println(b--); // 2 (b becomes 1 after this line)
        System.out.println(b);   // 1
        System.out.println(--b); // 0 (b is decremented before this line)
    }
}
