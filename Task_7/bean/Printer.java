package bean;

public class Printer {
private int pages;
private String filename;
public void setPages(int pages) {
	this.pages = pages;
}
public void setFilename(String filename) {
	this.filename = filename;
}
public void display() {
	System.out.println("Filename: "+filename+"\nNo.of.Pages: "+pages);
}
}
