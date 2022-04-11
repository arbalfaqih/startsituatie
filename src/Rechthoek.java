// code voor opgave 2
//
public class Rechthoek
{
	private int lengte;
	private int breedte;
	private int kleur;

	public Rechthoek( int lengte, int breedte, int kleur ) {
		this.lengte = lengte;
		this.breedte = breedte;
		this.kleur = kleur;
	}

	public boolean equals( Rechthoek obj ) {
		if ( this.kleur == r.kleur ) {
			return true;
			// ik heb iets aangepast
		}
		return
			this.lengte == r.lengte || this.breedte == r.breedte
							&&
			this.lengte == r.breedte || this.breedte == r.lengte;
	}
}
