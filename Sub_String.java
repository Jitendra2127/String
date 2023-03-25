import java.util.Stack;

public class Sub_String 
{
    public static void main(String[] args) 
    {
        String name="Jitendra";
        find(name,-1,5); 
        



    }   
    
    public static void find(String name,int first,int last)
    {
        String new_name="";
        if(first>=0 && last<=name.length()-1)
        {
            for(int i=first;i<=last;i++)
            {
                new_name+=name.charAt(i);
            } 
            System.out.println(new_name);
        }
        else
        {
            System.out.println("Out of bound");
        }
        
    }
}
