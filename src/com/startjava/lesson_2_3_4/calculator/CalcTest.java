package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator test\n");
        String choice = "yes";
        do {
            if ("yes".equals(choice)) {
                System.out.println("Введите первое число, операцию и второе число");
                calc.setData(scanner.nextLine());
                calc.expression();
                calc.changeMeaning();
                calc.calculate();
                String format = calc.getResult() % 1 == 0 ? "%.0f %c %.0f = %.0f" : "%.0f %c %.0f = %.2f";
                System.out.printf(format, calc.getNum1(), calc.getSign(), calc.getNum2(), calc.getResult());
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();     
        } while (!"no".equals(choice));
    } 
}


