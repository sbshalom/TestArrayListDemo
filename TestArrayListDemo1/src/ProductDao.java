
import java.util.ArrayList;


public class ProductDao implements Dao{

	
	ArrayList<Product> list= new ArrayList<>() ;
	
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		list.add(p);
	}

	@Override
	public ArrayList<Product> select() {
		// TODO Auto-generated method stub
		
		return list;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return list.contains(p);
		
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		list.remove(p);
	}

	

}

