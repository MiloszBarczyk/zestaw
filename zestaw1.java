import java.util.Scanner;

//zad1
public class zestaw1 {


    public static class Temperatura {
        public static void main(String[] args) {
            double c;
            try (Scanner input = new Scanner(System.in)) {

                System.out.print("Podaj temperaturę w Celsjuszach: ");
                c = input.nextDouble();
            }

            double f = 1.8 * c + 32;

            System.out.println("Temperatura w Fahrenheicie: " + f);
        }
    }
}

//zad2


class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = input.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = input.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = input.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);
    }
}

//zad3

class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wagę (kg): ");
        double waga = input.nextDouble();

        System.out.print("Podaj wzrost (m): ");
        double wzrost = input.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("waga prawidłowa");
        } else {
            System.out.println("nadwaga");
        }
    }
}
//zad4

class Podatek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj dochód: ");
        double dochod = input.nextDouble();

        double podatek;

        if (dochod <= 85528) {
            podatek = 0.18 * dochod - 556.02;
            if (podatek < 0) podatek = 0; // podatek nie może być ujemny
        } else {
            podatek = 14839.02 + 0.32 * (dochod - 85528);
        }

        System.out.println("Należny podatek: " + podatek + " PLN");
    }
}

//zad5


class RatyAGD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cena = 0;
        int liczbaRat = 0;

        do {
            System.out.print("Podaj cenę towaru (100 - 10000 zł): ");
            cena = input.nextDouble();
            if (cena < 100 || cena > 10000) {
                System.out.println("Błędna cena! Spróbuj ponownie.");
            }
        } while (cena < 100 || cena > 10000);


        do {
            System.out.print("Podaj liczbę rat (6 - 48): ");
            liczbaRat = input.nextInt();
            if (liczbaRat < 6 || liczbaRat > 48) {
                System.out.println("Błędna liczba rat! Spróbuj ponownie.");
            }
        } while (liczbaRat < 6 || liczbaRat > 48);


        double oprocentowanie;
        if (liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }


        double kwotaDoSplaty = cena + (cena * oprocentowanie);


        double rataMiesieczna = kwotaDoSplaty / liczbaRat;

        System.out.printf("Miesięczna rata wynosi: %.2f zł\n", rataMiesieczna);
    }
}

//zad6

class Prostykalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Prosty kalkulator - wykonuje działania: +, -, *, /");

        System.out.print("Podaj pierwszą liczbę: ");
        double a = input.nextDouble();

        System.out.print("Podaj symbol działania (+, -, *, /): ");
        char operacja = input.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double b = input.nextDouble();

        double wynik;
        boolean blad = false;

        switch (operacja) {
            case '+':
                wynik = a + b;
                System.out.println("Wynik: " + wynik);
                break;
            case '-':
                wynik = a - b;
                System.out.println("Wynik: " + wynik);
                break;
            case '*':
                wynik = a * b;
                System.out.println("Wynik: " + wynik);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Błąd: dzielenie przez zero jest niemożliwe!");
                } else {
                    wynik = a / b;
                    System.out.println("Wynik: " + wynik);
                }
                break;
            default:
                System.out.println("Błąd: nieprawidłowy symbol działania!");
                break;
        }

        System.out.println("Naciśnij Enter, aby zakończyć...");
        input.nextLine();
        input.nextLine();
    }
}