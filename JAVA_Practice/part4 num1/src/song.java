public class song
{
	static String title;
	static String artist;
	static String album;
	static String composer[];
	static int year;
	static int track;
	
	public song() 
	{
		title = null;
		artist = null;
		album = null;
		composer = null;
		year = 0;
		track = 0;
	}
	
	public song (String title,String artist, String album,String[] composer,int year, int track)
	{
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	public static void show()
	{
		System.out.println("tilte = "+title);
		System.out.println("artist = "+artist);
		System.out.println("album = "+album);
		System.out.print("composer = ");
		for (int i=0;i<composer.length;i++)
		{
			System.out.print(composer[i]);
			if (i==composer.length-1)
				System.out.println(" ");
			else
				System.out.print(", ");
		}
		System.out.println("year = "+year);
		System.out.println("track = "+track);
	}
	   public static void main(String[] args)
	   {
		   song Dancingqueen = new song("Dancingqueen","ABBA","Arrival",new String[]{"Benny Anderson","Bjorn Ulvaeus"},1977,2);
		   Dancingqueen.show();
	   }
}

