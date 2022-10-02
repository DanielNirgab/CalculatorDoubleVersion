package Calc;
import Calc.Action.*;

public class Arithmetic {
    public static void arithmetic (String firstString, String action, String secondString) // в параметр подставляются Строки из массива, в который мы передали введеные значения
    {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        boolean flag = false;
        try { // проверяем на арабские или римские цифры
            num1 = Integer.parseInt(firstString);
            num2 = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                num1 = Converter.toArabic(firstString);
                num2 = Converter.toArabic(secondString);
                flag = true; // помечаем для конвертера в римские
            } catch (Exception e1) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) { // Из условия задачи
            System.out.println("Вы ввели не верные данные");
            System.exit(0);
        }
        Common common;
        if (action.equals("-")) {
            common = new Difference();
            result = common.invoke(num1, num2);
        }
        if (action.equals("+")) {
            common = new Summ();
            result = common.invoke(num1, num2);
        }
        if (action.equals("*")) {
            common = new Product();
            result = common.invoke(num1, num2);
        }
        if (action.equals("/")) {
            common = new Quotient();
            result = common.invoke(num1, num2);
        }
        if (flag) {
            String roman = Converter.toRoman(result);
            System.out.println(roman);
        } else System.out.println(result);
    }
    }