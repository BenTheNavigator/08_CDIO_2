class Game {


}

class Player {
    public String name;
    public int ID;
    public int accountBalance;

    public Player (String name) {
        this.name = name;
        this.ID = ID++;
        this.accountBalance = 1000;
    }
}

class Account {
    public static boolean checkPBalance(){
        if (player.accountBalance < 0){
            return true;
        } else {
            return false;
        }
    }

    public static void setBalance(int boardEffect){
        player.accountBalance = player.accountBalance + boardEffect;
    }

    public static void setBalance0(int ID){
        player.accountBalance = 0;
    }


}

class Dice {
    public int numberOfDice;
    public int maxFaceValue;

    public DiceNumberFV(int numberOfDice, int maxFaceValue){
        this.numberOfDice = numberOfDice;
        this.maxFaceValue = maxFaceValue;
    }

    public int getRoll(){
        //We get a random double value (0 to 1) from the Math.random
        var randomValue = Math.random();
        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down 
        for(int result = 0; this.numberOfDice > 0; this.numberOfDice--) {
            result = (int) Math.floor(randomValue*this.maxFaceValue)+1 + result; 
        } 
        return result;
    }
}

class Gameboard {
    public int boardNumber;
    public int boardEffect;
    public String boardText;

    public Tower(){
        this.boardNumber = 2;
        this.boardEffect = 250;
        this.boardText = "You have discovered the Tower of Wisdom! Ancient books discovered worth 250 bucks";
    }

    public Crater(){
        this.boardNumber = 3;
        this.boardEffect = -100;
        this.boardText = "OH NO!!! You fell into a huge crater! Spend 100 bucks for a health potion to heal your broken leg...";
    }

    public PalaceGates(){
        this.boardNumber = 4;
        this.boardEffect = 100;
        this.boardText = "On your way through the palace gates you found a gold coin worth 100 bucks. Quick hide it before the corrupt guards see it! ";
    }
}