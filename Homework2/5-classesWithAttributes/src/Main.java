
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");            /*product.name = "Laptop";*/
		product.setId(1);                     /*product.id = 1;*/ 
		product.setDescription("Monster");    /*product.description = "Monster";*/
		product.setPrice(6000);               /*product.price = 6000;*/
		product.setStockAmount(5);            /*product.stockAmount = 5;*/
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		
		//System.out.println(product.name);
		
	
	}

}
