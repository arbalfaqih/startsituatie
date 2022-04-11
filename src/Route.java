// code voor opgave 1
//
public class Route
{
	public int afstand;
	public String start="???";

	public Route(int afstand) {
		bepaalAfstand(afstand);
	}

	public Route(int afstand, String start) {
		bepaalAfstand(afstand);
		this.start = start;
	}

	private void bepaalAfstand(int afstand)
	{
		if(afstand<3)
		{
			this.afstand = -1;
			System.out.println("afstand is te kort");
		}
		else this.afstand = afstand;
	}

	public int moeilijkheidsgraad(int tijd, int conditie ) {
		// voor vraag (c)
		return conditie / ( tijd * ( afstand - 3 ) );
	}

	public void setStart(String start)
	{
		if(this.start.equals("???"))
		{
			this.start = start;
		}
		else
		{
			System.out.println("mag niet");
		}
	}
}
