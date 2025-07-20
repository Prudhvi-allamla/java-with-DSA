// n=4

// 1 2 3 4
//   1 2 3
//     1 2
//       1
//=======================================================================================
import java.util.Scanner;
public class patterns03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=n;row>0;row--){
            int st=row;
            int sp=n-st;
            for(int col=1;col<=sp;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=st;col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}