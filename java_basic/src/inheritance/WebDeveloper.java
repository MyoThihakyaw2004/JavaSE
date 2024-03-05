package inheritance;

public class WebDeveloper extends Developer {
	
	public WebDeveloper() {
		super();
		System.out.println("Inside WebDeveloper NoArgs Constructor");
	}

	public void createWebApp() {
		System.out.println(name + "is creating a web app");
	}
}
