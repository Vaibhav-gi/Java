class Book {
	public String title;
	public String author;
	public int year;
	public double price;
	public static int qty = 500;

	public Book(String title, String author, int year, double price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}
}

public class libraryManagement {
	public static Book[] addBook(Book[] books, Book newBook) {
		Book[] newList = new Book[books.length + 1];
		for (int i = 0; i <= books.length - 1; i++) {
			newList[i] = books[i];
		}
		newList[newList.length - 1] = newBook;
		Book.qty++;
		return newList;

	}

	public static void main(String[] args) {
		Book b1 = new Book("Java Basics", "Mahendra Sir", 2025, 500.99);
		Book b2 = new Book("Advanced Java", "Hari Kishan Sir", 2025, 499.50);
		Book b3 = new Book("Data Structures in Java", "Yashwant Sir", 2017, 450.00);
		Book b4 = new Book("Intro to MERN", "Mahesh Sir", 2025, 350.75);
		Book[] books = { b1, b2, b3, b4 };

		books = addBook(books, new Book("C language", "Kishor", 2025, 399.99));

		for (Book book : books) {
			System.out.println("Book name : " + book.title);
			System.out.println("Book Author : " + book.author);
			System.out.println("Book published year : " + book.year);
			System.out.println("Book price : " + book.price);
			System.out.println("---------------------------------------");

		}
		System.out.println("Total number of books : " + Book.qty);
		System.out.println("---------------------------------------");
	}

}