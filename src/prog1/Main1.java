import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
	// write your code here
        String  userName;
        int     userSex;

        Scanner sc = new Scanner(System.in);

        System.out.println("Как вас зовут?");
        userName = sc.nextLine();

        System.out.println("Введите свой пол: 1-мужчина, 2-женщина");
        userSex = sc.nextInt();

        if (userSex == 1) {
            System.out.println("Здравствуйте, господин " + userName);
        }
        else if (userSex == 2) {
            System.out.println("Здравствуйте, госпожа " + userName);
        }
        else {
            System.out.println("Вы неправильно ввели свой пол, попробуйте снова.");
        }
    }
}
