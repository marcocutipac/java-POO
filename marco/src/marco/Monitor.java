package marco;

public class Monitor {

	private int tipo;
	private String resolucion1;
	private String dimension;
	private int marca;

	public Monitor(int pTipo, String pResolucion, String pDimension, int pMarca) {
	
		tipo=pTipo;
		resolucion1=pResolucion;
		dimension=pDimension;
		marca=pMarca;
	}

	
	public Monitor(String resolucion, int tipo, int marca, String diemsion) {
		// TODO Auto-generated constructor stub
	}


	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getResolucion() {
		return resolucion1;
	}
	public void setResolucion(String resolucion) {
		this.resolucion1 = resolucion;
	
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public int getMarca() {
		return marca;
	}
	public void setMarca(int marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "El monitor es de tipo "+tipo+" con resolucion "+resolucion1+""
				+ " tienes una dimension "+dimension
				+ " y es de marca"+marca+"";
			
	}
	
	
	
	
}
