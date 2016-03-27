package hw;

public class StringFar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="KUSUMA";
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}

	}

}
