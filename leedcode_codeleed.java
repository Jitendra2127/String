class leedcode_codeleed
{
    public static void main(String[] args) 
    {
        Solution n=new Solution();
        int arr[]={4,5,6,7,0,2,1,3};
        String name=n.restoreString("codeleet",arr);
        System.out.println(name);
    }
}
class Solution {
    public String restoreString(String s, int[] indices) 
    {
        
        
        char m[]=s.toCharArray();
        System.out.println(m);
        for(int i=0;i<s.length();i++)
        {
            m[indices[i]]=s.charAt(i);
        }
        return String.valueOf(m);

    }
}
// class Solution {
//     public String restoreString(String s, int[] indices) {
        
//         char[] str= s.toCharArray();
        
//         for(int i=0;i<s.length();i++)
//         {
//            str[indices[i]]=s.charAt(i);
            
//         }
//         // System.out.println(str);
        
//         return String.valueOf(str);
//     }
// }




