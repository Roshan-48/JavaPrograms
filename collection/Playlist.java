package collection;

public class Playlist {
	private String name;
	private int cap;
	private int  count;
		
	public Playlist(String name, int cap) {
		super();
		this.name = name;
		songs = new Song[cap];
	}
	
	private Song[] songs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCap() {
		return cap;
	}
	
	public void showPlaylist() {
		if(count>0) {
			for(int i=0; i<count; i++) {
				System.out.println(songs[i]+", ");
			}
			System.out.println();
		}
		else {
			System.out.println("No songs in the playlist");
		}
	}
	
	public boolean addSong(String name, String singer, String duration, String writer, String movie) {
		if(count<songs.length) {
			int i;
			Song toBeAdded = new Song(name, singer, duration, writer, movie);
			for(i=0; i<count; i++) {
				if(songs[i].equals(toBeAdded)) {
					break;
				}
			}
			if(i==count) {
				songs[count] = toBeAdded;
				count++;
				return true;
			}
			else {
				System.out.println("Song already present!");
			}
		}
		else {
			System.out.println("Playlist is full!");
		}
		return false;
	}
	
	public boolean removeSong(String name, String movie) {
		if(count!=0) {
			boolean found = false;
			int i;
			for(i=0; i<count; i++) {
				if(!found) {
					if(songs[i].getMovie().equalsIgnoreCase(name) && songs[i].getMovie().equalsIgnoreCase(movie)) {
						songs[i] = null;
						found = true;
					}
				}
				else {
					songs[i-1] = songs[i];
				}
			}
			if(found) {
				System.out.println(name+" song removed!");
				songs[count-1] = null;
				count--;
			}
			else {
				System.out.println(name+" song not found!");
			}
			return found;
		}
		else {
			System.out.println("No songs in the playlist");
			return false;
		}
	}
	
	public void shuffle() {
		for(int i=count-1; i>0; ) {
			int j = (int)(Math.random()*10);
			
			if(j>=0 && j<count) {
				Song temp = songs[i];
				songs[i] = songs[j];
				songs[j] = temp;
				
				i--;
			}
		}
	}
	
	public void nextSong() {
		if(songs[1] != null) {
			System.out.println(songs[1]);
		}
		else {
			 System.out.println("No next song available!");
		}
	}
	
	public void playNext(String name, String movie) {
		int index = searchSong(name, movie);
		System.out.println(index);
		if(index==0) {
			System.out.println("Song already Playing...");
		}
		else if(index==1) {
			System.out.println(name+" song will be played next");
		}
		else if(index>1) {
			Song temp = songs[index];
			for(int i=index; i>1; i--) {
				songs[i] = songs[i-1];
			}
			
			songs[1] = temp;
			System.out.println(name+" song will be played next");
		}
		else {
			System.out.println("Song not in the playlist!");
		}
	}
	
	public int searchSong(String name, String movie) {
		for(int i=0; i<count;i++) {
			if(songs[i].getName().equalsIgnoreCase(name) && songs[i].getMovie().equalsIgnoreCase(movie))
				return i;
		}
		return -1;
	}
	
}
