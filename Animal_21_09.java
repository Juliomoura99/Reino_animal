
public abstract class Animal {
		
	//-------------------------SOM----------------------------
	private String EmitirSom;

	public String getEmitirSom() {
		return EmitirSom;
	}
	
	public void setEmitirSom(String EmitirSom) {
		this.EmitirSom = EmitirSom;
	}
	
	public abstract void imprimirSom();
	
	public abstract String obterSom();
	
	//--------------------------------------------------------
	
	
}
