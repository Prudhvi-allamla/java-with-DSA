// n=4

//  1
//  2 2
//  3 3 3
//  4 4 4 4
//=======================================================================================
import java.util.Scanner;
public class number_pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int z=i;
            for(int j=1;j<=i;j++){
                System.out.print(z);
                
            }   
            System.out.println(" ");
        }
    }
}