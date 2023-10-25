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

    public static int setBalance0(boolean checkPBalance){
        if (true){
            return 0;
        } else {
            return player.accountBalance;
        }


    }



}