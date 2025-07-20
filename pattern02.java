// n=4

//  1
//  1 2 
//  1 2 3 
//  1 2 3 4 
//=======================================================================================
import java.util.Scanner;
public class number_pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int z=1;
            for(int j=1;j<=i;j++){
                
                System.out.print(j);
                z++;
                
                
            }   
            System.out.println(" ");
        }
    }
}