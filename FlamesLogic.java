
public class FlamesLogic {
public static void main(String[] args) {
	String s1 = "flames";
	int count = 10;
	int position;String temp;
	while (s1.length() != 1)
	{
		position = (count) % s1.length();
		if ( position != 0)
		{
			temp = s1.substring(position)+s1.substring(0,position-1);
			System.out.println(temp);
		}
		else
		{
			temp = s1.substring(0,s1.length()-1);
		}
		s1 = temp;
	}
	System.out.println(s1);
}
}
