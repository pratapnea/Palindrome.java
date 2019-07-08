import java.util.Scanner;

/*
* Created by: Pratap Neaupane
* Dated on: Jul 8 2019
* Time: 5:25 PM
* IDE used IntelliJ IDEA
* */

// This program prints the return value i.e.
// if isPalindrome returns true it will be printed
// otherwise false will be printed

/*
* "Test Cases":
* 1. A Santa at Nasa.
* 2. Ana
* 3. POW, ami! O’ Gad, ami! Go hang a salami, doc! Note; I dissent. A fast never prevents a fatness. I diet on cod. I’m a lasagna hog. I’m a dago! I’m a wop!
* 4. Sir, I’m Iris.
* 5. solos
* */

public class isPalindromeAdvance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word){

        word =word.toLowerCase();   // Change the input into Lower Case

        // word.replace["[^a-z0-9]",""] denotes, replace all characters with empty character, except a-z and 0-9
        word = word.replaceAll("[^a-z0-9]", "");

        // word = word.replace("[^a-zA-Z0-9]", "");

        int counter = 0; // counter value increases on every similar character
        int lastIndex = word.length()-1;
        int startIndex = 0;

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(startIndex++) == word.charAt(lastIndex--)){
                counter++;
            }
        }
        if (counter == word.length()/2) return true;
        else return false;
    }

}
