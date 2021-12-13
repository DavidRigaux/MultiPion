package multipion.graphisme.jeu;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import multipion.MultiPion;
import multipion.graphisme.Case;
import multipion.graphisme.PiecesPrises;
import multipion.jeu.Jeu;
import multipion.jeu.piece.Piece;

/**
 * Affiche les pieces prises
 */
public class PiecesPrisesJeu extends PiecesPrises{
	
	/**
	 * Reference du jeu
	 */
	private Jeu jeu;
	
	/**
	 * Constructeur
	 * @param jeu refenrence du jeu
	 * @param priseBlanc vrai si prises blanches
	 */
	public PiecesPrisesJeu(Jeu jeu, boolean priseBlanc){
		super(priseBlanc);
		this.jeu = jeu;
	}
	
	@Override
	public void paintComponent(Graphics g){
		ArrayList<Piece> priseTemp = jeu.getPrises();
		String couleur = (priseBlanc) ? "BLANC" : "NOIR";
		int x=0;
		int y=0;
		for(int i=0; i<priseTemp.size(); i++){
			Piece temp = priseTemp.get(i);
			if(couleur.equals(priseTemp.get(i).getCouleur())){
				//Dessine l'image de la piece
				char couleurFile = (couleur.equals("NOIR"))? 'n': 'b';
				Image imgPiece = null;
				try{
					imgPiece = ImageIO.read(getClass().getResource(MultiPion.RES_PATH+temp.getFamille().toLowerCase()+"_"+couleurFile+".png"));
					g.drawImage(imgPiece, x, y, this);
					x+=Case.CASE_LENGTH;
					if(x>=Case.CASE_LENGTH * 2){
						y+=Case.CASE_LENGTH;
						x=0;
					}
					
				}catch(IOException e){
					System.out.println("Impossible de charger l'image "+getClass().getResource(MultiPion.RES_PATH+temp.getFamille().toLowerCase()+"_"+couleurFile+".png"));
				}
			}
			
		}
	}

}