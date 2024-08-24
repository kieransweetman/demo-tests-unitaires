package fr.diginamic.immobilier.entites;
/** Pièce de type WC
 * @author DIGINAMIC
 *
 */
public class WC extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public WC(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_WC;
	}

}