class Game{
    public static void main (String[] args){
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Player 1 enter your name:");
        var player1name = scanner.nextLine();
        var Player1 = new Player(player1name);
        System.out.println("Welcome " + Player1.getName() + ": " + Player1.getAccount().getBalance());

        System.out.println();

        System.out.println("Player 2 enter your name:");
        var player2name = scanner.nextLine();
        var Player2 = new Player(player2name);
        System.out.println("Welcome " + Player2.getName() + ": " + Player2.getAccount().getBalance());
    
        boolean player1turn=true;

        while (Player1.getAccount().getBalance()<3000 && Player2.getAccount().getBalance()<3000){
            if (player1turn){
                int roll1 = Diceroll.dice();
                int roll2 = Diceroll.dice();
                int rollsum = roll1+roll2;

                switch (rollsum){
                    case 2:
                        Player1.getAccount().addAmount(250);
                        break;
                    case 3:

                    case 4:
                        Player1.getAccount().addAmount(100);
                        break;
                    case 5:
                    
                    case 6:
                        Player1.getAccount().addAmount(180);
                        break;
                    case 7:
                        break;
                    case 8:

                    case 9:
                        Player1.getAccount().addAmount(60);
                        break;
                    case 10:

                    case 11:

                    case 12:
                        Player1.getAccount().addAmount(650);
                        break;

                    
                }

                if (Player1.getAccount().getBalance()>=3000){
                    Game.winMessage(player1name);
                    break;
                }


            } else {
                if (Player2.getAccount().getBalance()>=3000){
                    Game.winMessage(player2name);
                    break;
                }

            }
            
        }
    }     
    
    public static void winMessage(String name){
        System.out.println("Congrats " + name + " you've reached the pinnacle of economic success and WON THE GAME!!!");
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
