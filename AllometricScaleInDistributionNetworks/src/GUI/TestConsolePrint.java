package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import TreeModel.MinimalSpanningTree;
import TreeModel.TreeMap;

public class TestConsolePrint {

	public TestConsolePrint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int test1;
		double test2;
		short test3;
		/*
		test1= Integer.parseInt((JOptionPane.showInputDialog("Please input L Val for test : ")));
		test2= Double.parseDouble((JOptionPane.showInputDialog("Please input P Val for test : ")));
		test3= Short.parseShort((JOptionPane.showInputDialog("Please input K Val for test : ")));
		*/
		test1 = 40;
		test2 = 0.70;
		test3 = 15;
		long start = System.currentTimeMillis();
		TreeMap map = new TreeMap(test1, test2, test3);
		MinimalSpanningTree tree = new MinimalSpanningTree(map.getNetwork(), 10);
		long elapsedTime = System.currentTimeMillis() - start;
		JFrame frame = new JFrame();
		frame.setVisible(true);
		int size = map.getNetwork().getSize();
		System.out.println(tree.MinimalRequiredAmount());
		JOptionPane.showMessageDialog(frame, "Size: " + size + " Time: " + elapsedTime);
		//System.out.println("---------------------------------------------");
		//for (int ii = 0; ii < size; ii++){
		//	System.out.println(map.getNetwork().get(ii).getNeighbourIndexesList().size());
		//}
	}

}
