public class StringMethods {
    public static void main(String[] args) {

        // Add your first names:
        String firstName = "Tyler";
        String lastName = "Gosling";

        // What's the full name?
        System.out.println(firstName.concat(" " + lastName));

        String password = "correcthorsebatterystaple";

        // Write the code:
        System.out.println(password.equals("Teststring"));

        String line = "The Heav'ns and all the Constellations rung";
        // Change the arguments:
        System.out.println(line.substring(4, 11));

        String hashtag = "#100DaysOfCode";

        // Make the hashtag lowercase:
        System.out.println(hashtag.toLowerCase());

    }
}
