import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        Input();
    }

    public static void Input() {
        Scanner input = new Scanner(System.in);
        String str;
        while (true) {
            try {
                System.out.println("Введите не пустую строку --> ");
                str = input.nextLine();
                if (str.length() == 0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Строка пустая. ");
            }
        }
    }
}