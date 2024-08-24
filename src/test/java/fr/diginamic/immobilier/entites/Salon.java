package fr.diginamic.immobilier.entites;
/** Pièce de type salon
 * @author DIGINAMIC
 *
 */
public class Salon extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public Salon(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return TYPE_SALON;
	}
}