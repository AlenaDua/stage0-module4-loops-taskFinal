package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int sum = 1;
        for (int i = 1; i <= power; i++) {
            sum = sum * numberToPrint;
        }
        System.out.print(sum);
        System.out.println();

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
