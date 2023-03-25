import  java.util.Scanner;
public class Check_Polindrom_In_String 
{
   public static void main(String[] args) 
   {
          Scanner in=new Scanner(System.in);
          //System.out.println("Enter the String");
         // String str=in.nextLine();
          check_By_Loop("aba");   // for loop use
          check_By_Two_Loop("aba");  // two for loop use
    }   
   
   public static void check_By_Loop(String str)
   {
      String n="";
    for(int i=str.length()-1;i>=0;i--)
    {
        n+=str.charAt(i);
    }
    System.out.println(n);
    //if(n.toLowerCase().equals(str.toLowerCase()))
    if(n.equals(str))
    System.out.println("Yes");
    else
    System.out.println("No");
   }
   public static void check_By_Two_Loop(String str)
   {
        boolean f=false;
        for(int i=0;i<=(str.length()-1)/2;i++)
        {
            for(int j=str.length()-1-i;j>=str.length()-1-i;j--)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                f=true;
                
                }
            }
        }
        if(f==false)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
   
}
