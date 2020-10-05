
class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}
	public Song(String title, String artist, String album, String[] composer, int year, int track)
	{
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	void show()
	{
		System.out.println("제목 : "+this.title);
		System.out.println("가수 : "+this.artist);
		System.out.println("앨범 제목 : "+this.album);
		for(int i = 0; i<composer.length; i++) {
			System.out.println("작곡가"+(i+1)+" : "+this.composer[i]);
		}
		System.out.println("발표 연도 : "+this.year);
		System.out.println("트랙 번호 : "+this.track);
		
		
	}
}
