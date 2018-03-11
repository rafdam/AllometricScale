package TreeModel;

import java.util.ArrayList;

public class IndexCalculus {
	private ArrayList<Double> logLVals;
	private ArrayList<Double> logCVals;
	public IndexCalculus(int startL, int jump, int jumpCount, int piece){
		logLVals = new ArrayList<Double>();
		logCVals = new ArrayList<Double>();
		int endL = startL + (jump * jumpCount);
		for (int ii = startL; ii < endL ; ii = ii+jump){
			MinimalSpanningTree tmpSpanTree = new MinimalSpanningTree(new TreeMap(ii, 0.7,15).getNetwork(), (int)(ii * ii * ii * 0.7 / (piece + 1)));
			logLVals.add(3 * Math.log10(ii));
			logCVals.add((Math.log10(tmpSpanTree.MinimalRequiredAmount())));
			System.out.println("L = " + ii);
			System.out.println("C = " + tmpSpanTree.MinimalRequiredAmount());
		}
		
	}
	
	public ArrayList<Double> getLogLVals(){
		return logLVals;
	}
	
	public ArrayList<Double> getLogCVals(){
		return logCVals;
	}
	
	public double calc(){
		double index = 0;
		double averageL = 0;
		double averageC = 0;
		double xysum = 0;
		double xyQuadSum = 0;
		double size = logLVals.size();
		for (int jj = 0; jj < size; jj++){
			averageL += logLVals.get(jj);
			averageC += logCVals.get(jj);
			System.out.println("LOG L = " + logLVals.get(jj));
			System.out.println("LOG C = " + logCVals.get(jj));
		}
		averageL = averageL / size;
		averageC = averageC / size;
		for (int ii = 0; ii < size; ii++){
			xysum += (logLVals.get(ii) - averageL)*(logCVals.get(ii) - averageC);
			xyQuadSum += Math.pow(logLVals.get(ii) - averageL, 2);
		}
		System.out.println("średnie 3*Log(L) = " + averageL);
		System.out.println("średnie Log(C) = " + averageC);
		index = xysum/xyQuadSum;
		return index;
	}
}
