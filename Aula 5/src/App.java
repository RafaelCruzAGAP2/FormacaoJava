public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}

			int i = 0;
			while (i < args.length) {
				System.out.println(args[i]);
				i++;
			}

			for (String str : args) {
				System.out.println(str);
			}
		}
		{
			int i = 0;
			do {
				System.out.println(args[i]);
				i++;
			} while (i < args.length);
		}

	}

}
