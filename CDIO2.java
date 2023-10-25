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