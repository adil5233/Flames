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




	
	
}
}
