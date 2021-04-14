package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Implementează o metodă (i.e. countOccurrencesIgnoreCase(String[] array, String key)) care determină numărul de
        //  elemente key din cadrul array și returnează această valoare. Metoda nu ține cont de tipul literelor (i.e.
        //  majuscule vs. minuscule). Testează metoda în main pentru cât mai multe cazuri de excepție.

        String [] array1={};
        String key1="aKey";
        System.out.println("test 1: "+ countOccurrencesIgnoreCase(array1,key1));

        String [] array2={"java", "Python", "JAVA", "IT","Java", "Linux", "python", "c++"};
        String key2="javA";
        System.out.println("test 2: "+ countOccurrencesIgnoreCase(array2,key2));

        String key3="ja va";
        System.out.println("test 3: "+ countOccurrencesIgnoreCase(array2,key3));

        String key4="python";
        System.out.println("test 4: "+ countOccurrencesIgnoreCase(array2,key4));

        String key5="blana";
        System.out.println("test 5: "+ countOccurrencesIgnoreCase(array2,key5));

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente : ");
        int number=Integer.parseInt(scan.nextLine());
       // int number=scan.nextInt();
        //scan.nextLine();
        System.out.println("Introduceti elementele: ");
        String[] array = new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Introduceti elementul : "+i+":");
            array[i]=scan.nextLine();}
        System.out.println("Introduceti elementul cheie: ");
        String key=scan.next();
        System.out.println("test 6: " +countOccurrencesIgnoreCase(array,key));
    }
    public static int countOccurrencesIgnoreCase(String[] array, String key){
        int numberOfKey=0;
        for(int i=0; i<array.length;i++){
            if(array[i].equalsIgnoreCase(key))
                numberOfKey++;}
        return numberOfKey;

    }
}
