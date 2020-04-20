/**
 * 
 */
package ca.cst.dfc.poo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author dombl
 *
 */
public class GestionBouton extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton btn_Ligne = new JButton();
	JButton btn_Elipse = new JButton();
	JButton btn_Rectangle = new JButton();
	
	public GestionBouton()
	{
		super();
		
		/**
		 * Création des boutons
		 */
		try 
		{
			Image imgLigne = new ImageIcon(this.getClass().getResource("/Ligne.png")).getImage();
			btn_Ligne.setIcon(new ImageIcon(imgLigne));
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
		try 
		{
			Image imgCercle = new ImageIcon(this.getClass().getResource("/Cercle.png")).getImage();
			btn_Elipse.setIcon(new ImageIcon(imgCercle));
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
		try 
		{
			Image imgRectangle = new ImageIcon(this.getClass().getResource("/Rectangle.png")).getImage();
			btn_Rectangle.setIcon(new ImageIcon(imgRectangle));
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
		this.setBorder(new LineBorder(Color.BLACK, 1));
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(8,1));
		this.setPreferredSize(new Dimension(50,90));
		this.add(btn_Ligne);
		this.add(btn_Elipse);
		this.add(btn_Rectangle);	
	}
	
	
}
