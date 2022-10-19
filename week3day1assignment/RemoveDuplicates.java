package week3day1assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="We learn java basics as part of java sessions in java week1";
		
		int count;
		String[]splitText=text.split("");
	
	
		System.out.println("String Array after split"+ Arrays.toString());
		 for(int i=0;i<splitText.length;i++)
		 {
			 count=1;
			 for(int j=0;j<splitText.length;j++)
			 {
				 count++;
				 
			 }
			 if (count>1)
			 {
				 repText=text.replaceAll(splitText[j],"");
				 
			 }
				
			 System.out.println(repText);
		 }

}
}
