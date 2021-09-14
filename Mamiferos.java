public class Mamiferos extends Reino_auxiliar {
	
	
	public void print(Mamiferos v) 
	{
		
		if(v.getOvo()==true)
		{
			System.out.printf("\n\t Bota ovo: Sim ");
		}
		else
		{
			System.out.printf("\n\t Bota ovo: Nao ");
		}
		
		System.out.printf("\n\t Altura: %.0f cm ",v.getAltura());
		
		System.out.printf("\n\t Peso: %.0f g ",v.getPeso());
		
	}
	
}	
