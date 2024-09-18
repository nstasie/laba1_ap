public class LucasNumber {
    private int index;
    private int value;

    /**
     * Конструктор для створення числа Люка
     *
     * @param index Індекс числа Люка в послідовності
     * @param value Значення числа Люка
     */
    public LucasNumber(int index, int value) {
        this.index = index;
        this.value = value;
    }

    /**
     * Отримання значення числа Люка
     *
     * @return value значення числа Люка
     */
    public int getValue() {
        return value;
    }

    /**
     * Отримання індексу числа Люка
     *
     * @return індекс числа Люка
     */
    public int getIndex() {
        return index;
    }

    /**
     * Перевірка, чи є число трикутним
     *
     * @return true, якщо число є трикутним, а false-навпаки
     */
    public boolean is_triangular() {
        int n = 0;
        int triangularNumber = 0;
        while (triangularNumber < value) {
            n++;
            triangularNumber = n * (n + 1) / 2;
        }
        return triangularNumber == value;
    }

    public String toString() {
        return index + "-е число Люка" + " = " + value + (is_triangular() ? " (Трикутне число)" : " (НЕ трикутне число)");
    }
}
