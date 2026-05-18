package bean;

public class Battery {
private int gb;
private String work;
public void setGb(int gb) {
	this.gb = gb;
}
public void setWork(String work) {
	this.work = work;
	
}
@Override
public String toString() {
	return "gb=" + gb + ", work=" + work;
}

}
