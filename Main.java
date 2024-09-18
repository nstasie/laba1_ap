import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Обчисленя n-го числа Люка за допомогою рекурсії
     *
     * @param n індекс числа Люка
     * @return значення n-го числа Люка
     */
    public static int calculateLucas(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;
        return calculateLucas(n - 1) + calculateLucas(n - 2);
    }

    /**
     * Головний метод. Збирає дані, обчислює числа Люка та рахує кількість трикутних чисел
     *
     * @param args Аргументи з командного рядка, перше з яких вказує на кількість чисел Люка для обчислення
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M;
        
        if (args.length > 0) {
            M = Integer.parseInt(args[0]);
        } else {
            // Якщо аргументи не передано, просимо користувача ввести
            System.out.print("Введіть кількість чисел Люка: ");
            M = scanner.nextInt();
        }

        List<LucasNumber> lucasNumbers = new ArrayList<>();

        // Змінна для підрахунку трикутних чисел
        int counter= 0;

        // Обчислення і додавання чисел Люка до списку
        for (int i = 0; i < M; i++) {
            int value = calculateLucas(i);
            LucasNumber l_num = new LucasNumber(i, value);
            lucasNumbers.add(l_num);

            // Якщо число є трикутним, збільшуємо лічильник
            if (l_num.is_triangular()) {
                counter++;
            }
        }

        System.out.println("Перші " + M + " чисел Люка:");
        for (LucasNumber lucas : lucasNumbers) {
            System.out.println(lucas);
        }

        System.out.println("\nКількість трикутних чисел серед перших " + M + " чисел Люка: " + counter);

        scanner.close();
    }
}
