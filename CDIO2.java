class Game{
    public static void main (String[] args){
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Player 1 enter your name:");
        var Player1 = new Player(scanner.nextLine());

        System.out.println("Player 2 enter your name:");
        var Player2 = new Player(scanner.nextline());

        System.out.println(Player1 + " " + Player2);
    }        







}
class Player{
    private String name;
    private Account account;

    public Player(String name){
        this.name=name;
        this.account= new Account();
    }

    public String getName(){
        return name;
    }

    public Account getAccount(){
        return account;
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
        
        var randomValue = Math.random();
        
        int dice = (int) Math.floor(randomValue*6)+1; 
        return dice;
    }
}
