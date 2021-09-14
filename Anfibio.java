
public class Anfibio extends Reino_auxiliar {
	

	public void print(Anfibio a) 
	{
		
		if(a.getPele()==true)
		{
			System.out.printf("\n\t Pele grossa: Sim ");
		}
		else
		{
			System.out.printf("\n\t Pele grossa: Nao ");
		}
		
		System.out.printf("\n\t Altura: %.0f cm ",a.getAltura());
		
		System.out.printf("\n\t Peso: %.0f g ",a.getPeso());
		
		

	}
	
}

