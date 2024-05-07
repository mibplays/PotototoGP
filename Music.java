package defpack01;

public class Music extends StockableProduct{
	private String artistName;
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public Music(String name, int productId, double price, String genre, int yearPublished, double discount,
			int numberOfItemsStocked,String artistName) {
		super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
		this.artistName=artistName;
	}
	public String toString() {
		return super.toString()+"\nartistName:"+artistName;
	}

}
