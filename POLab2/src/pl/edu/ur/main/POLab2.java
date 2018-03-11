package polab2;

import java.util.Scanner;

public class POLab2 {

    public void zad3() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj 10 liczb");
        int tablica[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica[i] = s.nextInt();
        }
        System.out.println("1.tablica od pierwszego indeksu");
        System.out.println("2.tablica od ostatniego indeksu");
        System.out.println("3.wyswietlanie nieparzystych indeksow");
        System.out.println("4.wyswietlanie parzystych indeksow");
        int wybor = 0;
        do {
            wybor = s.nextInt();
            if (wybor == 1) {

                for (int i = 0; i < 10; i++) {
                    System.out.println(tablica[i]);
                }
            } else if (wybor == 2) {

                for (int i = 9; i >= 0; i--) {
                    System.out.println(tablica[i]);
                }
            } else if (wybor == 3) {

                for (int i = 0; i < 10; i += 2) {
                    System.out.println(tablica[i]);
                }
            } else if (wybor == 4) {

                for (int i = 1; i < 10; i += 2) {
                    System.out.println(tablica[i]);
                }
            }
        } while (wybor != 0);
    }
    
    
    
    public void zad4() {
        Scanner s = new Scanner(System.in);
        System.out.println("podaj liczby do tablicy");
        int tab[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = s.nextInt();
        }

        System.out.println("1.Suma elementów tablicy");
        System.out.println("2.Iloczyn elementów tablicy");
        System.out.println("3.Srednia elementów tablicy");
        System.out.println("4.Wartosc minimalna");
        System.out.println("5.Wartosc maksymalna");
        int wybor = 1;
        while (wybor != 0) {
            wybor = s.nextInt();
            switch (wybor) {

                case 1: {
                    int suma = 0;
                    for (int i = 0; i < 10; i++) {
                        suma = suma + tab[i];
                    }
                    System.out.println("Suma to " + suma);
                    break;
                }
                case 2: {
                    int iloczyn = 1;
                    for (int i = 0; i < 10; i++) {
                        iloczyn = iloczyn * tab[i];
                    }
                    System.out.println("iloczyn to " + iloczyn);
                    break;
                }
                case 3: {
                    int suma = 0;
                    for (int i = 0; i < 10; i++) {
                        suma = suma + tab[i];

                    }
                    float srednia = suma / 10;
                    System.out.println("Srednia to " + srednia);
                    break;
                }
                case 4: {
                    int minimalna;
                    minimalna = tab[0];
                    for (int i = 0; i < 10; i++) {
                        if (tab[i] < minimalna) {
                            minimalna = tab[i];
                        }
                    }

                    System.out.println("Wartosc minimalna to " + minimalna);
                    break;
                }
                case 5: {
                    int maksymalna;
                    maksymalna = tab[0];
                    for (int i = 0; i < 10; i++) {
                        if (tab[i] > maksymalna) {
                            maksymalna = tab[i];
                        }
                    }
                    System.out.println("Wartosc maksymalna to " + maksymalna);
                    break;
                }
            }
        }
    
    }
    public void zad6() {
        Scanner odczyt = new Scanner(System.in);
        int n = 5;
        while (n > 0) {
            n = odczyt.nextInt();
            if (n < 0) {
                break;
            }
        }

    }
     public void zad7()
    {
        Scanner s=new Scanner(System.in);
        int n;
       int tymczasowa;
        System.out.println("Podaj rozmiar tablicy");
        n=s.nextInt();
        int tablica [] = new int[n];
        System.out.println("Podaj liczby");
        for(int i=0;i<n;i++)
        {
            tablica[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n-1;j++)
            {
                if(tablica[j]>tablica[j+1])
                {
                tymczasowa = tablica[j+1];
                tablica[j+1] = tablica[j];
                tablica[j] = tymczasowa;
                }
            }
        }   
        System.out.println("Posortowane: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(tablica[i]);
        }
        
    }

    public static void main(String[] args) {
        POLab2 obiekt = new POLab2();
        Scanner menu=new Scanner(System.in);
        int wybor;
        System.out.println("1.Zadanie 3");
        System.out.println("2.Zadanie 4");
        System.out.println("3.Zadanie 6");
        System.out.println("4.Zadanie 7");
        wybor=menu.nextInt();
    
        switch(wybor)
        {
            case 1:
            {
                obiekt.zad3();
                break;
            }
            case 2:
            {
                obiekt.zad4();
                break;
            }
            case 3:
            {
                obiekt.zad6();
                break;
            }
            case 4:
             {
                obiekt.zad7();
                break;
             }
        }
    }

}
