
import java.util.Scanner; 

public class TestApp {
	private Store store;
	private CopyBook copy;
	private Book myBook;
	private Scanner sc;
	
	public TestApp() {
		//System.out.print("register store name: ");
		//Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();;
		this.store = Store.getStore();
		this.copy = new CopyBook();
	}
	
	public void start() {
		System.out.println(store.name);
		String action;
		initStore();
		while (true) {
			sc = new Scanner(System.in);
			//System.out.println("choice 1: ");
			action = sc.nextLine();
			if (action.equals("status")) {
				status();
			}
			else if (action.equals("create"))
				createBook();
			else if (action.equals("init"))
				initStore();
			else if (action.equals("clone"))
				cloneBook();
			else if (action.equals("set"))
				setBook();
			else if (action.equals("get"))
				getBook();
			else if (action.equals("mybook")) {
				if (myBook == null)
					System.out.println("You not have a book");
				else
					System.out.println(myBook.info());
			}
			else
				System.out.println("again");
		}
	}
	
	public void initStore(){
		History hbook1 = new History("ww1", "YoungNo");
    	History hbook2 = new History("ww2", "YoungNo");
    	Fantacy fbook1 = new Fantacy("ender", "poohcid");
    	
    	store.setBook(hbook1);
    	store.setBook(hbook2);
    	store.setBook(fbook1);
    	
    	System.out.println(store);
	}
	
	public void status() {
		System.out.println("-----status-----");
		System.out.println("store : "+store);
		System.out.println("my book : "+myBook);
	}
	
	public void createBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("choice: --- Fantacy: 1 --- History: 2  \n");
		String type = sc.nextLine();
		sc = new Scanner(System.in);
		System.out.print("title : ");
		String title = sc.nextLine();
		sc = new Scanner(System.in);
		System.out.print("auther : ");
		String auther = sc.nextLine();
		if (type.equals("1"))
			store.setBook(new Fantacy(title, auther));
		if (type.equals("2"))
			store.setBook(new History(title, auther));
		System.out.println(store);
	}
	
	public void cloneBook() {
		if (!(myBook == null))
			System.out.println("You have a book is "+myBook);
		else {
			System.out.println(store);
			System.out.print("id : ");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			myBook = copy.cloneBook(id);
			System.out.println("My Book is "+myBook);
		}
	}
	
	public void setBook() {
		if (myBook == null)
			System.out.println("You not have a book");
		store.setBook(myBook);
		System.out.println("You set a "+myBook);
		myBook = null;
		status();
	}
	
	public void getBook() {
		if (!(myBook == null))
			System.out.println("You have a book is "+myBook);
		else {
			System.out.println(store);
			System.out.print("id : ");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			myBook = store.getBook(id);
			status();
		}
	}
}
