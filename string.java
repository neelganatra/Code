import java.util.Random;

public class string
{
	public static void main(String args[])
	{
		int i;

		Random r = new Random();
		char c[] = new char[5];

  		for(i=0; i<5; i++)
		{
			c[i]=(char)(r.nextInt(26)+ 'A');
		}

		for(i=0; i<5; i++)
		{
			switch(c[i])
			{
				case 'A' : System.out.println("A Is Vowel....!!!");
				break;
				
				case 'E' : System.out.println("E Is Vowel....!!!");
				break;

				case 'I' : System.out.println("I Is Vowel....!!!");
				break;

				case 'O' : System.out.println("O Is Vowel....!!!");
				break;

				case 'U' : System.out.println("U Is Vowel....!!!");
				break;

				default:
				System.out.println(c[i]);
				break;
			}
		}
	}
}