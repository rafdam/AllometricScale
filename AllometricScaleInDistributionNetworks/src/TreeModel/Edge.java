package TreeModel;

public class Edge {
private int startHubAdress; // Like below the direction of the graph gonna be added with grad of the hubs;
private int endHubAdress;
private double weight; //First the edge weight gonna be calculated just by euclidean distance;
					// After that it will be changed to grad between the hubs on the Z axis;
	public Edge(int hub1Adress, int hub2Adress, HubList list) {
		weight = Math.sqrt((list.get(hub1Adress).getxCartCoord() - list.get(hub2Adress).getxCartCoord()) ^ 2
				+ (list.get(hub1Adress).getyCartCoord() - list.get(hub2Adress).getyCartCoord()) ^ 2
				+ (list.get(hub1Adress).getzCartCoord() - list.get(hub2Adress).getzCartCoord()) ^ 2);
		startHubAdress = hub1Adress;
		endHubAdress = hub2Adress;
	}
	
	public int getStartHubAdress(){
		return startHubAdress;
	}
	
	public int getEndHubAdress(){
		return endHubAdress;
	}
	
	public double getWeight(){
		return weight;
	}
}