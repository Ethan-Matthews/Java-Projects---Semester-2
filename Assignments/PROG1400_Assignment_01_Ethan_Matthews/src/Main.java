import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Program Banner.
        System.out.println("FANTASY HOCKEY APPLICATION");

        //Team name entries from user.
        System.out.println("TEAM ENTRY");
        System.out.println("==============================");

        Scanner sc = new Scanner(System.in);
        int teamCount = 4;
        int i = 1;
        while ( i <= teamCount){
            System.out.println("Enter name for team # " + i + ": ");
            Team currentTeam = new Team();
            currentTeam.Name = sc.nextLine();
            i++;
        }












    }

}
