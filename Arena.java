public class Arena 
{
    private Player player1;
    private Player player2;
    private Dice dice;

    public Arena(Player player1, Player player2) 
    {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

    public void fight() 
    {
        System.out.println("The fight begins!");
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while(attacker.isAlive() && defender.isAlive()) 
        {
            takeTurn(attacker, defender);

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("Winner: " + (attacker.isAlive() ? attacker.getName() : defender.getName()));
    }

    private void takeTurn(Player attacker, Player defender) 
    {
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;

        int netDamage = Math.max(0, attackDamage - defenseStrength);
        defender.takeDamage(netDamage);

        System.out.println(attacker.getName() + " attacks with damage " + attackDamage + ", " + defender.getName() + " defends with " + defenseStrength + ". Net damage: " + netDamage);
        System.out.println(defender.getName() + " health: " + defender.getHealth());
    }
}
