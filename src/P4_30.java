import java.util.Scanner;

/**    File: P4_30.java, Ticket Seller
 *  Purpose: Pre-sell cinema tickets for a limited amout; prompt user for desired amount;
 *           Ticket limit to 4 per customer; Display remaining tickets; Repeat until sold
 *           and display number of buyers
 *    Coder: Tyler Gosling
 *     Date: 05/28/2020
 */

public class P4_30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int remainTickets = 100;
        int numBuyers = 0;
        while(remainTickets > 0){
            System.out.println("Tickets to buy: ");
            int usrTkts = in.nextInt();
            if(usrTkts < 5 && usrTkts > 0){
                System.out.println("Bought " + usrTkts + " ticket" + ((usrTkts > 1)? "s" : ""));
                remainTickets -= usrTkts;
                ++numBuyers;
            } else {
                System.out.println("Each Buyer can not buy more than 4 tickets");
            }
            System.out.printf("Available Tickets: %d", remainTickets);
        }
        System.out.println("Tickets Sold Out, Event Pre-sale Closed.");
        System.out.printf("Total Buyers: %f", numBuyers);
        in.close();
    }
}
