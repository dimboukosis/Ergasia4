
public class Song {
	
	//Metavlites stigmiotypou gia ton titlo tou tragoudiou, ton tragoudisti kai to url 
	//tou kathe tragoudiou.
	static Song songs[] = new Song [10];
	static int countSong=0;
	private String title;
	private Singer singer;
	private String url;
	
	//Methodos gia arxikopoihsh twn metavlitwn stigmiotypou
	public Song(String title,Singer singer,String url) {
		this.title = title;
		this.singer=singer;
		this.url=url;
		songs[countSong]=this;
		++countSong;
	}
	
	//Set & get gia kathe metavliti stigmiotypou
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Singer getSinger() {
		return singer;
	}
	
	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	//methodos toString gia thn emfanish twn apotelesmatwn
	public String toString() {
		return "Song [title=" + title + ",singer="+singer.getName()+",url="+url+"]";
	}
}
