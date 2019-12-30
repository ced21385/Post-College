package PostCollege1.CollegeRecap;

import PostCollege1.CollegeRecap.CoinFlip;

import java.util.Scanner;

public  class Dead {


    public static void main(String[] args) {
       // launch(args);
        CoinFlip test = new CoinFlip();
        int choice;

        System.out.println("Welcome to the coin toss game!");

        do{
            System.out.print("Enter 1 to toss coin or enter 0 to quit: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if (choice == 1){
                test.flip();
            }
            else if (choice > 1){
                System.out.println("Invalid entry - please enter 1 or 0: ");
                choice = input.nextInt();
            }
        }while (choice != 0);

    }

    //@Override
    //public void start(Stage primaryStage) throws Exception {


}
