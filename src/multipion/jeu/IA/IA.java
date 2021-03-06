package multipion.jeu.IA;

import multipion.utils.Coordonnee;

/**
 * Interface pour une IA
 *
 */
public interface IA {
	
	/**
	 * Fonction qui fait jouer l'ia
	 */
	void jouer();
	
	/**
	 * Permet de recuperer la coordonnee a jouer par le jeu
	 * @return
	 */
	public Coordonnee getCoordonneeAJouer();
	
}