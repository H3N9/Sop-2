

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Store store = Store.getStore();
    	History hbook = new History("Name", "YoungNo");
    	History fbook = new History("No", "YoungNo");
    	
    	System.out.println(store.getBooks());
    	
    	CopyBook copy = new CopyBook();
    	
    	History copy1 = (History)copy.cloneBook(hbook);
    	store.setBook(copy1);
    	
    	System.out.println(store.getBook("2"));
    	
    	
    }
}
