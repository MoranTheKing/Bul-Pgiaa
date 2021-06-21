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
		int code = 0000;
		int firstDigit = code/1000;
		int secondDigit = (code/100)%10;
		int thirdDigit = (code/10)%10;
		int fourthDigit = code%10;
		while(firstDigit == secondDigit || firstDigit == thirdDigit || firstDigit == fourthDigit || secondDigit == thirdDigit || secondDigit == fourthDigit || thirdDigit == fourthDigit)
		{
			code = rnd.nextInt(9999-1000+1)+1000;
		}
		System.out.println("Please guess the number");
		int guessNum = input.nextInt();
		Bul p1 = new Bul(code,guessNum, arr);
		System.out.println(p1.BulKliaa());
	}

}
