package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int result;
        int number1 = 0;
        int number2 = 1;

        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0) System.out.println(number1);
            if (i == 1) System.out.println(number2);
            if (i > 1) {
                result = number1 + number2;
                number1 = number2;
                number2 = result;
                System.out.println(result);
            }
        }
    }
}
