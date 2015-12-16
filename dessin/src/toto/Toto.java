package toto;

import javax.swing.*;

import java.awt.event.*;

import toto.TotoJPanel;

public class Toto extends JFrame{
	
	/**
	 * Constructeur qui redefini JFrame
	 * @param title Le titre de la fen�tre
	 */
	public Toto(String title)
	{
		super(title);
		
		TotoJPanel dessins = new TotoJPanel();
		
		// Affichage des �l�ment
		add(dessins);
	}
	
	public static void main(String[] args)
	{
		// Cr�ation des �l�ments
		JFrame frame = new Toto("Toto");

		// Modification du panel
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// On affiche la frame
		frame.setVisible(true);
	}
}
