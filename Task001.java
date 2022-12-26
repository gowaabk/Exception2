/*
 * Метод запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        System.out.println(GetFloat());
    }

    public static float GetFloat() {
        Scanner input = new Scanner(System.in);
        float num;

        System.out.println("Введите число -->  ");
        while (true) {
            try {
                num = Float.valueOf(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите дробное число");
            }
        }
        return num;
    }
}