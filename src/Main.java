import java.util.Scanner;
public class Main {
    static public void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of stars please: ");
        int starsNumber= input.nextInt();
        starsNumber=starsNumber-1;

        for(int i=starsNumber; i>=0; i--) {
            System.out.print(" ");
            int x = starsNumber-i;

            for (int y=0; y<= x; y++  ) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
