package org.example.homework1.input_note;

import java.util.Scanner;

/**
 * Класс считывает данные
 */
public class ReadData {
    /**
     * Этот метод запрашивает ввод с консоли текст
     * @return возвращает строковую переменную со значением,
     * которое было введено в консоль
     */
    public static String readFromConsole(){
        String data = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        data = sc.nextLine();
        sc.close();
        return data;
    }
}
