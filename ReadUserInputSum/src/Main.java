import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int numCounter = 0;

        while(numCounter < 10){
            System.out.println("Enter number #" + numCounter);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int curNum = scanner.nextInt();
                sum += curNum;
                numCounter++;
            } else {
                break;
            }
        }
        System.out.println(sum);
        scanner.close();

    }

}
