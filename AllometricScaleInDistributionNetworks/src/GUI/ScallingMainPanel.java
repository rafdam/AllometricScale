package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

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
		add(chart, "width 70%, height 100%");
		add(results, "width 30%, height 100%");
	}
	
	public CountResultsPanel getResults(){
		return results;
	}
	
	public CountChartPanel getChart(){
		return chart;
	}
}
