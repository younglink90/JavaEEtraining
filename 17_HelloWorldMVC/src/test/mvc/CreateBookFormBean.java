package test.mvc;

import test.dao.Book;

public class CreateBookFormBean {

	private Book book;
	private String coverType;
	
	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		System.out.println(coverType);
		this.coverType = coverType;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
