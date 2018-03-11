package GUI;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel simulationTab, chartAndCountTab;	
	
	public TabbedPane() {
		simulationTab = new JPanel();		
		addTab("Visualization", simulationTab);	
		chartAndCountTab = new JPanel();
		addTab("Allometric Scalling", chartAndCountTab);
	}
}
