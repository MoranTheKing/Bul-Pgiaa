import java.util.Scanner;
public class Bul
{
	private int code;
	private int guessNum;
	private int arr[] = new int[4];

	public Bul(int code, int guessNum, int[] arr)
	{
		this.code = code;
		this.guessNum = guessNum;
		this.arr[0] = code/1000;
		this.arr[1] = (code/100)%10;
		this.arr[2] = (code/10)%10;
		this.arr[3] = code%10;
	}
	
	public String BulKliaa()
	{
		String tozaa ="";
		int countBul=0,countKliaa=0, index1=0;
		Scanner input = new Scanner(System.in);
		if(this.guessNum>=1000 && this.guessNum<=9999)
		{
			while(tozaa!="Finished")
			{
				
				if(this.arr[0]==this.guessNum/1000)
				{
					countBul++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				else if(this.arr[0]==(this.guessNum/100)%10 || this.arr[0]==(this.guessNum/10)%10 || this.arr[0] ==this.guessNum%10)
				{
					countKliaa++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				if(this.arr[1]==(this.guessNum/100)%10)
				{
					countBul++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				else if(this.arr[1]==this.guessNum/1000 || this.arr[1]==(this.guessNum/10)%10 || this.arr[1] ==this.guessNum%10)
				{
					countKliaa++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				if(this.arr[2]==(this.guessNum/10)%10)
				{
					countBul++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				else if(this.arr[2]==this.guessNum/1000 || this.arr[2]==(this.guessNum/100)%10 || this.arr[2] ==this.guessNum%10)
				{
					countKliaa++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				if(this.arr[3]==this.guessNum%10)
				{
					countBul++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				else if(this.arr[3]==this.guessNum/1000 || this.arr[3]==(this.guessNum/10)%10 || this.arr[3] ==(this.guessNum/10)%10)
				{
					countKliaa++;
					tozaa="Bul: " +countBul+", Kliaa: " + countKliaa;
				}
				
				if(countBul==4)
				{
					tozaa = "Finished after " + index1 + " times.";
					return tozaa;
				}
				else if(tozaa=="")
				{
					System.out.println("Bul: 0, Kliaa: 0");
				}
				else
				{
					System.out.println(tozaa);
				}
				countBul=0;
				countKliaa=0;
				index1++;
				System.out.println("Please guess the number");
				this.guessNum = input.nextInt();
			}
		}
			return "Error code";
	}
	
}
