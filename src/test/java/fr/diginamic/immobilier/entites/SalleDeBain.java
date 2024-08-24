package fr.diginamic.immobilier.entites;
/** Pièce de type salle de bain
 * @author DIGINAMIC
 *
 */
public class SalleDeBain extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public SalleDeBain(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_SDB;
	}

}