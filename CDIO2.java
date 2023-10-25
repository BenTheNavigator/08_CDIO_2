class Game{
    public static void main (String[] args){
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Player 1 enter your name:");
        var player1name = scanner.nextLine();
        var Player1 = new Player(player1name);
        System.out.println(Player1.getName() + ":" + Player1.getAccount().getBalance());

        System.out.println("Player 2 enter your name:");
        var player2name = scanner.nextLine();
        var Player2 = new Player(player2name);
        System.out.println(Player2.getName() + ":" + Player2.getAccount().getBalance());
        
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
