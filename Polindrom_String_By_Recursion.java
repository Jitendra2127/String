class Polindrom_String_By_Recursion
{
    public static void main(String[] args) 
    {
        String a="nameman";
        int first=0,last=a.length()-1;
        polindrom(a,first,last);  
    }
    public static void polindrom(String name,int first,int last)
    {
        if(first<=last)
        {
            System.out.println("Yes");
            return;
        }
        if(name.charAt(first)!=name.charAt(last))
        {
            System.out.println("No");
            return;
        }
        polindrom(name,first+1,last-1);
    }
}