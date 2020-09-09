

package Chapter10;

public class MusicianDemo {

    public static void main(String[] args) {
        
        MusicianClient theBeatles = new MusicianClient("The Beatles", 4, "Hey Jude");
        MusicianClient eminem = new MusicianClient("Eminem", 1, "Lose Yourself");
        MusicianClient ladyGaga = new MusicianClient("Lady Gaga", 1, "Poker Face");
        MusicianClient someoneElse = new MusicianClient("Someone Else", 100, "Something Else");
        MusicianClient again = new MusicianClient("Again", -50, "Again something else");
        MusicianClient empty = new MusicianClient();
        
        //int[] numArray = new int[6];
        MusicianClient[] musicArray = {theBeatles, eminem, ladyGaga, someoneElse, again, empty};
        
        for (MusicianClient m : musicArray) {
            System.out.println(m);
        }
        
        
    }

}
