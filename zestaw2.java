import java.util.Random;
import java.util.Scanner;
//zad1
class NieparzysteLiczby {
    public static void main(String[] args) {
        // Utworzenie obiektu Scanner do odczytu danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Prośba o podanie liczby całkowitej dodatniej
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int liczba = scanner.nextInt();

        // Sprawdzenie, czy liczba jest dodatnia
        if (liczba > 0) {
            System.out.println("Liczby nieparzyste mniejsze lub równe " + liczba + " to:");

            // Pętla wyświetlająca liczby nieparzyste
            for (int i = 1; i <= liczba; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Proszę podać liczbę całkowitą dodatnią.");
        }

        // Zamknięcie obiektu scanner
        scanner.close();
    }
}

//zad2

class SumaCiagu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę A (mniejszą od B): ");
        int A = scanner.nextInt();
        System.out.print("Podaj liczbę B (większą od A): ");
        int B = scanner.nextInt();


        if (A >= B) {
            System.out.println("A musi być mniejsze od B!");
        } else {

            int sumaWhile = 0;
            int i = A;
            while (i <= B) {
                sumaWhile += i;
                i++;
            }
            System.out.println(sumaWhile);


            int sumaDoWhile = 0;
            i = A;
            do {
                sumaDoWhile += i;
                i++;
            } while (i <= B);
            System.out.println(sumaDoWhile);


            int sumaFor = 0;
            for (i = A; i <= B; i++) {
                sumaFor += i;
            }
            System.out.println(sumaFor);
        }


        scanner.close();
    }
}

//zad3

class PotegiDwojki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Proszę podać liczbę całkowitą dodatnią!");
        } else {

            int potega = 1;


            while (potega <= n) {
                System.out.println(potega);
                potega *= 2;
            }
        }


        scanner.close();
    }
}

//zad4

class SumaLiczb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int suma = 0;
        int liczba;


        do {
            System.out.print("Podaj liczbę (0 kończy wprowadzanie): ");
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);


        System.out.println("Suma wszystkich podanych liczb wynosi: " + suma);


        scanner.close();
    }
}

//zad5

class StatystykiLiczb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int liczba;


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        int liczbaLiczb = 0;
        int suma = 0;


        System.out.println("Podaj ciąg liczb całkowitych. Wprowadź 0, aby zakończyć.");
        do {
            System.out.print("Podaj liczbę: ");
            liczba = scanner.nextInt();

            if (liczba != 0) {
                suma += liczba;
                liczbaLiczb++;


                if (liczba > max) {
                    max = liczba;
                }


                if (liczba < min) {
                    min = liczba;
                }
            }
        } while (liczba != 0);


        if (liczbaLiczb > 0) {

            int sumaMaxMin = max + min;


            double srednia = suma / (double)liczbaLiczb;


            System.out.println("Największa liczba: " + max);
            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Suma największej i najmniejszej liczby: " + sumaMaxMin);
            System.out.println("Średnia arytmetyczna: " + srednia);
        } else {
            System.out.println("Nie wprowadzono żadnych liczb!");
        }


        scanner.close();
    }
}

//zad6



class GraZaDuzoZaMalo {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int wylosowanaLiczba = random.nextInt(100) + 1;


        int proba;

        System.out.println("Witaj w grze 'Za dużo, za mało'!");
        System.out.println("Spróbuj odgadnąć liczbę, którą komputer wylosował. Liczba jest z zakresu 1-100.");


        do {
            System.out.print("Podaj swoją próbę: ");
            proba = scanner.nextInt();

            if (proba > wylosowanaLiczba) {
                System.out.println("Podałeś za dużą wartość.");
            } else if (proba < wylosowanaLiczba) {
                System.out.println("Podałeś za małą wartość.");
            } else {
                System.out.println("Gratulacje! Odgadłeś liczbę.");
            }
        } while (proba != wylosowanaLiczba);


        scanner.close();
    }
}

//zad7

class RysujProstokat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj znak wypełnienia prostokąta: ");
        char znak = scanner.next().charAt(0);
        System.out.print("Podaj współrzędną x lewego górnego rogu: ");
        int x = scanner.nextInt();
        System.out.print("Podaj współrzędną y lewego górnego rogu: ");
        int y = scanner.nextInt();
        System.out.print("Podaj długość boku a (szerokość prostokąta): ");
        int a = scanner.nextInt();
        System.out.print("Podaj długość boku b (wysokość prostokąta): ");
        int b = scanner.nextInt();


        for (int i = 1; i <= y + b - 1; i++) {
            for (int j = 1; j <= x + a - 1; j++) {

                if (i >= y && i < y + b && j >= x && j < x + a) {
                    System.out.print(znak);
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }


        scanner.close();
    }
}

//zad8

class Choinka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj wysokość choinki (n > 0): ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Wysokość choinki musi być liczbą całkowitą większą od 0!");
        } else {

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }


                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }


                System.out.println();
            }


            for (int i = 0; i < n - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


        scanner.close();
    }
}

//zad9

class SumaCyfr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();


        int sumaCyfr = 0;


        int sumaParzystych = 0;
        int sumaNieparzystych = 0;


        int liczbaParzystych = 0;
        int liczbaNieparzystych = 0;


        int temp = Math.abs(liczba);


        while (temp > 0) {
            int cyfra = temp % 10;
            sumaCyfr += cyfra;

            if (cyfra % 2 == 0) {
                sumaParzystych += cyfra;
                liczbaParzystych++;
            } else {
                sumaNieparzystych += cyfra;
                liczbaNieparzystych++;
            }

            temp /= 10;
        }


        System.out.println("Suma cyfr liczby: " + sumaCyfr);


        double sredniaParzystych = (liczbaParzystych > 0) ? (double) sumaParzystych / liczbaParzystych : 0;
        double sredniaNieparzystych = (liczbaNieparzystych > 0) ? (double) sumaNieparzystych / liczbaNieparzystych : 0;


        double stosunek = (sredniaNieparzystych != 0) ? sredniaParzystych / sredniaNieparzystych : 0;


        System.out.println("Średnia arytmetyczna cyfr parzystych: " + sredniaParzystych);
        System.out.println("Średnia arytmetyczna cyfr nieparzystych: " + sredniaNieparzystych);
        System.out.println("Stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych: " + stosunek);


        scanner.close();
    }
}

//zad10

class DzielnikiLiczby {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();


        System.out.print("Dzielniki liczby " + liczba + " to: ");


        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                System.out.print(i + " ");
            }
        }


        scanner.close();
    }
}

//zad11

class LiczbaPierwsza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę całkowitą (n > 1): ");
        int n = scanner.nextInt();


        if (n <= 1) {
            System.out.println("Liczba musi być większa od 1.");
        } else {

            boolean jestPierwsza = true;


            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    jestPierwsza = false;
                    break;
                }
            }


            if (jestPierwsza) {
                System.out.println(n + " jest liczbą pierwszą.");
            } else {
                System.out.println(n + " nie jest liczbą pierwszą.");
            }
        }


        scanner.close();
    }
}