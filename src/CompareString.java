import java.util.Scanner;
public class CompareString {
    public static  void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        int length=word.length();
        String firstLetter=word.substring(0,1).toUpperCase();
        String lastLetter=word.substring(word.length()-1).toUpperCase();
        if (firstLetter.equals(lastLetter))
        {
            System.out.println("first letter and last letter same");
        }
        else
        System.out.println("first letter and last letter different");
    }
}