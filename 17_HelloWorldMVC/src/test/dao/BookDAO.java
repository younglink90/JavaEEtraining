package test.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	private List<Book> books = new ArrayList<Book>(Arrays.asList(
				new Book[] {
						new Book("El Quijote",1596,1,"Cervantes",false),
						new Book("El Señor de Los Anillos",1968,1,"Tolkien",true)
				}
			));

	public List<Book> readAll() {
		return books;
	}
	
	public List<String> readAllAuthors() {
		return Arrays.asList(new String[]{
			"Cervantes","Tolkien","Carlos Rodriguez","Belen Esteban"	
		});
	}
	
	public Book create(Book toCreate) {
		System.out.println("Registering " + toCreate);
		if (!books.contains(toCreate)) {
			books.add(toCreate);
			return toCreate;
		} else return null;
	}
			
	
}
