package defpack01;

public class Game extends StockableProduct{
	private String developer;
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public Game(String name, int productId, double price, String genre, int yearPublished, double discount,
			int numberOfItemsStocked,String developer) {
		super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
		this.developer=developer;
		
	}
	public String toString() {
		return super.toString()+"\ndeveloper:"+developer;
	}
	

}
