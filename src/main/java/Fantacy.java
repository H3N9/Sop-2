
public class Fantacy extends Book{

	public Fantacy(String name, String author) {
		super(name, author);
		this.type = "Fantacy";
	}

	
	public String getType() {
		return type;
	}


	@Override
	public Book clone() {
		// TODO Auto-generated method stub
		return new Fantacy(this.title, this.author);
	}

}
