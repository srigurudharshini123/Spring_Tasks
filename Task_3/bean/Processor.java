package bean;

public class Processor {
private int id;
private String gb;
private String process;

public Processor(int id, String gb, String process) {
	this.id = id;
	this.gb = gb;
	this.process = process;
}

@Override
public String toString() {
	return "Processor :  id=" + id + ", gb=" + gb + ", process=" + process;
}

}
