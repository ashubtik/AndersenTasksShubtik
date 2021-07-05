package com.andersenlab.shubtik;

import java.util.Scanner;

public class TaskForAndersen {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
//      Task1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        int number = Integer.parseInt(INPUT_READER.nextLine());
        if (number > 7) {
            System.out.println("Привет");
        }
        System.out.println("=======================");

//      Task2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        String name = INPUT_READER.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println("=======================");

//      Task3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        System.out.println("Введите длину массива");
        try {
            int size = INPUT_READER.nextInt();
            int[] array = new int[size];
            System.out.println("Введите массив[" + size + "] целых чисел");
            for (int i = 0; i < size; i++) {
                array[i] = INPUT_READER.nextInt();
            }
            for (int i = 0; i < size; i++) {
                if (array[i] % 3 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Длина массива должна быть положительным числом");
        }
    }
}