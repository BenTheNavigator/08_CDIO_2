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
    public int extraTurn;

    public GameboardPoint(int boardNumber, int boardEffect, String boardText, int extraTurn) {
        this.boardNumber = boardNumber;
        this.boardEffect = boardEffect;
        this.boardText = boardText;
        this.extraTurn = extraTurn;
    }

    public static final GameboardPoint[] POINTS = {
        new GameboardPoint(2, 250, "You've discovered the Tower of Wisdom! Ancient books discovered worth 250 bucks.", 0),
        new GameboardPoint(3, -100, "OH NO!!! You fell into a huge crater! Spend 100 bucks for a health potion to heal your broken leg...", 0),
        new GameboardPoint(4, 100, "On your way through the palace gates you found a gold coin worth 100 bucks. Quick hide it before the corrupt guards see it!", 0),
        new GameboardPoint(5, -20, "You've discovered the Cold Desert! It's a harsh environment, and you lose 20 bucks.", 0),
        new GameboardPoint(6, 180, "You've reached the Walled City and received a warm welcome. Gain 180 bucks.", 0),
        new GameboardPoint(7, 0, "You've entered the Monastery, where you find peace and tranquility. No change in your fortune.", 0),
        new GameboardPoint(8, -70, "You've entered the Black Cave, and drop some money while lost in the dark. Lose 70 bucks.", 0),
        new GameboardPoint(9, 60, "You've found huts in the mountain. The locals are generous and give you 60 bucks.", 0),
        new GameboardPoint(10, -80, "You've encountered the Werewall (werewolf-wall). It's a scary place, and you lose 80 bucks. However, you get an extra turn!", 1),
        new GameboardPoint(11, -50, "You've fallen into the pit. Lose 50 bucks.", 0),
        new GameboardPoint(12, 650, "You've discovered the Goldmine! Strike it rich and gain 650 bucks.", 0)
    
    };

    
}