
package API_Week;


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;


/*
    Lab Assignment 6 - Determine number of Superbowls
 */
public class LabAssign_6_Trostle2 {

    public static void main(String[] args) throws IOException {
        String[] winners = new String[100];//Create a string array to store winners
        String url = "https://blog.ticketcity.com/nfl/super-bowl/super-bowl-champions/";
        Document doc = Jsoup.connect(url).get();

        //Elements tds = doc.select("td");
        
        Elements trs = doc.select("table tr");
        
        String winner;
        String victor;
        
        
        
    int i = 0;
for(Element tr : trs)
{
        winner = tr.getElementsByTag("td").text();
        //victor = winner.substring(winner.indexOf(" "));
        //System.out.println(winner);
        System.out.println(winner);
        
        
        
//        steelers = table.getElementsContainingText​("Steelers").text();
//        System.out.println(steelers);

}
        //System.out.println("");
        
        
        //new variable to keep track of cats that we are looking for. 
//        int counter = 1;
//        //Boolean to flag if NO cats
//        boolean hasWin = false;
//        //loop through and print each cat
//        String[] favoriteTeam = userTeam();
        
        
        
        
//        for(int c = 0; c < winners.length; c++){
//            //if name is blank, exit the loop
//            if(winners[c]==null)
//                break;
//            //only if the cat is what we are looking for, print it and increment
//            else if(winners[c].contains(userCatType) && ages[c].contains(userCatAge)){
//            System.out.print("Cat " + (c));
//            System.out.print(" Name: " + winners[c]+" | ");
//            System.out.print("Breed: "+ winners[c]+" | ");
//            }
//              
//            
//            
//            }
            }
        public static String[] userTeam(){
            Scanner scan = new Scanner(System.in);
            String[] team = new String[2];

            System.out.print("Enter a team name and I will tell you how many"
                    + "times they have won the Super Bowl--> "  );
            team[0] = scan.nextLine();

            return team;
        }
        
}
    
    

