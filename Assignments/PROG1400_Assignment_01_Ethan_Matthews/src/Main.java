import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Program Banner.
        System.out.println("FANTASY HOCKEY APPLICATION");

        //Team name entries from user.
        System.out.println("TEAM ENTRY");
        System.out.println("==============================");
        //new array for teams
        Team[] teamArray = new Team[3];
        //scanner for system input
        Scanner sc = new Scanner(System.in);
        //variables for minimum characters, minimum number, and number of teams
        int minimumChar = 3;
        int minimumInt = 0;
        int teamCount = 3;
        //counters for while loop
        int i = 1;
        int i1 = 0;
        //while loop for creating team object with names
        while ( i <= teamCount){
            System.out.println("Enter name for team # " + i + ": ");
            String currentTeam = sc.nextLine();
            //Check for length of input.
            if (currentTeam.length() <= minimumChar) {
                System.out.println("ERROR!!! The team name must be longer. Please re-enter a team name.");
                continue;
            }
            //new team object and name
            teamArray[i1] = new Team();
            teamArray[i1].Name = currentTeam;
            i++;
            i1++;
        }
        //banner
        System.out.println("PLAYER ENTRY");
        System.out.println("==============================");
        //New arrays for team players
        Player[] firstTeamArray = new Player[4];
        Player[] secondTeamArray = new Player[4];
        Player[] thirdTeamArray = new Player[4];

        //counters for while loop
        int i2 = 1;
        int i3 = 0;
        //while loop for player creation and stats
        while ( i2 <= teamCount ) {
            System.out.println("Enter players for " + teamArray[i3].Name + ":\n");
            //for loop for creating four players
            for (i = 0; i <= firstTeamArray.length; i++) {
                System.out.println("Enter name for player # " + (i + 1) + ":");
                String currentPlayer = "";
                //while loop for player name checks if char is above three.
                while ( currentPlayer == "" ) {
                    currentPlayer = sc.nextLine();
                    if (currentPlayer.length() <= minimumChar) {
                        System.out.println("\"ERROR!!! The player name must be greater than three characters. Please re-enter player info.\"");
                        break;
                    }
                }


                //input and data check for goals of players
                System.out.println("Enter number of goals for " + currentPlayer + ":");
                int currentGoals = 0;
                while ( currentGoals == 0 ) {
                    currentGoals = sc.nextInt();
                    if (currentGoals < minimumInt) {
                        System.out.println("ERROR!!! The player goals must be greater than zero. Please re-enter player info.");
                        continue;
                    }
                }

                //input and data check for assists of players
                System.out.println("Enter number of assists for " + currentPlayer + ":");
                int currentAssists = 0;
                while ( currentAssists == 0 ) {
                    currentAssists = sc.nextInt();
                    if (currentAssists < minimumInt) {
                        System.out.println("ERROR!!! The player assists must be greater than zero. Please re-enter player info.");
                        continue;
                    }
                }

                //adds player object and attributes to correct array.
                if ( i2 == 1 ) {
                    firstTeamArray[i] = new Player();
                    firstTeamArray[i].Name = currentPlayer;
                    firstTeamArray[i].Goals = currentGoals;
                    firstTeamArray[i].Assists = currentAssists;

                }

                //adds player object and attributes to correct array.
                else if ( i2 == 2 ) {
                    secondTeamArray[i] = new Player();
                    secondTeamArray[i].Name = currentPlayer;
                    secondTeamArray[i].Goals = currentGoals;
                    secondTeamArray[i].Assists = currentAssists;

                }

                //adds player object and attributes to correct array.
                else if ( i2 == 3 ) {
                    thirdTeamArray[i] = new Player();
                    thirdTeamArray[i].Name = currentPlayer;
                    thirdTeamArray[i].Goals = currentGoals;
                    thirdTeamArray[i].Assists = currentAssists;

                }

            }

            i2++; //while 2 loop
            i3++;//while 2 loop
        }


        //Banner
        System.out.println("REPORT: Stats per Team");
        System.out.println("==============================");

        //adds all goals and assists from first team, creates totals.
        int firstTotalGoals = firstTeamArray[0].Goals + firstTeamArray[1].Goals + firstTeamArray[2].Goals + firstTeamArray[3].Goals;
        int firstTotalAssists = firstTeamArray[0].Assists + firstTeamArray[1].Assists + firstTeamArray[2].Assists + firstTeamArray[3].Assists;
        int firstOverall = firstTotalGoals + firstTotalAssists;

        //adds all goals and assists from second team, creates totals.
        int secondTotalGoals = secondTeamArray[0].Goals + secondTeamArray[1].Goals + secondTeamArray[2].Goals + secondTeamArray[3].Goals;
        int secondTotalAssists = secondTeamArray[0].Assists + secondTeamArray[1].Assists + secondTeamArray[2].Assists + secondTeamArray[3].Assists;
        int secondOverall = secondTotalGoals + secondTotalAssists;

        //adds all goals and assists from third team, creates totals.
        int thirdTotalGoals = thirdTeamArray[0].Goals + thirdTeamArray[1].Goals + thirdTeamArray[2].Goals + thirdTeamArray[3].Goals;
        int thirdTotalAssists = thirdTeamArray[0].Assists + thirdTeamArray[1].Assists + thirdTeamArray[2].Assists + thirdTeamArray[3].Assists;
        int thirdOverall = thirdTotalGoals + thirdTotalAssists;

        //creates a random budget variable between 100,000 and 0
        double teamBudget = Math.random() * 100000 + 0;

        //outputs team stats for first team.
        System.out.printf("/n%a : G - %b A - %c Total: ", teamArray[0].Name, firstTotalGoals, firstTotalAssists, teamBudget);
        if (firstOverall >= 20) {
            System.out.println("Rating: *** stars");
        }
        else if (firstOverall >= 10 && firstOverall < 20) {
            System.out.println("Rating: ** stars");
        }
        else if (thirdOverall > 0 && firstOverall < 10) {
            System.out.println("Rating: * star");
        }

        //outputs team stats for second team.
        System.out.printf("/n%a : G - %b A - %c Total: ", teamArray[1].Name, secondTotalGoals, secondTotalAssists, teamBudget);
        if (secondOverall >= 20) {
            System.out.println("Rating: *** stars");
        }
        else if (secondOverall >= 10 && secondOverall < 20) {
            System.out.println("Rating: ** stars");
        }
        else if (secondOverall > 0 && secondOverall < 10) { 
            System.out.println("Rating: * star");
        }

        //outputs team stats for third team.
        System.out.printf("/n%a : G - %b A - %c Total: ", teamArray[2].Name, thirdTotalGoals, thirdTotalAssists, teamBudget);
        if (thirdOverall >= 20) {
            System.out.println("Rating: *** stars");
        }
        else if (thirdOverall >= 10 && thirdOverall < 20) {
            System.out.println("Rating: ** stars");
        }
        else if (thirdOverall > 0 && thirdOverall < 10) {
            System.out.println("Rating: * star");
        }

        //banner
        System.out.println("REPORT: Stats per Player");
        System.out.println("==============================");

            //for loop for output of players in first team
            for (i = 0; i <= firstTeamArray.length; i++) {
                int totalScore = firstTeamArray[i].Goals + firstTeamArray[i].Assists;
                System.out.println(teamArray[0]);
                System.out.printf("/n%a : G - %b A - %c Total - %d ", firstTeamArray[i].Name, firstTeamArray[i].Goals, firstTeamArray[i].Assists, totalScore);

            }

            //for loop for output of players in second team
            for (i = 0; i <= secondTeamArray.length; i++) {
                int totalScore = secondTeamArray[i].Goals + secondTeamArray[i].Assists;
                System.out.println(teamArray[0]);
                System.out.printf("/n%a : G - %b A - %c Total - %d ", secondTeamArray[i].Name, secondTeamArray[i].Goals, secondTeamArray[i].Assists, totalScore);

            }

            //for loop for output of players in third team
            for (i = 0; i <= thirdTeamArray.length; i++) {
                int totalScore = thirdTeamArray[i].Goals + thirdTeamArray[i].Assists;
                System.out.println(teamArray[0]);
                System.out.printf("/n%a : G - %b A - %c Total - %d ", thirdTeamArray[i].Name, thirdTeamArray[i].Goals, thirdTeamArray[i].Assists, totalScore);

            }



    }

}
