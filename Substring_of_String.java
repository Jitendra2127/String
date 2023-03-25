class Substring_of_String 
{
    public static void main(String[]args)
    {
        String a="Name";
        String b="";
        int x=0;
        substring(a,b,x);
    }   
    public static void substring(String a,String sub,int x)
    {
        if(x==a.length())
        {
            System.out.print(sub+",");
            return;
        }
        substring(a,sub+a.charAt(x),x+1);
        substring(a,sub,x+1);
    }
}
