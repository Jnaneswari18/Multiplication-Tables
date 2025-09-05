package multtable;
import java.util.Scanner;
public class MultTable 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number to display its Table : ");
        int n=sc.nextInt();
        System.out.println(n+" Table");
        for(int i=1;i<=10;i++)   
        {
          System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
