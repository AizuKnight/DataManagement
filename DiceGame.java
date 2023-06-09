import java.util.Random;

class DiceGame {
    public static void main(String[] args) {
        new DiceGame().run();
    }

    private void run() {
        System.out.println("Rolling dice...");
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        System.out.println("Die 1: " + die1);
        int die2 = random.nextInt(6) + 1;
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + (die1+die2));
        if(die1+die2 >= 7) System.out.println("You won!");
        else System.out.println("You lost!");
    }
}
