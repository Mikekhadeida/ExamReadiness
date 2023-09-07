import java.util.Scanner;
public class p1 {
    public static void (String [] args ){
        Scanner input = new Scanner (System.in);
        double smallest =0;
        int header = input.nextInt();
        smallest = input.nextDouble();
        for (int i = 1; i<header; i++){
            double w = input.nextDouble();
            if (w<smallest)
                smallest=w;
        }
        System.out.println(smallest);
    }
}
