
import java.text.NumberFormat;

public class Product 
{
    private String code;
    private String description;
    private double price;

    
    
    public Product() {
		super();
	}




	public Product(
        String code, String description, double price)
    {
        this.code = code;
        this.description = description;
        this.price = price;
    }
    
    
    

    public String getCode() {
		return code;
	}




	public void setCode(String code) {
		this.code = code;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	// get and set methods for the fields
    public void print() // implement the Printable interface
    {
        System.out.println("Code:\t\t" + code);
        System.out.println("Description:\t" + description);
        System.out.println("Price:\t\t" + 
          this.getFormattedPrice());
    }
    
    protected String getFormattedPrice()
   	{
           NumberFormat currency = 
                   NumberFormat.getCurrencyInstance();
           return currency.format(price);
   	}
    
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
