package org.com;

public class Desktop implements HardWare, SoftWare {
	public void desktopModel(String b) {
		System.out.println("lenovo");
	}
	public void hardwareResources() {
		System.out.println("cpu");
		System.out.println("mouse");
	}
	public void softwareResources() {
		System.out.println("linux");
		System.out.println("windows");
		
	}
	public static void main(String[]args) {
		
		Desktop d=new Desktop();
		d.desktopModel("mmm");
		d.hardwareResources();
		d.softwareResources();
		HardWare h=new Desktop();
		h.hardwareResources();
		SoftWare s=new Desktop();
		s.softwareResources();
	}
	
	


}
