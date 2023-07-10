package Book;

public class Book {
	int id;
	String name;
	int price;
	static int count;
	static {
		count = 0;
	}
	public Book()
	{
		count++;
	}
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		count++;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public int getCount() 
	{
	   return count;	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
