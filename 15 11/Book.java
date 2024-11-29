/*
Q4. WAP for 2 authors with different name.
    a. There are different books with different title and no. of pages
    but the price of both the books are same.
    Define a method to display the details of the book.
    Take proper no, of objects to initialize the details of book.
*/

class Book{
String AuthorName, BookName;
int pages;
static double price = 149.99;
	public static void main(String []args){
	Book b1 = new Book();
	Book b2 = new Book();
	b1.BookName = "The complete adventures of feluda";
	b1.AuthorName = "Satyajit Ray";
	b1.pages = 804;
	b2.BookName = "Combat of shadows";
	b2.AuthorName = "Manohar Malgonkar";
	b2.pages = 136;
	System.out.println("Book Name is : "+b1.BookName+"\nAuthor's Name: "+b1.AuthorName+"\nPages: "+b1.pages+"\nThe price of both the book: "+price);
	System.out.println("-------------------------------------------------------");
	System.out.println("Book Name is : "+b2.BookName+"\nAuthor's Name: "+b2.AuthorName+"\nPages: "+b2.pages+"\nThe price of both the book: "+price);
	}

}