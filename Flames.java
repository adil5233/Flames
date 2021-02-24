import java.util.Scanner;

public class Flames {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string1  : ");
	String s1 = sc.nextLine();System.out.println("Enter the String2 : ");
	String s2 = sc.nextLine();
	int length = s1.length()+s2.length();int count = 0;
	for (int i = 0;i<s1.length();i++)
	{
		for (int j = 0;j<s2.length();j++)
		{
			if(s1.charAt(i) == s2.charAt(j))
			{
				count = count +1;
				break;
			}
		}
	}
	int total = length - (count*2);
	System.out.println(total);
	
	public static void main(String[] args) {
	String s1 = "flames";
	int position;String temp;
	while (s1.length() != 1)
	{
		position = (total) % s1.length();
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
}
