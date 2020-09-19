public class P6_14 {
    public static void main(String[] args){
        int[] rolls = generateRolls();
        printArray(rolls);
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

    public static int[] generateRolls(){
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = (int) (Math.random() * 6 + 1);
        }
        return arr;
    }

    public static void printRuns(){
        
    }
}
