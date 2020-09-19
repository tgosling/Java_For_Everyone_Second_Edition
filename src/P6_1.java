public class P6_1 {
    public static void main(String[] args){
        int[] numArr = new int[10];

        for(int i =0; i < 10; ++i){
            numArr[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.println("Every even element at index: ");
        for(int i = 0; i < numArr.length; ++i){
            if(i % 2 == 0)
                System.out.printf("Index[%d]= %d\n", i, numArr[i]);
        }

        System.out.println("Every even element at index: ");
        for(int i = 0; i < numArr.length; ++i){
            if(numArr[i] % 2 == 0)
                System.out.printf("Index[%d]= %d\n", i, numArr[i]);
        }

        System.out.println("All elements in reverse order: ");
        for(int i = numArr.length - 1; i > -1; i--){
            System.out.printf("index[%d] = %d\n", i, numArr[i]);
        }

        System.out.printf("\nFirst elment = %d \tLast Element = %d", numArr[0], numArr[numArr.length-1]);
    }
}
