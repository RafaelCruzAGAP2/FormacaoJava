
public class Operadores {
	
	public static void main(String[] args) {
		int i = 0, j = 0;
		if(i==0)
		if(j>=0)
			System.out.println("Sim");
		else
			System.out.println("Não");
		
		switch(i){
		case 0: 
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default: 
				System.out.println("Outra coisa");
		}
		
		byte b = 1;
		switch(b){
		
		}
		
		short s = 1;
		switch(s){
		
		}
		
		char c = 'R';
		switch(c){
		
		}
		
		String k = "OLA";
		switch(s){
		
		}
		
		
		int aux = 10;
		if(aux == 10)
			System.out.println("É 10");
		else
			System.out.println("Não é 10");
		
		//                     |
		//É o mesmo que isto   V
		
		System.out.println((aux == 10) ? "É 10" : "Não é 10"); //Funciona por causa do overloading
		
		System.out.println(aux == 10 ? "É 10" : 90); //Funciona por causa do overloading. Não é preciso parêntises para comparar
		
		Object bl = (aux == 10) ? "É 10" : 90; //Funciona porque é do tipo object.
		
		System.out.println(2 & 3);
		
		System.out.println(9 ^ 1);
		
	}

}
