// code voor opgave 3
//even hier wat aanpassen
public class Garage
{
	//garage commenteer toegevoegd
	private Vliegtuig vliegtuig;

	public void zetInGarage( Vliegtuig v ) { vliegtuig = v; }

	public void upgrade( String upgradeNaam ) {
		// de nieuwe naam voor het Vliegtuig
		upgradeNaam = vliegtuig.getNaam() + upgradeNaam;

		// upgrade het Vliegtuig
		Vliegtuig upgrade = new Vliegtuig( upgradeNaam );

		// en update de Garage
		zetInGarage( upgrade );
	}
}
