import java.util.Scanner;
import java.util.Random;
//zad1
public class zestaw3 {public static class TablicaLiczb {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(21) - 10;
        }


        System.out.print("Wylosowane liczby:\n");
        for (int num : tablica) {
            System.out.print(num + " ");
        }
        System.out.println();


        int min = tablica[0];
        int max = tablica[0];
        int suma = 0;
        for (int num : tablica) {
            if (num < min) min = num;
            if (num > max) max = num;
            suma += num;
        }


        double srednia = (double) suma / tablica.length;


        int mniejszych = 0;
        int wiekszych = 0;
        for (int num : tablica) {
            if (num < srednia) mniejszych++;
            else if (num > srednia) wiekszych++;
        }


        System.out.println("Min: " + min + ", max: " + max);
        System.out.printf("Średnia: %.2f\n", srednia);
        System.out.println("Mniejszych od śr.: " + mniejszych);
        System.out.println("Większych od śr.: " + wiekszych);


        System.out.println("Liczby w odwrotnej kolejności:");
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
}

//zad2

class LiczbyIWystapienia {
    public static void main(String[] args) {
        int[] tablica = new int[20];
        Random rand = new Random();


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(10) + 1;
        }


        System.out.print("Wylosowane liczby:\n");
        for (int num : tablica) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] wystapienia = new int[10];


        for (int num : tablica) {
            wystapienia[num - 1]++;
        }


        System.out.println("Ile razy każda liczba z przedziału 1..10 występuje w tablicy:");
        for (int i = 0; i < wystapienia.length; i++) {
            System.out.println((i + 1) + ": " + wystapienia[i]);
        }
    }
}

//zad3


class MacierzMinMax {
    public static void main(String[] args) {
        int[][] macierz = new int[5][5];
        Random rand = new Random();


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = rand.nextInt(11) - 5;
            }
        }


        System.out.println("Macierz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", macierz[i][j]);
            }
            System.out.println();
        }


        int[] minKolumna = new int[5];
        int[] maxKolumna = new int[5];


        for (int j = 0; j < 5; j++) {
            minKolumna[j] = macierz[0][j];
            maxKolumna[j] = macierz[0][j];
        }


        for (int j = 0; j < 5; j++) {
            for (int i = 1; i < 5; i++) {
                if (macierz[i][j] < minKolumna[j]) {
                    minKolumna[j] = macierz[i][j];
                }
                if (macierz[i][j] > maxKolumna[j]) {
                    maxKolumna[j] = macierz[i][j];
                }
            }
        }


        System.out.println("\nMinimum dla każdej kolumny:");
        for (int j = 0; j < 5; j++) {
            System.out.print(minKolumna[j] + " ");
        }
        System.out.println();

        System.out.println("Maksimum dla każdej kolumny:");
        for (int j = 0; j < 5; j++) {
            System.out.print(maxKolumna[j] + " ");
        }
        System.out.println();
    }
}

//zad4

class KodZM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int[] bity = new int[32];


        bity[0] = (liczba < 0) ? 1 : 0;


        int wartosc = Math.abs(liczba);


        for (int i = 31; i > 0; i--) {
            bity[i] = wartosc % 2;
            wartosc = wartosc / 2;
        }


        System.out.print("Liczba " + liczba + " binarnie: " + bity[0] + ".");
        for (int i = 1; i < 32; i++) {
            System.out.print(bity[i]);
        }
        System.out.println();
    }
}

//zad5


class KodZM_ZU1_ZU2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int[] bityZM = new int[32];
        int[] bityZU1 = new int[32];
        int[] bityZU2 = new int[32];


        bityZM[0] = (liczba < 0) ? 1 : 0;
        int wartosc = Math.abs(liczba);
        for (int i = 31; i > 0; i--) {
            bityZM[i] = wartosc % 2;
            wartosc = wartosc / 2;
        }


        int val = Math.abs(liczba);
        for (int i = 31; i >= 0; i--) {
            bityZU1[i] = val % 2;
            val /= 2;
        }

        if (liczba < 0) {

            for (int i = 0; i < 32; i++) {
                bityZU1[i] = 1 - bityZU1[i];
            }
        }


        int carry = 1;
        for (int i = 31; i >= 0; i--) {
            int suma = bityZU1[i] + carry;
            bityZU2[i] = suma % 2;
            carry = suma / 2;
        }



        System.out.print("Liczba " + liczba + " w kodzie ZM: " + bityZM[0] + ".");
        for (int i = 1; i < 32; i++) System.out.print(bityZM[i]);
        System.out.println();

        System.out.print("Liczba " + liczba + " w kodzie ZU1: ");
        for (int i = 0; i < 32; i++) System.out.print(bityZU1[i]);
        System.out.println();

        System.out.print("Liczba " + liczba + " w kodzie ZU2: ");
        for (int i = 0; i < 32; i++) System.out.print(bityZU2[i]);
        System.out.println();
    }
}

//zad6

class OperacjeNaKodach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę całkowitą: ");
        int b = scanner.nextInt();


        int suma = a + b;
        int roznica = a - b;


        System.out.println("\nPierwsza liczba: " + a);
        wyswietlWszystkieKody(a);

        System.out.println("\nDruga liczba: " + b);
        wyswietlWszystkieKody(b);

        System.out.println("\nSuma (" + a + " + " + b + "): " + suma);
        wyswietlWszystkieKody(suma);

        System.out.println("\nRóżnica (" + a + " - " + b + "): " + roznica);
        wyswietlWszystkieKody(roznica);
    }


    static void wyswietlWszystkieKody(int liczba) {
        int[] bityZM = kodZM(liczba);
        int[] bityZU1 = kodZU1(liczba);
        int[] bityZU2 = kodZU2(liczba);

        System.out.print("ZM:  " + bityZM[0] + ".");
        for (int i = 1; i < 32; i++) System.out.print(bityZM[i]);
        System.out.println();

        System.out.print("ZU1: ");
        for (int i = 0; i < 32; i++) System.out.print(bityZU1[i]);
        System.out.println();

        System.out.print("ZU2: ");
        for (int i = 0; i < 32; i++) System.out.print(bityZU2[i]);
        System.out.println();
    }


    static int[] kodZM(int liczba) {
        int[] bity = new int[32];
        bity[0] = (liczba < 0) ? 1 : 0;
        int val = Math.abs(liczba);
        for (int i = 31; i > 0; i--) {
            bity[i] = val % 2;
            val /= 2;
        }
        return bity;
    }


    static int[] kodZU1(int liczba) {
        int[] bity = new int[32];
        int val = Math.abs(liczba);
        for (int i = 31; i >= 0; i--) {
            bity[i] = val % 2;
            val /= 2;
        }
        if (liczba < 0) {

            for (int i = 0; i < 32; i++) {
                bity[i] = 1 - bity[i];
            }
        }
        return bity;
    }


    static int[] kodZU2(int liczba) {
        int[] zu1 = kodZU1(liczba);
        int[] zu2 = new int[32];
        int carry = 1;
        for (int i = 31; i >= 0; i--) {
            int suma = zu1[i] + carry;
            zu2[i] = suma % 2;
            carry = suma / 2;
        }
        return zu2;
    }
}

//zad 9

class WzgledniePierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dodatnią liczbę naturalną n: ");
        int n = scanner.nextInt();

        boolean[][] tablica = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablica[i][j] = czyWzgledniePierwsze(i + 1, j + 1);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tablica[i][j] ? "+" : ".");
            }
            System.out.println();
        }
    }


    static int nwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    static boolean czyWzgledniePierwsze(int a, int b) {
        return nwd(a, b) == 1;
    }
}