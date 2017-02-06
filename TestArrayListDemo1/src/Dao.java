
import java.util.ArrayList;


public interface Dao {

	  void addProduct(Product p);
	  ArrayList<Product> select();
	  boolean updateProduct(Product p);
	  void deleteProduct(Product p);
}
