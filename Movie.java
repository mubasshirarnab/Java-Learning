package MidQuestion.fall2022;

public class Movie {
    private String name;
    protected String origin;
    public String genre;
    public float rating;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public Movie(String name, String origin, String genre, float rating){
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }
    public void details(){
        System.out.println("You're watching " + name + "\nOrigin: " + origin +
                "\nGenre: " + genre + "\nRating: " + rating);
    }
}

class watchedMovie{
    public static void main(String[] args) {
        Movie m1 = new Movie("Spider-Man","USA","Action", 8.7f);

        m1.details();
    }
}
