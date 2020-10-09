
public class SongManager {
	public static void main(String [] args)
	{
		String title = "Dancing Queen";
		String name = "ABBA";
		String album = "Arrival";
		String [] composer = {"Benny Andersson", "Björn Ulvaeus", "Stig Anderson"};
		int year = 1976;
		int track = 3;
		Song song = new Song(title, name, album, composer, year, track);
		song.show();
	}
}
