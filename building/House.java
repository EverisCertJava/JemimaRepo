package building;

import library.Book;

public class House extends Book {
	public House(){
		
	}
	
	public static void doSomething(){
		Book book= new Book();
		
		book.author="ABC";
		//book.modifyTemplate();
		
		System.out.println(book.author);
	}
}
