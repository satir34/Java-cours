package dessin;

import java.awt.*;

public class Cercle extends ObjetGraphique {
	
	/**
	 * Centre du cercle
	 */
	private Point centre;
	/**
	 * Rayon du cercle
	 */
	private int rayon;
	
	/**
	 * Construit un nouveau cercle
	 */
	public Cercle() {
		this.rayon = 50;
		couleur = Color.BLACK;
	}
	
	/**
	 * Construit un nouveau cercle
	 * @param centre defini la position du centre du cercle
	 * @param rayon defini le rayon du cercle
	 */
	public Cercle(Point centre, int rayon)
	{
		this.centre = centre;
		this.rayon = rayon;
	}
	
	/**
	 * Construit un nouveau cercle
	 * @param centre defini la position du centre du cercle
	 * @param rayon defini le rayon du cercle
	 * @param c defini la couleur du cercle
	 */
	public Cercle(Point centre, int rayon, Color c)
	{
		this.centre = centre;
		this.rayon = rayon;
		couleur = c;
	}
	
	@Override
	public void dessineToi(Graphics g) 
	{
		g.setColor(couleur);
		g.drawOval((this.centre.x-rayon), (this.centre.y-rayon), rayon*2, rayon*2);
	}
	
	@Override
	public boolean contient(int x, int y) 
	{
		return (Math.pow((x-this.centre.x),2)+Math.pow((y-this.centre.y),2)) <= Math.pow(rayon,2);
	}
	
	@Override
	public void setVisibility(boolean b) 
	{
		visibility = b;
	}
	
	@Override
	public boolean isVisible()
	{
		return visibility;
	}
}
