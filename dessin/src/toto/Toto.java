package toto;

import javax.swing.*;

import java.awt.event.*;

import toto.TotoJPanel;

public class Toto extends JFrame{
	
	/**
	 * Constructeur qui redefini JFrame
	 * @param title Le titre de la fenêtre
	 */
	public Toto(String title)
	{
		super(title);
		
		TotoJPanel dessins = new TotoJPanel();
		
		// Affichage des élément
		add(dessins);
	}
	
	public static void main(String[] args)
	{
		// Création des éléments
		JFrame frame = new Toto("Toto");

		// Modification du panel
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// On affiche la frame
		frame.setVisible(true);
	}
}
