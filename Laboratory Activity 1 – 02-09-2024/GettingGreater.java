import java.util.*;
public class GettingGreater {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter the first character: ");
        char f_char = value.next().charAt(0);

        System.out.print("Enter the second character: ");
        char s_char = value.next().charAt(0);
        
        System.out.println("-------------------------------------------");
        char greater_val = (char)Math.max(f_char, s_char);
        System.out.println("The character with greater value is: " + greater_val);
        System.out.println("-------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(f_char + " : " + (int)f_char);
        System.out.println(s_char + " : " + (int)s_char);

        value.close();
    }
}


