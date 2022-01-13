package multipion.saveDonnees;

import multipion.jeu.pion.Piece;
import multipion.utils.Coordonnee;

public class CoupSave {
	/**
	 * Coordonnee de depart du coup
	 */
	public Coordonnee depart;
	
	/**
	 * Coordonnee d'arrivee du coup
	 */
	public Coordonnee arrivee;
	
	/**
	 * Coordonnee memoire d'arrivee du coup
	 */
	public Coordonnee departMemoire;
	
	/**
	 * Coup est une prise
	 */
	public boolean isPrise;
	

	/**
	 * Representation du coup au format PGN
	 */
	
	
	/**
	 * Reference de la piece joue
	 */
	public Piece referencePiece;
	
	/**
	 * Constructeur
	 */
	public CoupSave(){
		this.departMemoire = new Coordonnee(-1);
		this.arrivee = new Coordonnee(-1);
	}
}
