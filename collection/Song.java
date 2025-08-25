package collection;

public class Song {
	private String name;
	private String singer;
	private String duration;
	private String writer;
	private String movie;
	
	public Song() {
		
	}
	public String getName() {
		return name;
	}
	public String getSinger() {
		return singer;
	}
	public String getDuration() {
		return duration;
	}
	public String getWriter() {
		return writer;
	}
	public String getMovie() {
		return movie;
	}
	
	public Song(String name, String singer, String duration, String writer, String movie) {
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
		this.writer = writer;
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "[Name:" + name + ",Singer:" + singer + ",Duration:" + duration +"]";
	}
	
	public boolean equals(Object o) {
		Song s = (Song)o;
		return this.name.equalsIgnoreCase(s.name)&& this.singer.equalsIgnoreCase(s.singer)&& this.writer.equalsIgnoreCase(s.writer) && this.duration.equalsIgnoreCase(s.duration) && this.movie.equalsIgnoreCase(s.movie);
	}	
	
	public int hashCode() {
		return name.hashCode()+writer.hashCode()+singer.hashCode()+duration.hashCode()+movie.hashCode();
	}
}
