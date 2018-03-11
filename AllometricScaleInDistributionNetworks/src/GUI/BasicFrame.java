package GUI;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import GUI.TabbedPane;
import net.miginfocom.swing.MigLayout;

public class BasicFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BasicFrame() throws HeadlessException {
		super();
		setSize(1300,900);
		setLayout(new MigLayout());
		setTitle("Allometric Scalling in distribution networks");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		TabbedPane tabbedPane = new TabbedPane(); //pane with cards" Charges, Help..."
		add(tabbedPane,"width 100%, height 100%");
	}

	public BasicFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public BasicFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public BasicFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
