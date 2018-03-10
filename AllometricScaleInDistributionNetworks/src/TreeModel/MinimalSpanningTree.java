package TreeModel;

import java.util.ArrayList;

public class MinimalSpanningTree {
private EdgeList edges;
	public MinimalSpanningTree(HubList list, int hubNumber) {
		int levelCount = 1;
		int iterAdress = hubNumber;
		int tmpAdress;
		int neighboursCount = 0;
		edges = new EdgeList();
		ArrayList<Integer> checkedHubAdresses = new ArrayList<Integer>();
		ArrayList<Integer> adressesToCheck = new ArrayList<Integer>();
		ArrayList<Integer> tmpAdressesToCheck = new ArrayList<Integer>();
		
		adressesToCheck.add(iterAdress);
		checkedHubAdresses.add(hubNumber);
		neighboursCount = list.get(iterAdress).getNeighbourIndexesList().size();
		//while (tmpHubAdresses.size() < list.size()){
			for (int ii = 0; ii < adressesToCheck.size(); ii++){
				for (int jj = 0; jj < list.get(adressesToCheck.get(ii)).getNeighbourIndexesList().size();jj++){
					tmpAdress = list.get(adressesToCheck.get(ii)).getNeighbourIndexesList().get(jj);
					if(checkedHubAdresses.contains(tmpAdress)){
						//do nothing, get another adress
					}
					else{
						checkedHubAdresses.add(tmpAdress);
						edges.add(new Edge(hubNumber, tmpAdress, levelCount));
						adressesToCheck.add(tmpAdress);
						System.out.println(tmpAdress);
					}
				}
				System.out.println("-------------------------------");
			}
			
			
			
			
			
			
			
			
			
			
			
			/*
			*	for (int jj = 0; jj < neighboursCount; jj++){
			*		for (int ii = 0; ii < list.get(iterAdress).getNeighbourIndexesList().size();ii++){
			*			tmpAdress = list.get(iterAdress).getNeighbourIndexesList().get(ii);
			*			if (tmpHubAdresses.contains(tmpAdress)){
			*				//go to next hub
			*			}
			*			else{
			*				tmpHubAdresses.add(tmpAdress);
			*				edges.add(new Edge(hubNumber, tmpAdress, levelCount));
			*				adressesToCheck.add(tmpAdress);
			*			}
			*		}
			*	}
			*/
				
		//}
	}
}
