// n=4

// 4 3 2 1
// 3 2 1
// 2 1
// 1

//=======================================================================================
import java.util.Scanner;
public class pattern06{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        int n=sc.nextInt();
        for(int row=n;row>0;row--){
            int a=row;
            for(int col=a;col>0;col--){
                System.out.print(col);
            }
            
            System.out.println( );
        }
        
    }
}