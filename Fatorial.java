import java.util.Scanner;
public class Fatorial{
    public static void main (String[]args){
        int i=n;
        Scanner in = new Scanner (System.in);
        do{
            System.out.println("Digite o número:");
            n = in.nextInt();
            System.out.println (n+"x");
            n = n-1;
            f = f*n;
            System.out.println (n+"="+f);
            i++;
            in.close();
        }while (n>1);    
        }
    }
}