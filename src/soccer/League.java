package soccer;

import soccer.utility.GameUtils;

public class League {


    public static void main(String[] args) {
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");

        Player[] thePlayers = { player1, player2, player3 };
        Team team1 = new Team("Green Rangers", thePlayers);

        Player player4 = new Player("Robert Service");
        Player player5 = new Player("Robbie Burns");
        Player player6 = new Player("Rafael Sabatini");

        Player[] redPlayers = { player4, player5, player6 };
        Team team2 = new Team("Red Rangers", redPlayers);

        Team[] theTeams = createTeams(team2, team1);

        Game[] theGames = createGames(theTeams);

        Game currentGame = theGames[0];

        int numOfGoals = (int) (Math.random() * 7);

        System.out.println(numOfGoals);

        Goal[] goals = new Goal[numOfGoals];



        currentGame.goals = goals;

        GameUtils.addGameGoals(currentGame);

//        System.out.println("Goal scored after " +
//                currentGame.goals[0].theTime + " mins by " +
//                currentGame.goals[0].thePlayer.playerName + " of the " +
//                currentGame.goals[0].theTeam.teamName + "\n");

//        StringBuilder familyFirst = new StringBuilder();

//        for (Player thePlayer: team1.playerArray) {
////            if (thePlayer.playerName.matches(".*Sab.*")) {
////                System.out.println("\nFound " + thePlayer.playerName);
//
//               String name[] = thePlayer.playerName.split(" ");
//                familyFirst.append(name[1]);
//                familyFirst.append(", ");
//                familyFirst.append(name[0]);
//                System.out.println(familyFirst);
//                familyFirst.delete(0, familyFirst.length());
////                System.out.println("Last name is " +
////                        thePlayer.playerName.split(" ")[1]);
////            }
//        }

    }

    public static Team[] createTeams(Team team1, Team team2){
        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = {theGame};
        return theGames;
    }
}
