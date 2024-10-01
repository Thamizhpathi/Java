package lastoccur;
import java.util.*;
public class Remtooctal{
//Decimal to octal value
    static String Dectonbase(int n,int num){
        int rem=0;
        String result="";
        while(num!=0){
            rem=num%n;
            if(rem>9){
                result+=(char)(87+rem);{
                	
                }
                
            }
            else{
                result+=rem;
            }
            num=num/n;
        }
        return result;      
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        System.out.print(Dectonbase(n,num));
        sc.close();
    }
}