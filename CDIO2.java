class Player{
    private String name;
    private Account account;

    public Player(String name){
        this.name=name;
        this.account= new Account();
    }

}
class Account{
    private int balance;

    public Account(){
        this.balance = 1000;
    }

    public int getBalance(){
        return balance;
    }

    public void addAmount(int Amount){
        balance+=Amount;
    }

    public void decreaseAmount(int Amount){
        if(balance-Amount<0){
            balance=0;
        } else {
            balance-=Amount;
        }

    }
}
class Diceroll{
    public static int dice(){
        //We get a random double value (0 to 1) from the Math.random
        var randomValue = Math.random();
        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down 
        int dice = (int) Math.floor(randomValue*6)+1; 
        return dice;
    }
}
