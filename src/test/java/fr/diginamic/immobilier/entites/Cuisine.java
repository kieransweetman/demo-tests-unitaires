package fr.diginamic.immobilier.entites;
/** Pièce de type cuisine
 * @author DIGINAMIC
 *
 */
public class Cuisine extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public Cuisine(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_CUISINE;
	}

}