package GUI;

import TreeModel.TreeMap;

public class TestConsolePrint {

	public TestConsolePrint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TreeMap map = new TreeMap(40, 0.8, 5);
		System.out.println(map.getNetwork().getSize());
	}

}
