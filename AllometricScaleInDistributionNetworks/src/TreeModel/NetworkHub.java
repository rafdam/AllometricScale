package TreeModel;

import java.awt.List;
import java.util.ArrayList;

public class NetworkHub {
private short xCartCoord; // coordinates defined in cartesian metric system
private short yCartCoord;
private short zCartCoord;
//private int activity; // value defining if the hub is actually active in tree or not
private ArrayList<NetworkHub> neighbourList; //list of nearest neighbours
private ArrayList<Integer> neighbourIndexesList;
	
	public NetworkHub(short x, short y, short z) {
		xCartCoord = x;
		yCartCoord = y;
		zCartCoord = z;
		neighbourList = new ArrayList<NetworkHub>();
		neighbourIndexesList = new ArrayList<Integer>();
	}

	public short getxCartCoord() {
		return xCartCoord;
	}

	public void setxCartCoord(short xCartCoord) {
		this.xCartCoord = xCartCoord;
	}

	public short getyCartCoord() {
		return yCartCoord;
	}

	public void setyCartCoord(short yCartCoord) {
		this.yCartCoord = yCartCoord;
	}

	public short getzCartCoord() {
		return zCartCoord;
	}

	public void setzCartCoord(short zCartCoord) {
		this.zCartCoord = zCartCoord;
	}
	/* "old" part of the code when I inserted actually objects instead of their adress in the hubList
	public void addNeighbour(NetworkHub nH){
		neighbourList.add(nH);
	}
	
	public ArrayList<NetworkHub> getNeighbourList(){
		return neighbourList;
	}
	*/
	public void addToNeighbourIndexesList(int index){
		neighbourIndexesList.add(index);
	}
	
	public ArrayList<Integer> getNeighbourIndexesList(){
		return neighbourIndexesList;
	}
}
