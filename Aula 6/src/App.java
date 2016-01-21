public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Rafael"; //
		
		String name2 = new String("Rafael");

		
		System.out.println(name1 == name2);
		
		Integer i1 = 10;
		Integer i2 = 10;
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		String str = "olá caro ";
				str+= "Olá outra vez ";
				str+= "HEY!";
		System.out.println(str);
				
		StringBuilder stb = new StringBuilder("olá caro ").append("Olá outra vez ").append("HEY!");
		
		System.out.println(stb);
		
		int x= 10;
		method(x);
		
		String txt = "asd";
		method(txt);
	}
	
	public static int method(int x){
		return x;
		
	}
	
	public static void method(String str){
		System.out.println(str);
	}

}
