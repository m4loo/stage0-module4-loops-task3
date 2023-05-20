package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String number = "";
        number += t;
        int result = 0;
        for (int i = 1; i <= number.length(); i++) {
            result += t % 10;
            t /= 10;
        }
        System.out.println(Math.abs(result));
    }
}
