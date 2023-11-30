import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współczynniki a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1;
        double x2;
        double x0;
        if (a == 0 & b != 0) {

            x0 = -c / b;
            System.out.println("Pierwiastek jest równy: " + x0);


        } else if (c == 0 & a != 0) {
            x1 = 0;
            x2 = -b / (2 * a);
            System.out.println("Pierwszy pierwiastek jest równy: " + x1);
            System.out.println("Drugi pierwiastek jest równy: " + x2);
        } else {
            if (delta < 0) {
                System.out.println("Równanie nie ma pierwiastków");
            } else if (delta == 0) {
                x0 = -b / (2 * a);
                System.out.println("pierwiastek 0 jest równy: " + x0);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Pierwszy pierwiastek jest równy: " + x1);
                System.out.println("Drugi pierwiastek jest równy: " + x2);
            }
        }


    }

}
