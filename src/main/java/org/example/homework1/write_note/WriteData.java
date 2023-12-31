package org.example.homework1.write_note;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Этот класс записывает данные
 */
public class WriteData {
    private static String pathProject = System.getProperty("user.dir");
    private static String pathFile = pathProject.concat(
            "\\src\\main\\resources\\text.txt"
    );

    /**
     * Этот метод получает строковую переменную и сохраняет данные
     * в файл
     * @param text любой текст
     */
    public static void writeToFile(String text) {
        String note = getString(text);
        File file = new File(pathFile);
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("Запись в файл:");
                fileWriter.append(note);
//                fileWriter.append("\n");
                fileWriter.close();
                System.out.println("Data is written");
            }
        } catch (Exception e) {

        } finally {
            System.out.println("---------------");
        }
    }

    private static String getString(String text) {
        StringBuilder data = new StringBuilder();
                data.append(LocalDateTime.now().getDayOfMonth());
                data.append(".");
                data.append(LocalDateTime.now().getMonthValue());
                data.append(".");
                data.append(LocalDateTime.now().getYear());
                data.append(" -> ");
                data.append(text);
                data.append("\n");
        return String.valueOf(data);
    }
}