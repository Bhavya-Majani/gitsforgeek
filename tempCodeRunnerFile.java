import java.util.*;
public class MetaString
{
public static void main(String args[])
{
int i,j,pos1=-1,pos2=-1,cnt=0; char c1,c2;
Scanner sc =new Scanner(System.in); System.out.println("Enter 1st String"); String str1=sc.nextLine(),str=""; System.out.println("Enter 2nd String"); String str2=sc.nextLine(); str1=str1.toUpperCase(); str2=str2.toUpperCase();

int l1=str1.length(); int l2=str2.length();
if(str1.equalsIgnoreCase(str2)==true)
{
System.out.println("Not a meta String");
}
else if(l1==l2)
{
for(i=0;i<l1;i++)
{
c1=str1.charAt(i); c2=str2.charAt(i); if(c1!=c2)
{
cnt++; if(pos1==-1)
{
pos1=i;
}
pos2=i;

}
}

if(cnt==2)
{
    for(i=0;i<l1;i++)
    {
    c1=str1.charAt(i); c2=str2.charAt(i); if(i==pos1)
    {
    str=str+str2.charAt(pos2);
    }
    else
    {
    str=str+c1;
    }
    }
    }
    else
    {
    System.out.println("Not a Meta String");
    }
    }
    if(str.equalsIgnoreCase(str1)==true)
    {
    System.out.println("MetaString");
    }
    else
    System.out.println("Not a metastring");
    }
}    