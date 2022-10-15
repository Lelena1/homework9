import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //Homework 9 Task 1
    // Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    // в формате: «Сумма трат за месяц составила … рублей».
    public static void task1() {
        System.out.println("Homework 9 Task 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составит " + sum + " рублей\n");
    }


    //Homework 9 Task 2
    // Следующая задача — найти минимальную и максимальную трату за день.
    // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    // в формате: «Минимальная сумма трат за день составила … рублей.
    // Максимальная сумма трат за день составила … рублей».
    public static void task2() {
        System.out.println("Homework 9 Task 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей\n");
    }

    //Homework 9 Task 3
    // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    // Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех
    // трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
    // «Средняя сумма трат за месяц составила … рублей».
    //**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым,
    // а дробным числом).
    public static void task3() {
        System.out.println("Homework 9 Task 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        float average = sum / (float) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей\n");
    }

    //Homework 9 Task 4
    // В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников
    // начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
    //Данные с именами сотрудников хранятся в виде массива символов (char[]).
    // Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников
    // в корректном виде. В качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    // В результате в консоль должно быть выведено "Ivanov Ivan".
    // **Важно**: не используйте дополнительные массивы для решения этой задачи.
    // Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
    public static void task4() {
        System.out.println("Homework 9 Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}