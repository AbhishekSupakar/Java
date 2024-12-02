class  LibraryBook
	{
	String bookId, bookTitle;
	boolean isAvailable;
	public void displayBookInfo(){
		System.out.println("Book name : "+bookTitle);
		System.out.println("Book ID : "+bookId);
		System.out.println("Book's Availablelity : "+isAvailable);
	}
	public static boolean borrowBook(boolean isAvaliable){
		if(isAvaliable==true){
			System.out.println("Marked book is available");	
			return isAvaliable=false;
		}
		else
			{
			System.out.println("Marked book is Unavailable");
			return isAvaliable=false;
		}
	}
	public static boolean returnBook(boolean isAvaliable){
		if(isAvaliable == false){
			System.out.println("Now book is avaliable");
			return isAvaliable = true;
		}
		else{
			System.out.println("Now book is not avaliable");
			return isAvaliable = false;
		}
	
	}

	public static void main(String[] args) 
	{
		System.out.println("-------------Book no.1---------------");
		LibraryBook s1= new LibraryBook();
		s1.bookId="123B1";
		s1.bookTitle="Narendra Phokhari";
		s1.isAvailable=false;
		s1.displayBookInfo();
		borrowBook(s1.isAvailable);
		s1.isAvailable=returnBook(s1.isAvailable);
		borrowBook(s1.isAvailable);
		

	}
}
