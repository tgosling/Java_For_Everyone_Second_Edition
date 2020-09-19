public class P6_12 {
    public static void main(String[] args){
        int[] rolls = generateRolls();
        printArray(rolls);
        //Print runs
        printRuns(rolls);
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

    public static void printRuns(int[] arr){
        boolean inRun = false;
        int preVal= arr[0];
        //Test values for runs
        for(int i = 0; i < arr.length - 1; ++i) {
            if (inRun) {
                if (arr[i] != preVal) {
                    System.out.print(")");
                    inRun = false;
                }
            } else {
                if (arr[i] == arr[i + 1]) {
                    System.out.print(" (");
                    inRun = true;
                } else {
                    System.out.print(" ");
                }
            }
            preVal = arr[i];
            System.out.print(arr[i]);
        }
            //print runs and values
            if(inRun && arr[arr.length - 1] == preVal)
                System.out.print(" " + arr[arr.length - 1] + ")");
            else if (inRun && arr[arr.length - 1] != preVal)
                System.out.print(") " + arr[arr.length - 1]);
            else
                System.out.print(" " + arr[arr.length - 1] + " ");
    }
}
