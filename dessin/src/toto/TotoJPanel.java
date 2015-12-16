package toto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import dessin.*;
import toto.Toto;

public class TotoJPanel extends JPanel {
	
	/**
	 * Liste des objets graphiques Ã  dessiner
	 */
	private ArrayList<ObjetGraphique> listDessins = new ArrayList<ObjetGraphique>();
	
	/**
	 * Liste des couleurs
	 */
	private ArrayList<Color> listCouleurs = new ArrayList<Color>();	
	
	/**
	 * Initialise la liste de couleurs
	 */
	public void initListCouleurs()
	{
		listCouleurs.add(Color.BLACK);
		listCouleurs.add(Color.BLUE);
		listCouleurs.add(Color.GREEN);
		listCouleurs.add(Color.RED);
		listCouleurs.add(Color.ORANGE);
		listCouleurs.add(Color.WHITE);
	}
	
	/**
	 * Change la couleur de l'objet graphique selon la liste listCouleurs
	 * @param obj l'objet graphique dont la couleur doit changer
	 * @return la couleur suivant celle de l'objet graphique passé en paramètre
	 */
	public Color changeCouleur(ObjetGraphique obj)
	{		
		Color result = null;
		result = obj.getCouleur();

		int index = listCouleurs.indexOf(result);
		int sizeList = listCouleurs.size();
		
		result = ((index+1) < sizeList)?listCouleurs.get(index+1):listCouleurs.get(0);
		
		return result;
	}
	
	/**
	 * Constructeur qui ajoute à la liste les dessins
	 */
	public TotoJPanel() {
		Point p = new Point(200,200);
		Point p2 = new Point(160,150);
		Point p3 = new Point(240,150);
		
		final Cercle cercleTete = new Cercle(p, 100);
		final Cercle cercleGauche = new Cercle(p2, 20);
		final Cercle cercleDroit = new Cercle(p3, 20);
		final Rectangle recBouche = new Rectangle(150, 220, 100, 40);
		
		listDessins.add(cercleTete);
		listDessins.add(cercleGauche);
		listDessins.add(cercleDroit);
		listDessins.add(recBouche);
		
		JButton b = new JButton("Tete");
		JButton b2 = new JButton("Oeil gauche");
		JButton b3 = new JButton("Oeil droit");
		JButton b4 = new JButton("Bouche");
		
		add(b); add(b2); add(b3); add(b4);
		
		// Event bouton Tete
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(listDessins.get(0).isVisible())
				{
					listDessins.get(0).setVisibility(false);
				}
				else 
				{
					listDessins.get(0).setVisibility(true);
				}
				TotoJPanel.this.repaint();
			}
		});
		
		// Event bouton Oeil gauche
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(listDessins.get(1).isVisible())
				{
					listDessins.get(1).setVisibility(false);
				}
				else 
				{
					listDessins.get(1).setVisibility(true);
				}
				TotoJPanel.this.repaint();
			}
		});
		
		// Event bouton Oeil droit
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(listDessins.get(2).isVisible())
				{
					listDessins.get(2).setVisibility(false);
				}
				else 
				{
					listDessins.get(2).setVisibility(true);
				}
				TotoJPanel.this.repaint();
			}
		});
		
		// Event bouton Bouche
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(listDessins.get(3).isVisible())
				{
					listDessins.get(3).setVisibility(false);
				}
				else 
				{
					listDessins.get(3).setVisibility(true);
				}
				TotoJPanel.this.repaint();
			}
		});
		
		// On initialise la liste des couleurs
		initListCouleurs();
		
		// Event sur le clique de la souris
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				super.mouseClicked(e);
				
				if(listDessins.get(1).contient(e.getX(), e.getY()))
				{
					listDessins.get(1).setCouleur(changeCouleur(listDessins.get(1)));
					TotoJPanel.this.repaint();
				} 
				else if(listDessins.get(2).contient(e.getX(), e.getY()))
				{
					listDessins.get(2).setCouleur(changeCouleur(listDessins.get(2)));
					TotoJPanel.this.repaint();
				}
				else if(listDessins.get(3).contient(e.getX(), e.getY()))
				{
					listDessins.get(3).setCouleur(changeCouleur(listDessins.get(3)));
					TotoJPanel.this.repaint();
				}
				else if(listDessins.get(0).contient(e.getX(),  e.getY()))
				{
					listDessins.get(0).setCouleur(changeCouleur(listDessins.get(0)));
					TotoJPanel.this.repaint();
				}
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(ObjetGraphique objetCourant : listDessins)
		{
			if(objetCourant.isVisible())
			{
				objetCourant.dessineToi(g);
			}
		}
	}
	
}
