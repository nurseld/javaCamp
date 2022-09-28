
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Monster",6000,5,"Grey");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		
		//System.out.println(product.name);

	}

}
