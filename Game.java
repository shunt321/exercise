import java.util.*;

class Game {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Random random = new Random();

        System.out.println("Tossing a coin..");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who are you?");
        String name = scanner.nextLine();
        System.out.println("Hello, "+ name + "!");

        int r = 0;
        int head = 0;
        int tail = 0;
        
        for(int i = 0;i < 3;i ++) {
            r = random.nextInt(2);
            
            switch(r) {
            case 0: 
                System.out.println("Round "+ i + ": Heads");
                head++;
                break;
            case 1: 
                System.out.println("Round " + i + ": Tails");
                tail++;
                break;
            }
        }
        System.out.println("Heads: "+ head +", Tails: "+ tail);
        if(head > tail) {
            System.out.println("you won!");
        } else {
            System.out.println("you lost");
        }
    }
}
