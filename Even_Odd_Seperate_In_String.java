class Even_Odd_Seperate_In_String 
{
    public static void main(String[] args) 
    {
       String name="Jitendra";
       evenodd(name);  
    }
   
    public static void evenodd(String name)
    {
        String even="";
        String odd="";
        for(int i=0;i<name.length();i++)
        {
            if(i%2!=0)
            {
                even+=name.charAt(i);
            }
            else
            {
                odd+=name.charAt(i);
            }
        }
        System.out.println("Even\t"+even);
        System.out.println("Odd\t"+odd);
    }
}
