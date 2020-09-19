/**    File: P6_29.java
 *  Purpose: Business Question; Pet shop gives a discount to its customers if they but one (1) or more pets;
 *           Discounts are given if they buy five (5) additional items at 20% of the cost of the items; Pets
 *           are not included in the discount
 *    Coder: Tyler Gosling
 *     Date: 05/28/2020
 */
import java.util.Scanner;

public class P6_29 {
    public static void main(String[] args){
        //Variables
        Scanner in = new Scanner(System.in);
        double price = 0;
        int idx = 0;
        boolean pFlag = true;
        double[] prices = new double[10];
        boolean[] itemType = new boolean[10];

        System.out.println("Pet Shop Check-out\n");

        do {
            System.out.print("Enter price for item: ");
            price = in.nextDouble();
            if(price == -1) {
                pFlag = false;
                break;
            }
            prices = addPrice(idx, prices, price);
            System.out.print("Is item a pet?: (Y?N)");
            String petStatus = in.next();
            itemType = addPetStatus(idx, itemType, petStatus);
            ++idx;
        } while(pFlag);

        //print values
        printArray(prices, itemType);

        //Total Purchase
        double usrTotal = totalPurchase(prices, itemType, idx);
        System.out.printf("\nTotals items: %d\nTotal Price: %f", idx, usrTotal);
    }

    public static double[] addPrice(int idx, double[] arr, double val){
        double holdArr[] = new double[idx + 1];
        //copy original array into new array
        for(int i = 0;i < holdArr.length - 1; ++i)
            holdArr[i] = arr[i];
        //add element to array
        holdArr[idx] = val;

        return holdArr;
    }

    public static boolean[] addPetStatus(int idx, boolean[] arr, String val){
        boolean holdArr[] = new boolean[idx + 1];
        //copy original array into new array
        for(int i = 0; i < holdArr.length - 1; ++i)
            holdArr[i] = arr[i];
        //add element to array
        if(val.charAt(0) == 'Y' || val.charAt(0) == 'y')
            holdArr[idx] = true;
        else if(val.charAt(0) == 'N')
            holdArr[idx] = false;

        return holdArr;
    }

    public static void printArray(double[] arr, boolean[] bArr){
        for(int i = 0; i < arr.length; ++i)
                System.out.printf("\nItem Price: %,f\t  Pet: %s", arr[i], bArr[i] ? "true" : "false");
    }

    public static boolean checkPet(boolean[] arr){
        boolean hold = false;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] = true)
                hold = true;
        }
        return hold;
    }

    public static double totalPurchase(double[] price, boolean[] petStatus, int idx){
        double hold = 0;
        boolean petFlag = checkPet(petStatus);
        if(petFlag && idx >= 5){
            for(int i = 0; i < price.length; ++i){
                if(petStatus[i])
                    hold += price[i];
                else
                    hold += price[i] - (price[i] * 0.2);
            }
        }else {
            for(int i = 0; i < price.length; ++i){
                hold += price[i];
            }
        }


        return hold;
    }

}
