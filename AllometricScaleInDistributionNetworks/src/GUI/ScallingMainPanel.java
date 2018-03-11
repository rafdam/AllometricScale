package GUI;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

public class ScallingMainPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CountChartPanel chart;
	CountResultsPanel results;
	
	public ScallingMainPanel() {
		setLayout(new MigLayout());
		setBorder(new LineBorder(Color.BLACK, 2));
		chart = new CountChartPanel();
		results = new CountResultsPanel();
		//chart.setSize(300,200);
		add(chart, "width 70%, height 100%");
		add(results, "width 30%, height 100%");
	}
}
