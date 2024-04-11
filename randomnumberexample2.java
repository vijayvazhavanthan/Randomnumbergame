import java.util.Random;  
import java.lang.*;
import java.io.*; 
import java.util.*;
public class randomnumberexample2  
{   
	public static void main(String args[])throws IOException 
	{  
		int i,b,c,d ;
		int a[] = new int[100];  
		Random random = new Random();    
		int x = random.nextInt(100);
		//System.out.println(x);
		int q;
		do
		{
			System.out.println("***************************************************************************");
			System.out.println("       ****************Welcome Number Guessing Game*****************");
			System.out.println("***************************************************************************");
			System.out.println(" \n");
			System.out.println("Are you ready for Number Guessing");
			System.out.println("  \n");
			System.out.println("Start the game enter we( yes ) or (no) **click 1 Means  yes, 2 Means no**");
			DataInputStream in = new DataInputStream(System.in);
			int m=Integer.parseInt(in.readLine());
			
			switch(m)
			{
				case 1:
				i=1;
				while(i<100)
				{
					//System.out.println("  \n");
					//System.out.println("   \n ");
					System.out.println("   \n ");
					System.out.println("**Enter the My Guessing Number :");
					a[i]=Integer.parseInt(in.readLine());
					if(x==a[i])
					{
						System.out.println("  \n");
						System.out.println("^^^^Great job your given number is correct answer^^^^");
						break;
					}else if(x<a[i])
						{
							System.out.println("  \n");
							System.out.println("||Almost given number is biggest whoever my guessing number small||*");
							i++;		
							continue;
						}
						else
						{
							b=x-a[i];
							if( 4<i && 10>b)
							{
								c=x+5;
								d=a[i]+1;
								System.out.println("  \n");
								System.out.println("||One  is glue given between than"+ d );
								System.out.println("and ||"+ c);
								i++;
								continue;
							}else if(10<b && 20>b)
								{
									System.out.println("  \n");
									System.out.println("||Almost near the number||");
									i++;
									continue;
								}
								else
								{
									System.out.println("  \n");
									System.out.println("||give greater than number||");
									i++;
									continue;
								}
						}

				}
							
				break;
			case 2:
				System.out.println("  \n");
				System.out.println("*****Game is close*****");
				break;
			default:
				System.out.println("  \n");
				System.out.println("***Default message***");
			}
			System.out.println("  \n");
			System.out.println("***We can continue yes 1 or no o***");
			q =Integer.parseInt(in.readLine());
		}while(q==1);
	
	}
}