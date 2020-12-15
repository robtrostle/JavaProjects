package API_Week;


import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;


/*
    Lab Assignment 6 - Determine number of Superbowls
 */
public class LabAssign_6_Trostle {
    


    public static void main(String[] args) throws IOException {
        String[] winners = new String[100];//Create a string array to store winners
        String url = "https://blog.ticketcity.com/nfl/super-bowl/super-bowl-champions/";
        Document doc = Jsoup.connect(url).get();

        String winner;
        
        Elements tds = doc.select("td");//as opposed to selecting all divs. 

        //keep track of each referenced element
        int i = 0;
        
        
        for (Element td : tds) {//iterate through each TD, 
            
            winner = td.getElementsByTag("td").text();//changing string to text which is a string type
            
            
            //System.out.println(winner);

            winners[i] = winner.substring(0);
            
            System.out.println(winners[i]);

//            winners[i] = allInfo.substring(allInfo.indexOf("|")+2);
//
//            //extract the age. start at index 0. Stop at the index of the bar.
//            winners[i] = allInfo.substring(0,allInfo.indexOf("|"));
            
            i++;
        }
        System.out.println("");
        
        
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
    
    

