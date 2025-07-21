// n=4

//       1
//     2 1
//   3 2 1
// 4 3 2 1

//=======================================================================================
import java.util.Scanner;
public class pattern05{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            
            int st=a;
            int sp=n-st;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=st;j>0;j--){
                System.out.print(j);
            }
           a++;
            System.out.println();

        }
        sc.close();
    }
}