// n=4

    //       1
    //      121
    //     12321
    //    1234321

//=======================================================================================
import java.util.Scanner;
public class pattern09{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            int st=row;
            int sp=n-st;
            for(int col=1;col<=sp;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=st;col++){
                System.out.print(col);
                
            }
            for(int col=st-1;col>0;col--){
                System.out.print(col);
            }
            System.out.println(" ");
            
        }
        
    }
}