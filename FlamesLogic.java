
public class FlamesLogic {
public static void main(String[] args) {
	String s1 = "flames";int l = s1.length();int count = 10;
	int position;String temp;
	while (l != 1)
	{
		position = (count) % l;
		if ( position != 0)
		{
			temp = s1.substring(position)+s1.substring(0,position-1);
			System.out.println(temp);
		}
		else
		{
			temp = s1.substring(0,l-1);
			//System.out.println(temp);
		}
		s1 = temp;
	}
}
}
