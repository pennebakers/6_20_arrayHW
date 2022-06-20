import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        boolean loopTrip = true;
        int intValue = 0;

        System.out.println("Enter an Integer between 1 and 20: ");
        intValue = kbd.nextInt();

        while(loopTrip){
            if(intValue < 1 || intValue > 20){
                System.out.println("Error, enter a Integer Value between 1 and 20: ");
                intValue = kbd.nextInt();
            }
            else{
                loopTrip = false;
            }
        }

        int[] arr = new int[intValue];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.pow(2, i);

        }


        printArray(arr);



    }

    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}