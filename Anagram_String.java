import java.util.Arrays;

//   two string anagam if one string all character is equal to the second string
//   and his character position any position .....

//   input--->jitu,tuji,ituj,tuij....etc

  

public class Anagram_String 
{
   public static void main(String[] args) 
   {
        String s1="Aitendra";
        String s2="Atendira";
        check(s1,s2);
   } 

   public static void check(String s1,String s2)
   {
       char []new_s11=s1.toCharArray();
       char[]new_s22=s2.toCharArray();
       char [] new_s1=sortt(new_s11);
       char [] new_s2=sortt(new_s22);   //Arrays.sort(new_s22);  used function
       int count=0;
       if(new_s1.length==new_s2.length)
       {
            for(int i=0;i<new_s1.length;i++)
            {
                if(new_s1[i]==new_s2[i])
                {
                    count+=1;
                }
            }
       }
       if(count==new_s1.length)
       {
        System.out.println("Yes");
       }
       else
       {
        System.out.println("No");
       }
   }
   public static char[] sortt(char []a)
   {
       char temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
   }
}
