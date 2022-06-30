package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        System.out.println("Игра: угадай число_2\n");
        Scanner scan = new Scanner(System.in);
        String choice = "yes";
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            if ("yes".equals(choice)) {
                game.play();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            choice = scan.nextLine();    
        } while(!"no".equals(choice));
    }
}