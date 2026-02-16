import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringManipulation {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string: ");
        String str = br.readLine();

        System.out.println("Length of string: " + str.length());

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);

        if (str.equals(reverse)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        System.out.println("Replace 'a' with '*': " + str.replace('a', '*'));

        System.out.println("Concatenation with ' Java': " + str.concat(" Java"));
        System.out.println("Trimmed string is: " + str.trim());
        System.out.println("Enter the beginning index from where you have to start search: ");
        int beg=Integer.parseInt(br.readLine());
        System.out.println("Enter the ending index at which you have to stop search: ");
        int end=Integer.parseInt(br.readLine());
        System.out.println("The substring of the string "+str+" from "+beg+" index upto "+end+" index is: "+str.substring(beg,end));
    }
}
