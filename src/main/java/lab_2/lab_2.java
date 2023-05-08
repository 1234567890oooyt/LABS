package lab_2;
import java.util.StringTokenizer;

public class lab_2 {





    public static void main(String[] args) {
        String attendees = "Smith, John, 25, Male\n" +
                "Johnson, Mary, 32, Female\n" +
                "Garcia, Carlos, 47, Male";

        // create a StringTokenizer object with comma and newline as delimiters
        StringTokenizer tokenizer = new StringTokenizer(attendees, ",\n");

        // iterate over the tokens and extract attendee information
        while (tokenizer.hasMoreTokens()) {
            String lastName = tokenizer.nextToken().trim();
            String firstName = tokenizer.nextToken().trim();
            int age = Integer.parseInt(tokenizer.nextToken().trim());
            String gender = tokenizer.nextToken().trim();

            // do something with attendee information
            System.out.println("Last name: " + lastName);
            System.out.println("First name: " + firstName);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println();
        }
    }







}
