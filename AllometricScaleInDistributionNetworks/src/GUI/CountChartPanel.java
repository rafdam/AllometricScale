package GUI;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CountChartPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CountChartPanel() {
		Color color = new Color(235,235,252);
		setBackground(color);
		setBorder(new LineBorder(Color.BLACK, 2));
	}
}
