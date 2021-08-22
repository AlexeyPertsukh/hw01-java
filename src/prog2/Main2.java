import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // write your code here
        final double COST = 135;
        double userMoney;
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько у вас есть денег?");
        userMoney = sc.nextDouble();

        if (userMoney > COST) {
            System.out.println("Товар стоит " + COST + ", поэтому вы можете его купить.");
        } else {
            System.out.println("Товар стоит " + COST + ", поэтому вы НЕ можете его купить.");
        }

    }
}
