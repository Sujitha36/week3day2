package assignmentweek3.day2;

public class Executionclass extends Desktop {

	public void hardwareResources() {
		System.out.println("Hardware Resource method from First Interafce");
	}

	public void softwareResources() {
		System.out.println("SoftwareResources method from Second interface");
	}

	@Override
	public void desktopModel() {
		System.out.println("DesktopModel from Abstract class");
	}

	public static void main(String[] args) {
		Executionclass obj = new Executionclass();
		obj.hardwareResources();
		obj.softwareResources();
		obj.desktopModel();
		obj.concrete();

	}}