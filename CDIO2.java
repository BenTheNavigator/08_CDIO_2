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
        int numberOfDice=2;
        int maxFaceValue=6;

        while (Player1.getAccount().getBalance()<3000 && Player2.getAccount().getBalance()<3000){
            if (player1turn){
                System.out.println(player1name + ", press 'r' to roll the dice.");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("r")) {
                    int roll1 = Diceroll.dice(numberOfDice-1,maxFaceValue);
                    int roll2 = Diceroll.dice(numberOfDice-1,maxFaceValue);
                    int rollsum = roll1+roll2;

                    System.out.println("You rolled: " + roll1 + " and " + roll2);

                    switch (rollsum){
                        case 2:
                            System.out.println("You've discovered the Tower of Wisdom! Ancient books discovered worth 250 bucks.");
                            Player1.getAccount().addAmount(250);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 3:
                            System.out.println("OH NO!!! You fell into a huge crater! Spend 100 bucks for a health potion to heal your broken leg...");
                            Player1.getAccount().decreaseAmount(100);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 4:
                            System.out.println("On your way through the palace gates you found a gold coin worth 100 bucks. Quick hide it before the corrupt guards see it!");
                            Player1.getAccount().addAmount(100);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 5:
                            System.out.println("You've discovered the Cold Desert! It's a harsh environment, and you lose 20 bucks.");
                            Player1.getAccount().decreaseAmount(20);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 6:
                            System.out.println("You've reached the Walled City and received a warm welcome. Gain 180 bucks.");
                            Player1.getAccount().addAmount(180);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 7:
                            System.out.println("You've entered the Monastery, where you find peace and tranquility. No change in your fortune.");
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 8:
                            System.out.println("You've entered the Black Cave, and drop some money while lost in the dark. Lose 70 bucks.");
                            Player1.getAccount().decreaseAmount(70);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 9:
                            System.out.println("You've found huts in the mountain. The locals are generous and give you 60 bucks.");
                            Player1.getAccount().addAmount(60);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 10:
                            System.out.println("You've encountered the Werewall (werewolf-wall). It's a scary place, and you lose 80 bucks. However, you get an extra turn!");
                            Player1.getAccount().decreaseAmount(80);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            player1turn=false;
                            break;
                        case 11:
                            System.out.println("You've fallen into the pit. Lose 50 bucks.");
                            Player1.getAccount().decreaseAmount(50);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;
                        case 12:
                            System.out.println("You've discovered the Goldmine! Strike it rich and gain 650 bucks.");
                            Player1.getAccount().addAmount(650);
                            System.out.println("New balance of " + player1name + ": " + Player1.getAccount().getBalance());
                            break;

                    }
                }

                if (Player1.getAccount().getBalance()>=3000){
                    Game.winMessage(player1name);
                    break;
                }


            } else {
                System.out.println(player2name + ", press 'r' to roll the dice.");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("r")) {
                    int roll1 = Diceroll.dice(numberOfDice-1,maxFaceValue);
                    int roll2 = Diceroll.dice(numberOfDice-1,maxFaceValue);
                    int rollsum = roll1+roll2;

                    System.out.println("You rolled: " + roll1 + " and " + roll2);

                    switch (rollsum){
                        case 2:
                            System.out.println("You've discovered the Tower of Wisdom! Ancient books discovered worth 250 bucks.");
                            Player2.getAccount().addAmount(250);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 3:
                            System.out.println("OH NO!!! You fell into a huge crater! Spend 100 bucks for a health potion to heal your broken leg...");
                            Player2.getAccount().decreaseAmount(100);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 4:
                            System.out.println("On your way through the palace gates you found a gold coin worth 100 bucks. Quick hide it before the corrupt guards see it!");
                            Player2.getAccount().addAmount(100);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 5:
                            System.out.println("You've discovered the Cold Desert! It's a harsh environment, and you lose 20 bucks.");
                            Player2.getAccount().decreaseAmount(20);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 6:
                            System.out.println("You've reached the Walled City and received a warm welcome. Gain 180 bucks.");
                            Player2.getAccount().addAmount(180);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 7:
                            System.out.println("You've entered the Monastery, where you find peace and tranquility. No change in your fortune.");
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 8:
                            System.out.println("You've entered the Black Cave, and drop some money while lost in the dark. Lose 70 bucks.");
                            Player2.getAccount().decreaseAmount(70);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 9:
                            System.out.println("You've found huts in the mountain. The locals are generous and give you 60 bucks.");
                            Player2.getAccount().addAmount(60);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 10:
                            System.out.println("You've encountered the Werewall (werewolf-wall). It's a scary place, and you lose 80 bucks. However, you get an extra turn!");
                            Player2.getAccount().decreaseAmount(80);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            player1turn=true;
                            break;
                        case 11:
                            System.out.println("You've fallen into the pit. Lose 50 bucks.");
                            Player2.getAccount().decreaseAmount(50);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                        case 12:
                            System.out.println("You've discovered the Goldmine! Strike it rich and gain 650 bucks.");
                            Player2.getAccount().addAmount(650);
                            System.out.println("New balance of " + player2name + ": " + Player2.getAccount().getBalance());
                            break;
                    }
                }
                if (Player2.getAccount().getBalance()>=3000){
                    Game.winMessage(player2name);
                    break;
                }

            }
            player1turn= !player1turn;
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
    public static int dice(int numberOfDice, int maxFaceValue){
        int total=0;
        for (int i = 0; i < numberOfDice; i++) {
            var randomValue = Math.random();
            int dice = (int) Math.floor(randomValue * maxFaceValue) + 1;
            total += dice;
        }
        return total;
    }
}
