import java.util.Scanner;
public class exponents_4and5 {
    public static void main (String[] args){
        int N;
        Scanner Input=new Scanner(System.in);
        System.out.println("enter a number:");
        N = Input.nextInt();
        for (int i=1, j=1; i <=N && j <=N; i*=4, j*=5){
            System.out.println("4 exponent is:" +i+";" + "5 exponent is:" +j);
        }
    }
}
