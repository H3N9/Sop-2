

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Store store = Store.getStore();
    	History hbook1 = new History("ww1", "YoungNo");
    	History hbook2 = new History("ww2", "YoungNo");
    	Fantacy fbook1 = new Fantacy("ender", "poohcid");
    	
    	store.setBook(hbook1);
    	store.setBook(hbook2);
    	store.setBook(fbook1);
    	
    	System.out.println(store);
    	
    	CopyBook copy = new CopyBook();
    	
    	History copy1 = (History) copy.cloneBook(hbook1);
    	Fantacy copy2 = (Fantacy) copy.cloneBook(fbook1);
    	store.setBook(copy1);
    	store.setBook(fbook1);
    	store.setBook(copy2);
    	
    	System.out.println(store);
    	Book book = store.getBook("3");
    	System.out.println(book);
    	System.out.println(store);
    	
    	store.setBook(book);
    	System.out.println(store);
    	
    }
}
