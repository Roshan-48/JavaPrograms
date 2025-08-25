package collection;

public class PlayListDriver {
	public static void main(String[] args) {
		
		Playlist p1 = new Playlist("Sad Song", 10);
		
		p1.addSong("Channa Mereya", "Arijit Singh", "4:50", "Amitabh Bhattacharya", "Ae Dil Hai Mushkil");
        p1.addSong("Agar Tum Saath Ho", "Alka Yagnik", "5:41", "Irshad Kamil", "Tamasha");
        p1.addSong("Kal Ho Naa Ho", "Sonu Nigam", "5:21", "Javed Akhtar", "Kal Ho Naa Ho");
        p1.addSong("Tera Ban Jaunga", "Akhil Sachdeva", "3:56", "Kumaar", "Kabir Singh");
        p1.addSong("Phir Le Aya Dil", "Rekha Bhardwaj", "6:30", "Sayeed Quadri", "Barfi");
        p1.addSong("Tum Hi Ho", "Arijit Singh", "4:22", "Mithoon", "Aashiqui 2");
        p1.addSong("Jeene Bhi De Duniya Hume", "Arijit Singh", "3:40", "Manoj Muntashir", "Dil Sambhal Jaa Zara");
        p1.addSong("Kabira", "Tochi Raina", "3:43", "Amitabh Bhattacharya", "Yeh Jawaani Hai Deewani");
        p1.addSong("Dil Diyan Gallan", "Atif Aslam", "4:20", "Irshad Kamil", "Tiger Zinda Hai");
        p1.addSong("Khairiyat", "Arijit Singh", "4:30", "Amitabh Bhattacharya", "Chhichhore");
        
        p1.showPlaylist();
        p1.removeSong("Kal Ho Naa Ho", "Kal Ho Naa Ho");
        
        p1.shuffle();
        p1.nextSong();
        p1.playNext("Kabira", "Yeh Jawaani Hai Deewani");
	}
}
