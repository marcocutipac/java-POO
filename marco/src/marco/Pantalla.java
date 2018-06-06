package marco;

public class Pantalla {

	public static void main(String[] args) {
		
		Monitor monitor1=new Monitor("lED", 1080, 110, "LG");
		Monitor ejemplo=new Monitor ("LCD", 720, 92, "SAMSUNG");
		System.out.println(monitor1.toString ());
		System.out.println(ejemplo.toString ());
		
	
	}
	
	

}
