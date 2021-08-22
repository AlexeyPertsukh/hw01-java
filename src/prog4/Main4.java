import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
	// write your code here
    double      carMiles;
    double      carHalon;
    double      carCost;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пробег автомобиля в американских милях:");
        carMiles = sc.nextInt();

        System.out.println("Введите расход топлива автомобиля в галонах на милю:");
        carHalon = sc.nextInt();

        System.out.println("Введите стоимость автомобиля $:");
        carCost = sc.nextInt();

        //перевод в европейскую систему
        System.out.println("Пробег автомобиля: " + carMiles * 1.61 + "км");     //формул: http://www.for6cl.uznateshe.ru/mili-v-kilometry/

        System.out.println("Расход топлива автомобиля: " + ( 378.5 / ( carHalon * 1.609 )) + " литров на 100 км" );  // формула: https://planetcalc.ru/4357/

        System.out.println("Стоимость автомобиля: " + carCost * 28.3 + " грн");



    }
}
