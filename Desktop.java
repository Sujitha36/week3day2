package assignmentweek3.day2;

public abstract class Desktop implements HardWare,Software {

	public abstract void desktopModel();
	
	public void concrete() {
		System.out.println("Concrete method in Abstract class");
	}

}
