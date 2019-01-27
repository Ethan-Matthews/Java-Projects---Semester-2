import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Program Banner.
        System.out.println("FANTASY HOCKEY APPLICATION");

        //Team name entries from user.
        System.out.println("TEAM ENTRY");
        System.out.println("==============================");

        Team[] teamArray = new Team[3];

        Scanner sc = new Scanner(System.in);

        int minimumChar = 3;
        int teamCount = 3;
        int i = 1;
        int i1 = 0;

        while ( i <= teamCount){
            System.out.println("Enter name for team # " + i + ": ");
            String currentTeam = sc.nextLine();
            if (currentTeam.length() <= minimumChar) {
                System.out.println("ERROR!!! The team name must be longer. Please reenter a team name.");
                continue;
            }

            teamArray[i1] = new Team();
            teamArray[i1].Name = currentTeam;
            i++;
            i1++;
        }












    }

}
