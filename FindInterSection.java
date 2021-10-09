package assignment.week1.day2;

public class FindInterSection {

	public static void main(String[] args) {
 
		int[] arrname1 = {3,2,11,4,6,7};
		int[] arrname2 = {1,2,8,4,9,7};
		
		for(int i=0;i<=arrname1.length-1;i++)
		{
			for(int j=0;j<arrname2.length;j++)
			{
				if(arrname1[i]==arrname2[j])
				{
					System.out.println(arrname1[i]);
				}
		}
	}

}
}
