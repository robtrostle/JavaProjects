package Chapter13;

/**
 *
 * @author robtr
 */
public class Movie implements Comparable<Movie> {
    
    private String title;
    private int rating;
    
    public Movie(String t, int r){
        title = t;
        rating = r;
        
    }

    @Override
    public int compareTo(Movie m) {
        
        if (this.rating < m.rating){
            System.out.println(m.title 
                    + " is a better movie than " + this.title);
            return m.rating - this.rating;
        }
        else if(this.rating > m.rating){
            System.out.println(m.title + " is a terrible movie." 
                    + this.title + " is much better");
            return this.rating - m.rating;
        }
        else{
            System.out.println("The movies are both enjoyable");
            return 0;
        }
        
    }
    
}
