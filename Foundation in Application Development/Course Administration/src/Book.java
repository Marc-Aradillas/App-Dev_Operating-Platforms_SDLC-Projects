
public class Book {
	final static int MAX_AMOUNT_OF_PAGES = 500;
	final static int MIN_AMOUNT_OF_PAGES = 50;
	
	String title;
	String[] authors;
	
	int yearReleased, nrOfPages;
	int copiesSold = 0;
	
	public static void main(String[] args) {
		Book superLargeBook = new Book();
		superLargeBook.title = "Super Large Boring Book";
		superLargeBook.nrOfPages = 1400;
		
		System.out.println("Check if your book has a correct amount of pages...");
		System.out.println("- Minimum amount: " +Book.MIN_AMOUNT_OF_PAGES);
		System.out.println("- Your book: "+superLargeBook.nrOfPages);				
		}
	}
