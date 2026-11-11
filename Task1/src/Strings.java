import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
//        1. Create a String and print its length.
        String name = "Katru Satyanarayana";

        System.out.println(name.length());

//        2. Convert a String into uppercase.

        System.out.println(name.toUpperCase());

//        3. Convert a String into lowercase.

        System.out.println(name.toLowerCase());

//        4. Count the characters in a given String.

        int count = name.length();
        System.out.println("Count of characters : " + count);

//        5. Check whether a String contains a particular word.

        System.out.println(name.contains("Katru"));

        String role = "katru Satyanarayana";

        System.out.println(name.equals(role));
        System.out.println(name.equalsIgnoreCase(role));

//        7. Remove leading and trailing spaces using trim().

        String age = "   26   ";

        System.out.println(age.trim());

//        8. Reverse a String.

        for (int i = role.length() - 1; i >= 0; i--) {
            System.out.print(role.charAt(i));
        }

//        9. Count vowels in a String.

        String vowels = "aeiou";

        int counts = 0;

        for (int i = 0; i < name.length(); i++) {

            if (vowels.indexOf(Character.toLowerCase(name.charAt(i))) != -1) {
                counts++;
            }
        }

        System.out.println("Total vowels: " + counts);

// 10. Check whether a String is a palindrome.

        String text = "nan";
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}