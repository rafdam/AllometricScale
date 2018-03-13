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
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import net.miginfocom.swing.MigLayout;

public class CountChartPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	XYSeries dataSet;
	XYSeriesCollection xySeriesCollection;
	XYDataset xyDataset;
	ChartPanel chartPanel;
	JFreeChart scatterPlot;
	public CountChartPanel() {
		setLayout(new MigLayout());
		Color color = new Color(232,232,252);
		setBackground(color);
		setBorder(new LineBorder(Color.BLACK, 2));
	
		chartPanel = new ChartPanel(null);
		add(chartPanel, "width 100%, height 100%");           	
	    dataSet= new XYSeries("");
	   	xySeriesCollection = new XYSeriesCollection(dataSet);
	   	xyDataset = xySeriesCollection;
	   	scatterPlot = ChartFactory.createXYLineChart
	        ("Wykres",  // Title
	          "3*Log(L)",           // X-Axis label
	          "Log(C)",           // Y-Axis label
	          xyDataset,          // Dataset
	          PlotOrientation.VERTICAL,        //Plot orientation
	          true,                //show legend
	          true,                // Show tooltips
	          false               //url show
	         );
	}
	
	public XYSeries getDataSet(){
		return dataSet;
	}
	
	public XYSeriesCollection GetSeriesCollection(){
		return xySeriesCollection;
	}
	
	public ChartPanel getChartPanel(){
		return chartPanel;
	}
	
	public void addPointsToChart(double x, double y){
		dataSet.add(x,y);
		xySeriesCollection = new XYSeriesCollection(dataSet);
		xyDataset = xySeriesCollection;
		scatterPlot.getXYPlot().setDataset(xyDataset);
		scatterPlot.getXYPlot().getRangeAxis().setAutoRange(true);
		chartPanel.setChart(scatterPlot);	 
		repaint();
		revalidate();
	}

}
