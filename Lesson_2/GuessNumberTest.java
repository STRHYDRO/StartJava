import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        System.out.println("Игра: угадай число_2\n");
        Scanner scan = new Scanner(System.in);
        // GuessNumber guessNumber = new GuessNumber();
        String choice = "yes";
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.nextLine(), 0);
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine(), 0);
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            if ("yes".equals(choice)) {
                guessNumber.randomNum();
                guessNumber.play();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            choice = scan.nextLine();    
        } while(!"no".equals(choice));
    }
}