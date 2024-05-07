package defpack01;

public class Movies extends StockableProduct{
	private String director;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Movies(String name, int productId, double price, String genre, int yearPublished, double discount,
			int numberOfItemsStocked,String director) {
		super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
		this.director=director;
		
	}
	public String toString() {
		return super.toString()+"\ndirector:"+director;
	}

}
