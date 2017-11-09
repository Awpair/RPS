import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char cont = 'y';

        while (cont == 'y'){        
            int hisinput = (int)(Math.random() * 3);

            System.out.println("0 for paper, 1 for rock, 2 for scissors");
            int yourinput = input.nextInt();

            if (hisinput==(yourinput))  
                System.out.println("stalemate");

            else if (yourinput == 0)
            {
                if (hisinput == 1)
                    System.out.println ("paper beats rock : win");
                else if (hisinput == 2)
                    System.out.println ("scissors beats paper : loss");
            }

            else if (yourinput == 1)
            {
                if (hisinput == 2)
                    System.out.println ("rock beats scissors : win");
                else if (hisinput == 0)
                    System.out.println ("paper beats rock : loss");
            }

            else if (yourinput == 2)
            {
                if (hisinput == 0)
                    System.out.println ("scissors beats rock : win");
                else if (hisinput == 1)
                    System.out.println ("rock beats sciossors : loss");
            }
        }       
    }
}