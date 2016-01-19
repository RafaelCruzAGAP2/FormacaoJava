
public class Store {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Rafael");
		
		Product p1 = new Product();
		p1.id = 1;
		p1.name = "Batatas";
		p1.price = 0.6f;
		
		Product p2 = new Product();
		p2.id = 2;
		p2.name = "Ervilhas";
		p2.price = 0.8f;
		
		Product p3 = new Product();
		p3.id = 3;
		p3.name = "Cebolas";
		p3.price = 1.5f;
		
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.customer = customer;
		shoppingCart.products = new Product[10];
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		shoppingCart.addProduct(p3);
		System.out.println("Total: " + shoppingCart.total);
		System.out.println("Customer Name: " + customer.getName());
		shoppingCart.customer.setName("Eu");
		System.out.println("Shopping Cart Customer: " + shoppingCart.customer.getName());
		
		
		shoppingCart.removeProduct(p1.id);
		
		shoppingCart.printProducts();
		
		shoppingCart.finish();
		System.out.println("Finished: " + shoppingCart.isFinished());
		

	}

}
