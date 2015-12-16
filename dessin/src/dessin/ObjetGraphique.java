package dessin;

import java.awt.*;

public abstract class ObjetGraphique {
	
	/**
	 * La couleur de l'objet graphique
	 */
	protected Color couleur;
	
	protected boolean visibility = true;
	
	/**
	 * Construit un nouvel objet graphique de couleur noire
	 */
	public ObjetGraphique()
	{
		super();
		
		couleur = Color.BLACK;
	}
	
	/**
	 * Construit un nouvel objet graphique de couleur choisie
	 * @param couleur la couleur de l'objet graphique
	 */
	public ObjetGraphique(Color couleur) {
		super();
		this.couleur = couleur;
	}

	/**
	 * @return la couleur de l'objet graphique
	 */
	public Color getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur la couleur a appliquer ‡ l'ÈlÈment
	 */
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	/**
	 * Dessine l'objet graphique
	 * @param g 
	 */
	public abstract void dessineToi(Graphics g);
	
	/**
	 * Verifie si l'objet graphique contient ou non le point aux coordonn√©es (x,y)
	 * @param x coordonn√©e x du point
	 * @param y coordonn√©e y du point
	 * @return vrai si le point est contenu dans le rectangle
	 */
	public abstract boolean contient(int x, int y);	
	
	/**
	 * DÈfini si l'objet graphique est visible ou pas
	 * @param b Faux si l'objet ne doit pas Ítre visible, vrai sinon
	 */
	public abstract void setVisibility(boolean b);
	
	/**
	 * VÈrifie la visibilitÈ de l'objet graphique
	 * @return Faux si il n'est pas visible, vrai sinon
	 */
	public abstract boolean isVisible();
}
