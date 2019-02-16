package jspServlet.vo;

public class Product {
	private String id;
	private String path;
	private String name;
	private String introduce;
	private String price;
	private String state;
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getPath(){
		return path;
	}
	public void setPath(String path){
		this.path=path;
	}
	public String getName() {
		return name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
