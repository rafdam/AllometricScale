package GUI;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import TreeModel.IndexCalculus;

public class TestConsolePrint {

	public TestConsolePrint() {
	}

	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            //break;
		        }
		    }
		} catch (Exception e) {
		    System.out.println("kek");
		}
		BasicFrame framcia = new BasicFrame();
		framcia.setVisible(true);
		IndexCalculus index = new IndexCalculus(8,1,5,5);
		//index.calc();
		//framcia.getPane().getCountTab().getChart().addPointsToChart(1, 1);
		//framcia.getPane().getCountTab().getChart().addPointsToChart(2, 2);
		//framcia.getPane().getCountTab().getChart().repaint();
		//framcia.getPane().getCountTab().getChart().revalidate();
	}

}
