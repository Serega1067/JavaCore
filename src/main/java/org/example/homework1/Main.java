package org.example.homework1;

import org.example.homework1.input_note.ReadData;
import org.example.homework1.write_note.WriteData;

public class Main {
    public static void main(String[] args) {
        WriteData.writeToFile(ReadData.readFromConsole());

        // Компиляция кода
        // javac -sourcepath .\src\main\java\ -d out src\main\java\org\example\homework1\Main.java

        // Запуск кода
        // java -classpath .\out\ org\example\homework1\Main

        // Создание документации
        // javadoc -d docs -sourcepath .\src\main\java\ -cp out -subpackages org
    }
}