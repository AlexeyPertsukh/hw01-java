
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        final double    RATE_DOLLAR = 28.3;
        double          userMoney;
        double          userDollar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько грн. вы хотите поменять на $?");
        userMoney = sc.nextDouble();

        userDollar = userMoney / RATE_DOLLAR;

        System.out.println("Сегодня курс " + RATE_DOLLAR + " грн. за $." );
        System.out.println("За свои деньги вы можете купить " + userDollar + " $");
    }
}
