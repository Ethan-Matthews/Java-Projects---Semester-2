import java.util.Scanner;

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
        int minimumInt = 0;
        int teamCount = 3;
        int i = 1;
        int i1 = 0;

        while ( i <= teamCount){
            System.out.println("Enter name for team # " + i + ": ");
            String currentTeam = sc.nextLine();
            if (currentTeam.length() <= minimumChar) {
                System.out.println("ERROR!!! The team name must be longer. Please re-enter a team name.");
                continue;
            }

            teamArray[i1] = new Team();
            teamArray[i1].Name = currentTeam;
            i++;
            i1++;
        }

        System.out.println("PLAYER ENTRY");
        System.out.println("==============================");

        Player[] firstTeamArray = new Player[4];
        Player[] secondTeamArray = new Player[4];
        Player[] thirdTeamArray = new Player[4];



        int i2 = 1;
        int i3 = 0;

        while ( i2 <= teamCount ) {
            System.out.println("Enter players for " + teamArray[i3].Name + ":");

            for (i = 0; i <= firstTeamArray.length;) {
                System.out.println("Enter name for player # " + (i + 1) + ":");
                String currentPlayer = sc.nextLine();

                if (currentPlayer.length() <= minimumChar) {
                    System.out.println("ERROR!!! The player name must be longer. Please re-enter a player info.");
                    continue;
                }

                System.out.println("Enter number of goals for " + currentPlayer + ":");
                int currentGoals = sc.nextInt();
                if (currentGoals <= minimumInt) {
                    System.out.println("ERROR!!! The player goals must be greater than zero. Please re-enter player info.");
                    continue;
                }

                System.out.println("Enter number of assists for " + currentPlayer + ":");
                int currentAssists = sc.nextInt();
                if (currentAssists <= minimumInt) {
                    System.out.println("ERROR!!! The player assists must be greater than zero. Please re-enter player info.");
                    continue;
                }

                if ( i2 == 1 ) {
                    firstTeamArray[i] = new Player();
                    firstTeamArray[i].Name = currentPlayer;
                    firstTeamArray[i].Goals = currentGoals;
                    firstTeamArray[i].Assists = currentAssists;

                }

                else if ( i2 == 2 ) {
                    secondTeamArray[i] = new Player();
                    secondTeamArray[i].Name = currentPlayer;
                    secondTeamArray[i].Goals = currentGoals;
                    secondTeamArray[i].Assists = currentAssists;

                }

                else if ( i2 == 3 ) {
                    thirdTeamArray[i] = new Player();
                    thirdTeamArray[i].Name = currentPlayer;
                    thirdTeamArray[i].Goals = currentGoals;
                    thirdTeamArray[i].Assists = currentAssists;

                }

                i++; //for loop

            }

            i2++; //while 2 loop
            i3++;//while 2 loop
        }








    }

}
