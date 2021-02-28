package Day2;

import java.util.Scanner;

public class question8b {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();
        do
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character  word: " + word);
            }

            word = s.next();
        }while(!word.equals("done"));
    }
}
