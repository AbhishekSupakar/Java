public class LibraryBooks  {
        int bookId;
        String bookTitle;
        boolean isAvailable = true;
        public void  borrowBook(){
            if(isAvailable){
                System.out.println("The book " + bookTitle + " borrow by user...");
                isAvailable = false;
            }
            else{
                System.out.println("You can't borrow this book, this book already borrowed by someone..");
            }
        }
        public void returnBook(){
              if(!isAvailable){
                isAvailable = true;
                System.out.println("Book returned successfully...");
              }
              else{
                System.out.println("You can't return the book, you have to borrow any book first");
              }
        }
        public  void displayBookInfo(){
            System.out.println("BOOK Id is " +bookId);
            System.out.println("car owner name is  "+bookTitle);
        }
        public static void main(String[] args) {
            LibraryBook details= new LibraryBook();
            details.bookId=67534;
            details.bookTitle="PINKU";
            details.displayBookInfo();
            details.borrowBook();
            details.borrowBook();
            details.returnBook();
    ����}
����
����}