// n=4

// 4 3 2 1
// 4 3 2 
// 4 3    
// 4   
//=======================================================================================
import java.util.Scanner;
public class pattern04{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print(col);
            }
            System.out.println();
        }
        
    }
}