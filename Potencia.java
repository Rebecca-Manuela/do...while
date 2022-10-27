import java.util.Scanner;
public class Potencia{
    public static void main (String[]args){
        int i=1, b, e, p;
        Scanner in = new Scanner (System.in);
        do{
            System.out.println ("Digite o valor da base:");
            b = in.nextInt();
            System.out.println ("Digite o valor do expoente:");
            e = in nextInt();
            p = b*e;
            System.out.println ("A potência é:"+p);
            i++;
            in.close();
        }while (i<e);    
        }
    }
}