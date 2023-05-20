package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = firstBoarder;
        for ( ; firstBoarder < secondBoarder; firstBoarder++) {
            result += firstBoarder + 1;
        }
        System.out.println(result);
    }
}
