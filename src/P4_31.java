/**    File: P4_31.java
 *  Purpose: Control number of people who are in an oyster bar; Read sizes of groups that arrive or depart;
 *           Use negative numbers for depart; After each input, display the number of occupants; exit program
 *           when bar is full;
 *    Coder: Tyler Gosling
 *     Date: 05/28/2020
 */
import java.util.Scanner;

public class P4_31 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int MAX_OCCUPANTS = 100;
        int current_occupants = 0;
        while(current_occupants != MAX_OCCUPANTS){
            System.out.print("How many occupants?: ");
            int usr_occupants = in.nextInt();
            if(current_occupants + usr_occupants <= MAX_OCCUPANTS){
                current_occupants += usr_occupants;
                System.out.printf("Current Bar Total: %d", current_occupants);
            } else {
                System.out.print("There are too many people in the bar to enter without exceeding max occupancy");
                System.out.printf("Current Bar Total: %d", current_occupants);
            }
            System.out.println();
        }
        System.out.println("Max occupancy has been reached.");
    }
}
