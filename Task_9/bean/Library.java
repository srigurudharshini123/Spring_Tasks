package bean;

import java.util.List;
import java.util.Map;

public class Library {
private List <String> books;
private Map <String,String> author;

public void setBooks(List<String> books) {
	this.books = books;
}
public void setAuthor(Map<String, String> author) {
	this.author = author;
}
public void display() {
	for(String b:books) {
		System.out.println(b);
	}
	for(Map.Entry<String, String> en: author.entrySet()) {
		System.out.println(en.getKey()+" = "+en.getValue());	
	}
}
}
