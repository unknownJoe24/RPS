import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        Rand testClass = new Rand();
        String input;
        //game loop
        do {
            System.out.println("Rock, Paper, or Scissors (r,p,s), q to quit: ");
            input = test.readLine();

            if (Objects.equals(input, "q")) {
                break;
            }

            String cpu = testClass.randInput();
            System.out.println(input + " vs " + cpu);
            if (Objects.equals(input, cpu)) {
                System.out.println("Draw");
            } else if (Objects.equals(input, "r") && Objects.equals(cpu, "s")) {
                System.out.println("You win!");
            } else if (Objects.equals(input, "p") && Objects.equals(cpu, "r")) {
                System.out.println("You win!");
            } else if (Objects.equals(input, "s") && Objects.equals(cpu, "r")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            cpu = " ";
            input = " ";
        } while (!Objects.equals(input, "r") && !Objects.equals(input, "p") && !Objects.equals(input, "s"));

        System.out.println("Good-bye!");

    }
}

class Rand {
    public String randInput() {
        int upperBound = 3;
        Random rand = new Random();

        int num = rand.nextInt(upperBound);

        switch (num) {
            case 0:
                return "r";
            case 1:
                return "p";
            case 2:
                return "s";
        }

        return " ";
    }
}