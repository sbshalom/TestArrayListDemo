
import java.util.Scanner;

public class Main {
//
	private static Scanner sc = null;
	
	public static void main(String[] args) {


		ProductDao productDao= new ProductDao();
		  System.out.println("Welcome to the Product Maintenance application\n");
		  sc = new Scanner(System.in);
		  displayMenu();
		  
          String action="";
		  
		  while (!action.equalsIgnoreCase("exit"))
		  {
			  action = sc.next();
			  switch (action) {
			case "menu":
				
				displayMenu();
				continue;
			case "help":
				
				displayMenu();
				continue;
				
			case "list":
				
				System.out.println(productDao.list);
				continue;
				
			case "add":
				
				System.out.println("How much to add?");
				int num=sc.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("code:");
					String code=sc.next();
					System.out.println("description:");
					String description=sc.next();
					System.out.println("price:");
				    double price=sc.nextDouble();
					Product product= new Product(code,description,price);
					productDao.addProduct(product);
				}
				System.out.println(productDao.list);
				continue;
				
			case "del":
				System.out.println("which number of index?");
				int indexNum=sc.nextInt();
				productDao.deleteProduct(productDao.list.get(indexNum));
				System.out.println(productDao.list);
				continue;
			
			case"up":	
				System.out.println();
				System.out.println("which number of index?");
				int indexNum2=sc.nextInt();
				Product product= productDao.list.get(indexNum2);
				
				productDao.updateProduct(product);
				System.out.println(productDao.updateProduct(product));
				System.out.println(product);
				System.out.println(product.getFormattedPrice());
				
				System.out.println("code:");
				String code=sc.next();
				product.setCode(code);
				
				System.out.println("description:");
				String description=sc.next();
				product.setDescription(description);;
				
				System.out.println("price:");
			    double price=sc.nextDouble();
			    product.setPrice(price);
			    System.out.println(product);
			    System.out.println(product.getFormattedPrice());
				continue;
			}
			
			 
		  }
		

	}
	
	  public static void displayMenu()
	    {
	        System.out.println("COMMAND MENU");
	        System.out.println("list    - List all products");
	        System.out.println("add     - Add a product");
	        System.out.println("up     - update a product");
	        System.out.println("del     - Delete a product");
	        System.out.println("help    - Show this menu");
	        System.out.println("exit    - Exit this application\n");
	    }
}

//ProductDao productDao= new ProductDao();
//
//
//Product product1= new Product("g","gk",78.89);
//Product product2= new Product("gtr","gtrk",54.89);
//Product product3= new Product("teg","wtegk",84.89);
//Product product4= new Product("hkg","ggjk",23.89);
//Product product5= new Product("gbvc","bvgk",10.89);
//
//productDao.addProduct(product1);
//productDao.addProduct(product2);
//productDao.addProduct(product3);
//productDao.addProduct(product4);
//productDao.addProduct(product5);
//
//System.out.println(productDao.select());
//productDao.deleteProduct(product3);
//System.out.println(productDao.select());
//
//System.out.println(productDao.list.get(0).getPrice());
//productDao.list.get(0).setPrice(34.54);
//System.out.println(productDao.list.get(0).getPrice());
//System.out.println();
//for (int i = 0; i < productDao.list.size(); i++) {
//	System.out.println(productDao.list.get(i).getPrice());
//}
