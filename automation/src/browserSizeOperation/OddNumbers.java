package browserSizeOperation;

public class OddNumbers {

	public static int odd(int a,int b)
	{
		
		
		while(a<=b)
		{
			if(a%2!=0)
			{
				System.out.println(a);
			}
			a++;
		}
		


		return a++;

	}





	public static void main(String[] args) {
             int a=odd(25, 50);
//             System.out.println("return :"+a);
	}

}
