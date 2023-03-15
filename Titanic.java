package Movies;

public class Titanic {
    String directorName;
    String featuredSong;

    public Titanic(String directorName, String featuredSong){
        this.directorName = directorName;
        this.featuredSong = featuredSong;
    }
    {
        System.out.println("Titanic sank in the North Atlantic Ocean on 15 April 1912 after striking an iceberg");
    }
    public void showDetails(){
        System.out.println("Director Name: " + directorName + "\nFeatured Song: " + featuredSong);
    }

    public static void main(String[] args) {
        Titanic T = new Titanic("James Cameron","My Heart Will Go On");
        T.showDetails();
    }
}
