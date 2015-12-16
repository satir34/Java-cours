package dessin;

import java.awt.*;

public class Rectangle extends ObjetGraphique {
	
	/**
	 * un objet de type Rectangle
	 */
	private java.awt.Rectangle r;

	/**
	 * Construit un nouveau rectangle à la position (0,0), de couleur noire, de largeur et hauteur 300
	 */
	public Rectangle() {
		r = new java.awt.Rectangle(0,0,300,300);
		couleur = Color.BLACK;
	}
	
	/**
	 * Construit un nouveau rectangle
	 * @param x defini la position en x du rectangle
	 * @param y defini la position en y du rectangle
	 * @param largeur defini la largeur du rectangle
	 * @param hauteur defini la hauteur du rectangle
	 */
	public Rectangle(int x, int y, int largeur, int hauteur)
	{
		r = new java.awt.Rectangle(x, y, largeur, hauteur);
	}
	
	/**
	 * Construit un nouveau rectangle
	 * @param p defini la position du rectangle
	 * @param largeur defini la largeur du rectangle
	 * @param hauteur defini la hauteur du rectangle
	 */
	public Rectangle(Point p, int largeur, int hauteur)
	{
		r = new java.awt.Rectangle(p.x, p.y, largeur, hauteur);
	}
	
	/**
	 * Construit un nouveau rectangle
	 * @param p defini la position du rectangle
	 * @param largeur defini la largeur du rectangle
	 * @param hauteur defini la hauteur du rectangle
	 * @param c defini la couleur du rectangle
	 */
	public Rectangle(Point p, int largeur,int hauteur,Color c)
	{
		r = new java.awt.Rectangle(p.x, p.y, largeur, hauteur);
		couleur = c;
	}
	
	@Override
	public void dessineToi(Graphics g)
	{
		g.setColor(couleur);
		g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
	}
	
	@Override
	public boolean contient(int x, int y)
	{
		return r.contains(x, y);
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
