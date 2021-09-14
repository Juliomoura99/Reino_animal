public class Reino_principal {

	public static void main(String[] args) {
		
		Anfibio sapo = new Anfibio ();   
		Anfibio salamandra = new Anfibio ();   
		Mamiferos ornitorrinco = new Mamiferos ();
		Mamiferos pessoa = new Mamiferos ();
		
		salamandra.setAltura(120);
		salamandra.setPele(false);
		salamandra.setPeso(25000);
		
		sapo.setAltura(10);
		sapo.setPele(true);
		sapo.setPeso(19);
		
		ornitorrinco.setAltura(1.20);
		ornitorrinco.setOvo(true);
		ornitorrinco.setPeso(18000);
		
		pessoa.setAltura(170);
		pessoa.setOvo(false);
		pessoa.setPeso(70000);
		


		System.out.println("Ornitorrinco:");
		ornitorrinco.print(ornitorrinco);
		System.out.println("\nPessoa:");
		pessoa.print(pessoa);
		System.out.println("\nSalamandra:");
		salamandra.print(salamandra);
		System.out.println("\nSapo:");
		sapo.print(sapo);
		
		}
	
}
