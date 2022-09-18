package Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите данные в формате: Число действие число. Пробелы обязательны");
        System.out.println("Программа принимает как арабские, так и римские цифры");
        System.out.println("Числа от 1 до 10, или от I до X включительно");

        List <String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String retval : input.split(" ")) // 1.1 разделяем строку на элементы
            {
                list.add(retval); // 1.2 присвоим всем элемантам в листе
            }
            Arithmetic.arithmetic(list.get(0), list.get(1), list.get(2)); // Вызываем метод с переданными в параметрах элементами из 1.2
        } catch (Exception e) {
            System.out.println("Введены не верные данные, внимательно прочитай условия");

        }
        System.exit(0);
    }

}
