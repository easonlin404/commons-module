package threadImpl;

public class Resource {
	private String name;
	private int resource;
	
	public Resource(String name, int resource){
		this.name = name;
		this.resource = resource;
	}
	
	public int doSome(){
		return ++resource;
	}
	
	public void copperatere(Resource resource){
		resource.doSome();
		System.out.println(this.name +""  + getName());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResource() {
		return resource;
	}

	public void setResource(int resource) {
		this.resource = resource;
	}

}
