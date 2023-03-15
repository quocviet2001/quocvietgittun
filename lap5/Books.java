public class Books {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Books(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Books(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String output = "Book[name = " + this.name + ", ";
		for(Author authorss : this.authors) {
			output += authorss.toString() + ", ";
		}
		output += "price = " + this.price + ", qty = " + this.qty + "]";
		return output;
    }
}
