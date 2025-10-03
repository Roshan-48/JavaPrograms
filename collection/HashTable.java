package collection;

public class HashTable {
	private int size = 16;
	private int threshHold = 0;
	
	private LinkedList[] arr = new LinkedList[size];
	
	public HashTable() {
		
	}
	
	public boolean add(Object val) {
		int hashCode = val.hashCode();
		int index = hash(hashCode);
		
		if(arr[index] == null) {
			arr[index] = new LinkedList();
			threshHold++;
			
			if(threshHold >= size*0.76) {
				resize();
				
				if(!arr[index].contains(val)){
					arr[index].addVal(val);
				}
			}
			else {
				if(!arr[index].contains(val)){
					arr[index].addVal(val);
				}
			}
		}
		else {
			if(!arr[index].contains(val)){
				arr[index].addVal(val);
			}
		}
		
		return true;
	}
	
	private int hash(int hashcode) {
		return hashcode % size;
	}
	
	private boolean resize() {
		LinkedList[] temp = new LinkedList[size*2];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		
		arr = temp;
		size = size*2;
		
		return true;
	}
	
	public String toString() {
		String ans = "";
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				ans = ans + arr[i].toString()+",";
			}
		}
		return ans;
	}
}
