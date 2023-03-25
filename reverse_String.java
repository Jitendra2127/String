
public class reverse_String 
{
      public static void main(String[] args) {
        String name="Jitendra";
        // reverse(name);
        System.out.println(by_recursion(name));
      }   
      // By the itretion
      public static void reverse(String name)
      {
        String new_name="";
        for(int i=name.length()-1;i>=0;i--)
        {
            new_name+=name.charAt(i);
        }
        System.out.println(new_name);
      }
      // by the recursion
      public static String by_recursion(String name)
      {
           String new_name="";
           if(name.length()==0)
           {
              return new_name;
           }
           new_name+=name.charAt(name.length()-1);
           return by_recursion(name.substring(0,name.length()-1-1));
      }
}
