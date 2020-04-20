package ca.cst.dfc.poo;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarreMenu extends JMenuBar
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenuItem itm_Quitter = new JMenuItem();
	JMenuItem itm_Charger = new JMenuItem();
	JMenuItem itm_Sauvegarder = new JMenuItem();
	JMenuItem itm_APropos = new JMenuItem();
	
	public BarreMenu()
	{
		super();
		
		itm_APropos.setText("À propos");
		itm_Quitter.setText("Quitter");
		itm_Sauvegarder.setText("Sauvegarder");
		itm_Charger.setText("Charger");
		
		JMenu menuFichier = new JMenu("Fichier");
		menuFichier.add(this.itm_Sauvegarder);
		menuFichier.add(this.itm_Charger);
		menuFichier.add(this.itm_Quitter);
		
		JMenu menuExporter = new JMenu("Exporter");

		JMenu menuModifier = new JMenu("Modifier");
		
		JMenu menuNouveau = new JMenu("Nouveau dessin");
		
		JMenu menuCouleur = new JMenu("Couleur");
		
		JMenu menuEpaisseur = new JMenu("Épaisseur");
		
		JMenu menuAide = new JMenu("Aide");
		
		menuAide.add(this.itm_APropos);
		
		this.add(menuFichier);
		this.add(menuExporter);
		this.add(menuModifier);
		this.add(menuNouveau);
		this.add(menuCouleur);
		this.add(menuEpaisseur);
		this.add(menuAide);
	}
}
