// n=4

    //       1
    //      222
    //     33333
    //    4444444

//=======================================================================================
import java.util.Scanner;
public class pattern07{
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
                System.out.print(row);
                
            }
            for(int col=1;col<=st-1;col++){
                System.out.print(row);
            }
            System.out.println(" ");
            
        }
        
    }
}