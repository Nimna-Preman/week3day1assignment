package week3day1assignment;

public class ReversetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String rev="";
		 char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			
			rev =rev+ch[i];
			
		}
if (rev.equals(s))
	System.out.println("it is a palindrome");
else
	System.out.println("not a palindrome");
	}

}
