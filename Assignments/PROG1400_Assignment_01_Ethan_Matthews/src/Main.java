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
            System.out.println("Enter players for " + teamArray[i3].Name + ":\n");

            for (i = 0; i <= firstTeamArray.length; i++) {
                System.out.println("Enter name for player # " + (i + 1) + ":");
                String currentPlayer = "";
                while ( currentPlayer == "" ) {
                    currentPlayer = sc.nextLine();
                    if (currentPlayer.length() <= minimumChar) {
                        System.out.println("\"ERROR!!! The player name must be greater than three characters. Please re-enter player info.\"");
                        break;
                    }
                }



                System.out.println("Enter number of goals for " + currentPlayer + ":");
                int currentGoals = 0;
                while ( currentGoals == 0 ) {
                    currentGoals = sc.nextInt();
                    if (currentGoals < minimumInt) {
                        System.out.println("ERROR!!! The player goals must be greater than zero. Please re-enter player info.");
                        continue;
                    }
                }

                System.out.println("Enter number of assists for " + currentPlayer + ":");
                int currentAssists = 0;
                while ( currentAssists == 0 ) {
                    currentAssists = sc.nextInt();
                    if (currentAssists < minimumInt) {
                        System.out.println("ERROR!!! The player assists must be greater than zero. Please re-enter player info.");
                        continue;
                    }
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

                 //for loop

            }

            i2++; //while 2 loop
            i3++;//while 2 loop
        }



        System.out.println("REPORT: Stats per Team");
        System.out.println("==============================");

        int firstTotalGoals = firstTeamArray[0].Goals + firstTeamArray[1].Goals + firstTeamArray[2].Goals + firstTeamArray[3].Goals;
        int firstTotalAssists = firstTeamArray[0].Assists + firstTeamArray[1].Assists + firstTeamArray[2].Assists + firstTeamArray[3].Assists;
        int firstOverall = firstTotalGoals + firstTotalAssists;

        int secondTotalGoals = secondTeamArray[0].Goals + secondTeamArray[1].Goals + secondTeamArray[2].Goals + secondTeamArray[3].Goals;
        int secondTotalAssists = secondTeamArray[0].Assists + secondTeamArray[1].Assists + secondTeamArray[2].Assists + secondTeamArray[3].Assists;
        int secondOverall = secondTotalGoals + secondTotalAssists;

        int thirdTotalGoals = thirdTeamArray[0].Goals + thirdTeamArray[1].Goals + thirdTeamArray[2].Goals + thirdTeamArray[3].Goals;
        int thirdTotalAssists = thirdTeamArray[0].Assists + thirdTeamArray[1].Assists + thirdTeamArray[2].Assists + thirdTeamArray[3].Assists;
        int thirdOverall = thirdTotalGoals + thirdTotalAssists;

        double teamBudget = Math.random() * 100000 + 0;

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


        System.out.println("REPORT: Stats per Player");
        System.out.println("==============================");

            for (i = 0; i <= firstTeamArray.length; i++) {
                int totalScore = firstTeamArray[i].Goals + firstTeamArray[i].Assists;
                System.out.println(teamArray[0]);
                System.out.printf("/n%a : G - %b A - %c Total - %d ", firstTeamArray[i].Name, firstTeamArray[i].Goals, firstTeamArray[i].Assists, totalScore);

            }

            for (i = 0; i <= secondTeamArray.length; i++) {
                int totalScore = secondTeamArray[i].Goals + secondTeamArray[i].Assists;
                System.out.println(teamArray[0]);
                System.out.printf("/n%a : G - %b A - %c Total - %d ", secondTeamArray[i].Name, secondTeamArray[i].Goals, secondTeamArray[i].Assists, totalScore);

            }

            for (i = 0; i <= thirdTeamArray.length; i++) {
                int totalScore = thirdTeamArray[i].Goals + thirdTeamArray[i].Assists;
                System.out.println(teamArray[0]);
                System.out.printf("/n%a : G - %b A - %c Total - %d ", thirdTeamArray[i].Name, thirdTeamArray[i].Goals, thirdTeamArray[i].Assists, totalScore);

            }



    }

}
