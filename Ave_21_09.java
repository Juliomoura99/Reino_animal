
public class Ave extends Animal {

//---------------------------SOM-----------------------------
	public String obterSom() {
		String s = "Som emitido: ";
		s+= super.getEmitirSom();
		return s;
	}

	public void imprimirSom() {
		System.out.println(this.obterSom());
	}
//-----------------------------------------------------------
	



}
