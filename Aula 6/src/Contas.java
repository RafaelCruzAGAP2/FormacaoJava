
public class Contas {

	public static void main(String[] args){
		{
		int i = 10;
		System.out.println(i * 10 + --i - 2);
		System.out.println(i * 10 + i-- - 2);
		
		int number = 10;
		int total = number++ * (23 - 13) + ((--number) - 2);
		System.out.println(total);
		
		boolean b;
		
		if(b = false)
			System.out.println("Olá");
		
		int a, c;
		if((a = 1) == (c = 1))
			System.out.println("Adeus");
		}
		
		{
			//Cast
			byte b = 16; //Promoção
			short s = b; //Promoção
			b = (byte) 256;
			//b = (byte) true; Não funca porque não se sabe o valor de boolean
			System.out.println("B: "+b +" S: "+s);
			
		}
		
		{
			System.out.println(1 / 2); //Devolve inteiro
			
			System.out.println(1 / 2.0); //Devolve decimal
		}
		
		{
			short s = 120;
			char c = 120;
			if ( c == s) //Vai buscar os valores
				System.out.println("BUH");
			
			
			
			float f = 1.2f;
			double d = 1.2;
			if(f == d)
				System.out.println("HELLO");
		}
	}
}
