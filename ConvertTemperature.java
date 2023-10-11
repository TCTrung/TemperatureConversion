import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("---MENU---");
            System.out.println("1.Chuyen C sang F.");
            System.out.println("2.Chuyen F sang C.");
            System.out.println("0.Exit.");
            System.out.println("Nhap lua chon :");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("Nhap C :");
                    celsius = scanner.nextInt();
                    System.out.println("Chuyen thanh :" + celsiusToFahrenheit(celsius));
                    break;
                case 2 :
                    System.out.println("Nhap F :");
                    fahrenheit = scanner.nextInt();
                    System.out.println("Chuyen thanh :" + fahrenheitToCelsius(fahrenheit));
                    break;
                    case 0:
                        System.exit(0);
            }

        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
