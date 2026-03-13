package proyecto1;
import java.util.Scanner;
public class Prog1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>=15){
            t = sc.nextInt();
        }
        int a[] = new int[t];
        int b[] = new int[t];
        for(int i=0; i<t; i++){
            a[i]=sc.nextInt();
            while(a[i]>=1000000001){
                a[i]=sc.nextInt();
            }
            b[i]=sc.nextInt();
            while(b[i]>=1000000001){
                b[i]=sc.nextInt();
            }   
        }
        for(int i=0;i<t;i++){
            if(a[i]<b[i]){
                System.out.println("<");
            }else if(a[i]>b[i]){
                System.out.println(">");
            }else{
                System.out.println("=");
            }
        }

	}

}
