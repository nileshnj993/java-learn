import java.util.Scanner;

public class arrays {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] myArray = getNumbers(n);
        printArray(myArray);
    }

    public static int[] getNumbers(int n){
        int []myArray = new int[n];
        for(int i=1;i<=n;i++){
            System.out.println("Enter element "+i+":");
            myArray[i-1] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray){
        System.out.println("The array elements are:");
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
