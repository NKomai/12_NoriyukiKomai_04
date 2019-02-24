import java.util.Scanner;
import java.util.Random;

public class importClass {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);

        Random random = new Random();
        int rand_num = random.nextInt(num);
        System.out.println(rand_num);

        int rand_d = random.nextInt();
        System.out.println(rand_d);

    }
}
