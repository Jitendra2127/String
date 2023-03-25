public class Uppe 
{
   public static void main(String[] args) {
    count("SumA+B=1:");
   }
   public static void count(String num)
   {
    int count_capital=0;
    int count_small=0;
    int s=0;
    int count_number=0;
    for(int i=0;i<num.length();i++)
    {
        if(num.charAt(i)>=65 && num.charAt(i)<=90)
        count_capital+=1;
        if(num.charAt(i)>=97 && num.charAt(i)<=122)
        count_small+=1;
        if(num.charAt(i)>=48 && num.charAt(i)<=57)
        count_number+=1;
        else
        s+=1;
        
    }
    System.out.println("count_capital "+count_capital);
    System.out.println("count_small "+count_small);
    System.out.println("Specila "+s);
    System.out.println("count_number"+count_number);

   }   
}
