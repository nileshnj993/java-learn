import java.util.Scanner;

public class challenges {
    public static void main(String[] args) {
        // System.out.println(toMilesPerHour(-3));
        // printConversion(75.114);
        // printMegaBytesAndKiloBytes(5000);
        // System.out.println(shouldWakeUp(true,8));
        // System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        // switchCaseDemo('G');
        // loops();
        // sumChallenge();
        // whileDemo();
        // parseString("2018");
        // userInput();
        // sumOfUserInput();
        minAndMax();
    }
    // challenge 1 - speed convertor
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else{
            return Math.round(kilometersPerHour/1.609);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            long milesPerHour = Math.round(kilometersPerHour/1.609);
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }
    }

    // challenge 2 - megabytes convertor
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int mb = kiloBytes/1024;
            int kb = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+mb+" MB and "+kb+" KB");
        }
    }

    // challenge 3 - barking dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if((barking && hourOfDay<8) || (barking && hourOfDay>22)){
            return true;
        }
        return false;
    }

    // challenge 4 - decimal comparator
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 = (int)(num1*1000);
        num2=(int)(num2*1000);
        if(num1==num2)
            return true;
        return false;
    }

    // challenge 5 - use switch case
    public static void switchCaseDemo(char letter){
        switch(letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Letter was found!");
                break;
            default:
                System.out.println("Letter was not found!");
        }
    }

    // challenge 6 - loops
    public static void loops(){
        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
        char test[] = {'I','N','D','I','A'};
        for(char i : test){
            System.out.println(i);
        }
    }

    // challenge 7 - sum challenge
    public static void sumChallenge(){
        int sum = 0;
        int count = 0;
        for(int i=1;i<=1000;i++){
           if(i%3==0 && i%5==0){
               count++;
               sum+=i;
               System.out.println(i);
           }
           if(count==5){
               break;
           }
        }
        System.out.println(sum);
    }

    // challenge 8 - using while and do while
    public static void whileDemo(){
        int i = 10;
        while(i>0){
            System.out.println(i);
            i--;
        }
        i=10;
        do{
            System.out.println(i);
            i--;
        }
        while(i>0);
    }

    // parsing strings
    public static void parseString(String s){
        int n = Integer.parseInt(s);
        System.out.println(s+'1');
        System.out.println(n+1);
        /*double d = Double.parseDouble(s);
        System.out.println(d+1);*/
    }

    // taking user input
    public static void userInput(){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);*/

        // we have an issue if we take int input first and then string as the scanner takes out enter click as a string ("\n"). to solve this issue we just read the extra \n and do nothing with it
        System.out.println("PROBLEM");
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter number:");
        boolean hasNexInt = newScanner.hasNextInt(); // this will ensure that only integer input is provided in the next scan
        if(hasNexInt){ // if int input is provided
            int n = newScanner.nextInt();
            newScanner.nextLine(); // reading \n
            System.out.println("Enter string:");
            String s = newScanner.nextLine();
            System.out.println("Number you entered was "+n+" and string you entered was "+s);
            newScanner.close();
        }
        else{
            System.out.println("Invalid input. Please enter a integer only!");
        }
    }

    // challenge 9 - user input
    public static void sumOfUserInput(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int i = count+1;
        while(count<10){
            System.out.println("Enter number "+i+":");
            if(scanner.hasNextInt()){
                count++;
                i++;
                sum+=scanner.nextInt();
            }
            else{
                System.out.println("Invalid input. Please enter numbers only!");
            }
            scanner.nextLine(); // to avoid infinite loop. when user enters a string, even the /n is stored for the next iteration, causing an infinite loop
        }
        scanner.close();
        System.out.println(sum);

    }

    public static void minAndMax(){
        Scanner scanner = new Scanner(System.in);
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number:");
            if(scanner.hasNextInt()){
                int n = scanner.nextInt();
                minVal = Integer.min(n,minVal);
                maxVal = Integer.max(n,maxVal);
                System.out.println("Minimum value so far is:"+minVal);
                System.out.println("Maximum value so far is:"+maxVal);
            }
            else{
                System.out.println("Invalid input!");
                break;
            }
        }
        System.out.println("Minimum value is:"+minVal);
        System.out.println("Maximum value is:"+maxVal);
    }
}
