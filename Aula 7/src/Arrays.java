
public class Arrays {
	
	public static void main(String[] args) {
		
		int[] numbers;
		//int numbers[]; -> Também esta correcto
		
		numbers = new int[4]; //Instância de um array. Valor por referência, que é 0. Tipos primitivos são sempre 0.
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("");
		
		numbers[1] = 5;
		display(numbers);
		
		numbers[numbers.length-1] = 10; 
		display(numbers);
		
		// Outra forma de inicializar o array
		int[] numbers2 = {1, 2, 3, 4};
		display(numbers2);
		
		String[] strings = new String[4];
		
		String[] strings2 = {"Ola", "Adeus", " ", "buh"};
		display(strings2);
		strings[2] = null;
		display(strings2);
		
		String str = strings[1];
		System.out.println(str);
		
		Person[] persons = {new Person(), new Person()};
		
		
		
		//Arrays bidemensionais.
		String[][] strings2d = new String[2][];
		strings2d[0] = new String[2];
		strings2d[1] = new String[4];
		
		strings2d[0][0] = "Ola";
		strings2d[1][2] = "Mundo";
		display(strings2d);
		
		/* 
		 * Desenho no caderno
		 */
		
		String[][][] strings3d = new String[2][3][2];
		strings3d[0][0][0] = "Olá";
		strings3d[0][2][1] = "Mundo";
		strings3d[0][1][1] = "Rafael";
		display(strings3d);
		
		display(strings3d[1]);
		
		
	}
	private static void display(String[][][] strings){
		for(String[][] array : strings){
			display(array);
		}
		System.out.println("");
	}
	
	private static void display(String[][] strings){
		for(String[] array : strings){
			for(String string : array){
				System.out.print(string + " ");
			}
		}
		System.out.println("");
	}
	
	private static void display(int[] numbers){
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("");
	}
	
	private static void display(String[] strings){
		for (String number : strings) {
			System.out.print(number + " ");
		}
		System.out.println("");
	}

}
