public class Task002 {
    public static void main(String[] args) {
        Task2();
    }

    public static void Task2() {
        int[] intArray = new int[] { 9, 8, 7, 6, 4, 9, 8, 6, 4 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}