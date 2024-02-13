package LearnFakeObjects;

public class BookService {

	private BookRepository bookrepo;

	public BookService(BookRepository bookrepo) {

		this.bookrepo = bookrepo;
	}

	public void addBook(Book book) {

		bookrepo.save(book);
	}

	public int noOfBook() {

		return bookrepo.bookCount().size();
	}
}
