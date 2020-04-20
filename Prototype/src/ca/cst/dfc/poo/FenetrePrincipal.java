/**
 * 
 */
package ca.cst.dfc.poo;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * @author dombl
 *
 */
public class FenetrePrincipal extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5329789853708641068L;	
	
	public FenetrePrincipal()
	{
		super("Paint en moins bien");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750,500);;
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		this.add(new EspaceTravail(), BorderLayout.CENTER);
		this.add(new GestionBouton(), BorderLayout.WEST);
		this.add(new BarreMenu(), BorderLayout.NORTH);
		

	}
}
