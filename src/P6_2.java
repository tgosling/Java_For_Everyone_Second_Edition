import java.util.*;
import static java.lang.Integer.MAX_VALUE;

public class P6_2 {
    public static void main(String[] args){
        int[] numArr = new int[10];

        for(int i =0; i < 10; ++i){
            numArr[i] = (int)(Math.random() * 100 + 1);
        }

        int[] removeArr = removeMiddle(numArr);

        //print original array
        printArray(numArr);
        //Find second largest value
        int secLrg = secondLarge(numArr);
        System.out.printf("Second largest value = %d\n", secLrg);
        //test shift
        shift(numArr);
        //test remove
        printArray(removeArr);
        //test swap
        swap(numArr, 2, 7);
        printArray(removeArr);
        //Test replace
        replace(removeArr);
        printArray(removeArr);
        //Test swapNeighbour
        int[] repArr = replaceLargeNeighbour(removeArr);
        printArray(repArr);
        //Test moveEven Elements
        moveEvenElements(numArr);
        printArray(numArr);

        int[] dupArr = new int[]{10,12,13,14,12};
        int[] noDupArr = new int[]{10,11,12,13,14,15};
        int[] sumArr = new int[]{15,14,13,12,11,10};
        printArray(dupArr);
        boolean dupTest = hasDuplicate(dupArr);
        System.out.println("Does the array have duplicate values? " + dupTest);
        printArray(noDupArr);
        dupTest = hasDuplicate(noDupArr);
        System.out.println("Does the array have duplicate values? " + dupTest);

        int sumVal = sumWithoutSmallest(noDupArr);
        System.out.printf("\nSum of array without smallest value = %d", sumVal);
        sumVal = sumWithoutSmallest(sumArr);
        System.out.printf("\nSum of array without smallest value = %d", sumVal);
        //remove
        System.out.println("Remove min element of array:");
        removeMin(dupArr);
        printArray(dupArr);
        //Test P6_14
        System.out.println("");
    }

    public static void printArray(int[] arr){
        System.out.println("\nArray Values:");
        for(int i = 0; i < arr.length; ++i){
            if(i % 2 == 0)
                System.out.printf("index[%d] = %d\t", i+1, arr[i]);
            else
                System.out.printf("index[%d] = %d\n", i+1, arr[i]);
        }
    }

    //A) swap the first and last elements in array
    public static void swap(int[] arr, int x, int y){
        int hold = arr[x];
        arr[x] = arr[y];
        arr[y] = hold;
    }

    //B) Shift all elements by one to the right and move the last element
    public static void shift(int[] arr){
        int hold = arr[arr.length - 1];
        System.arraycopy(arr, 0, arr, 1, arr.length - 1);
        arr[0] = hold;
    }

    public static void replace(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] % 2 == 0)
                arr[i] = 0;
        }
    }

    public static int[] replaceLargeNeighbour(int[] arr){
        for(int i = 1; i < arr.length - 1; ++i) {
            if (arr[i + 1] > arr[i - 1])
                arr[i] = arr[i + 1];
            else if (arr[i - 1] > arr[i + 1])
                arr[i] = arr[i - 1];
        }
        return arr;
    }

    public static int[] removeMiddle(int[] arr){
        int midVal = arr.length / 2;
        int[] holdArr = new int[0];

       if(arr.length % 2 == 0){
           holdArr = new int[arr.length - 2];
            for(int i = 0, k = 0; i < arr.length; ++i){
                if(i == midVal || i == midVal + 1)
                    continue;
                holdArr[k++] = arr[i];
            }
       } else if(arr.length % 2 == 1){
           holdArr = new int[arr.length - 1];
           for(int i = 0, k = 0; i < arr.length-1; ++i){
               if(i == arr[midVal])
                   continue;
               holdArr[k++] = arr[i];
           }
       }
       return holdArr;
    }

    public static int secondLarge(int[] arr){
        int hold = arr[0], large = arr[0];
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > large){
                hold = large;
                large = arr[i];
            }
        }
        return hold;
    }

    public static void moveEvenElements(int[] arr){
        int swapVal = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] % 2 == 0){
                int hold = arr[swapVal];
                arr[swapVal] = arr[i];
                arr[i] = hold;
                ++swapVal;
            }
        }
    }


    public static boolean equalAdj(int[] arr){
        for(int i = 0; i < arr.length - 1; ++i){
            if(arr[i] == arr[i + i])
                return true;
        }
        return false;
    }

    public static boolean hasDuplicate(int[] arr){
        Set<Integer> hold = new HashSet<Integer>();

        for(int val : arr){
            if(hold.contains(val)) return true;
            hold.add(val);
        }
        return false;
    }

    //P6.4
    public static int sumWithoutSmallest(int[] arr){
        int smallVal = MAX_VALUE, hold = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] < smallVal) {
                smallVal = arr[i];
            }
            hold += arr[i];
        }
        return hold - smallVal;
    }

    //P6.5
    public static void removeMin(int[] arr){
        int minVal = MAX_VALUE, minIdx = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] < minVal){
                minIdx = i;
                minVal = arr[i];
            }
        }
    }

    public static int[] generateSeq(int n){
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i)
            arr[i]= (int)(Math.random() * 99 + 1);
        Arrays.sort(arr);
        return arr;
    }
}
