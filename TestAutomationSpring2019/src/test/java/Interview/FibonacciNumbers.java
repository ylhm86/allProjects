package Interview;

public class FibonacciNumbers {


    public static void main(String[] args) {

        fiboSequence(8);

        for (int idx = 0; idx <= 8; idx++) {

            System.out.print(fiboSequence(idx) + ", ");
        }

    }


    // Fibanacci Sequence

    public static int fiboSequence(int n) {

        if (n == 0) {
            return 0;
        }else if(n == 1) {
            return 1;
        }

        int num1 = 0;
        int num2 = 1;
        int fib = 0;

        for (int idx = 2; idx <= n; idx++) {

            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }

        return fib;
    }


}
