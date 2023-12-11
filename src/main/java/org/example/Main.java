package org.example;

public class Main {
    public static void main(String[] args) {

        //sprawdzenie palindrom
        String podaneslowo = "aaaaaaaaaaaaaaaallll";
        boolean palindrom = czyJestPalind(podaneslowo, 0, podaneslowo.length()-1);
        System.out.println("Czy podane słowo jest palindromem? Podane słowo "+podaneslowo+" wynik sprawdzenia: "+palindrom);

        //sprawdzenie max i min
        int[] liczby = {1 , 4 ,3};
        int max =  znajdzMax(liczby);
        System.out.println("Największa liczba to:"+ max );

        //Sprawdzenie foboncii
        System.out.println("Wyraz ciagu Fibonacciego to "+fibonacci(5));
    }

    // 5. palindrom
    public static boolean Litery(String slowo ){
        return czyJestPalind(slowo,0,slowo.length() - 1 );
    }

    private static boolean czyJestPalind (String slowo, int start, int koniec){
        if ( start >= koniec ) {
            return true;
        }
        if(slowo.charAt(start) != slowo.charAt(koniec)){
            return false;
        }
        return czyJestPalind(slowo, start+1, koniec-1);
    }


    //6. max i min 
    public static int znajdzMax (int[] arr) {
        return znajdzMaxPomocnicza (arr, arr.length, Integer.MIN_VALUE);
    }

    private static int znajdzMaxPomocnicza (int[] arr, int dl, int max){
        if (dl == 0) {
            return max;
        }
        if (arr[ dl - 1 ] > max) {
            max = arr[dl - 1];
        }
        return znajdzMaxPomocnicza(arr, dl-1 , max);
    }

    //7. fibonacci
    public static int fibonacci (int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}