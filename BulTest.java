import java.util.Random;
import java.util.Scanner;
public class BulTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		int [] arr =new int[4];
		System.out.println("Please guess the number");
		int guessNum = input.nextInt();
		int code = 0000;
		while(code/1000 == (code/100)%10 || code/1000 == (code/10)%10 || code/1000 == code%10 || (code/100)%10 == (code/10)%10 || (code/100)%10 == code%10 || (code/10)%10 == code%10)
		{
			code = rnd.nextInt(9999-1000+1)+1000;
		}
		Bul p1 = new Bul(code,guessNum, arr);
		System.out.println(p1.BulKliaa());
	}

}
