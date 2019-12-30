package PostCollege1.CollegeRecap;


import java.util.Random;

public class CoinFlip {
    private enum Coin{Heads,Tails};
    Random randomNum = new Random();
    private int result = randomNum.nextInt(2);
    private int heads = 0;
    private int tails = 1;
    Coin coinFlip;

    public void flip(){
        if(result == 0){
            coinFlip = Coin.Heads;
            System.out.println("You are not dead inside");;
        }
        else{
            coinFlip = Coin.Tails;
            System.out.println("You are dead inside");
        }
    }
}
