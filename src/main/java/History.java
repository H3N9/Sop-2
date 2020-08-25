

public class History extends Book{

	public History(String name, String author) {
		super(name, author);
		this.type = "History";
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	@Override
	public Book clone() {
		// TODO Auto-generated method stub
		return new History(this.title, this.author);
	}

}
