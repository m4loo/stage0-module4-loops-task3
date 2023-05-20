package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int nine = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            result += (nine * 10) + 9;
            nine = nine * 10 + 9;
        }
        System.out.println(result);
    }
}
