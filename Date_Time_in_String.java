import java.util.Scanner;
public class Date_Time_in_String 
{
   public static void main(String[] args) 
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the date and time ");
      String date_time=in.nextLine();
      //System.out.println("Previous date and time"+date_time);
      //System.out.println("Change day and months"+change(date_time));
      change(date_time);
   }   
   public static void change(String date_time)
   {
       String date="";
       String time="";
       String day="";
       String month="";
       boolean f=true;
       for(int i=0;i<date_time.length();i++)
       {
            if(date_time.charAt(i)==' ')
            {
                f=false;
                
                
            }
            if(f=true)
            {
                
                date+=date_time.charAt(i);// Print Date
                
            }
            else
            {
                time+=date_time.charAt(i);
            }
       }
       System.out.println(date);
       System.out.println(time);
   }
}
