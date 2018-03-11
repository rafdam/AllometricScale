package TreeModel;

import java.util.ArrayList;

public class MinimalSpanningTree {
private EdgeList edges = new EdgeList();
	public MinimalSpanningTree(HubList list, int hubNumber) {
		int levelCount = 1;
		int iterAdress = hubNumber;
		int tmpAdress;
		ArrayList<Integer> checkedHubAdresses = new ArrayList<Integer>(); // list of hubs reached by the network edges
		ArrayList<Integer> adressesToCheck = new ArrayList<Integer>(); //list of hubs to check their neighbours
		
		adressesToCheck.add(iterAdress);
		checkedHubAdresses.add(hubNumber);
		for (int ii = 0; ii < adressesToCheck.size(); ii++){
			for (int jj = 0; jj < list.get(adressesToCheck.get(ii)).getNeighbourIndexesList().size();jj++){
				tmpAdress = list.get(adressesToCheck.get(ii)).getNeighbourIndexesList().get(jj);
				if(checkedHubAdresses.contains(tmpAdress)){
					//do nothing, get another adress
				}
				else{
					checkedHubAdresses.add(tmpAdress);
					list.get(tmpAdress).setLevel(list.get(adressesToCheck.get(ii)).getLevel() + 1);
					edges.add(new Edge(adressesToCheck.get(ii), tmpAdress, list.get(adressesToCheck.get(ii)).getLevel()+1));
					adressesToCheck.add(tmpAdress);
					//System.out.println(tmpAdress);
				}
			}
			//System.out.println("-------------------------------");
		}
	}
	
	public int MinimalRequiredAmount(){
		int amount = 0;
		for (int ii = 0; ii < edges.size(); ii++){
			amount += edges.get(ii).getWeight();
		}
		return amount;
	}
	
	
}
