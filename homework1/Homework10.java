public class Homework10 {
    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        soccer.setName("First Game");

        Team team1 = new Team();
        team1.setTeamName("A team");
        Team team2 = new Team();
        team2.setTeamName("B team");

        Player player1[] = new Player[5];
        Player player2[] = new Player[5];
        
        for (int i = 0; i < player1.length; i++) {
            player1[i] = new Player();
            player1[i].setTeamName(team1.getTeamName());
            player1[i].setPlayerName("No " + i);

            player2[i] = new Player();
            player2[i].setTeamName(team2.getTeamName());
            player2[i].setPlayerName("No " + i);
        }

        System.out.println(soccer.getName() + " 게임이 있었습니다.");

        int goals = soccer.genarateGoalGame();

        System.out.println(goals + " 골이 터졌습니다.");

        int aTeamGoal = 0;
        int bTeamGoal = 0;

        for (int j = 0; j < goals; j++) {
            if (soccer.genarateGoalTeam() == 0) {
                int player = soccer.genarateGoalPlayer();
                System.out.println(team1.getTeamName() + " 의 " + player1[player].getPlayerName() + " 선수가 득점했습니다.");
                aTeamGoal++;
            } else {
                int player = soccer.genarateGoalPlayer();
                System.out.println(team2.getTeamName() + " 의 " + player2[player].getPlayerName() + " 선수가 득점했습니다.");
                bTeamGoal++;
            }
        }

        System.out.println(team1.getTeamName() + " 팀 : " + aTeamGoal + ", " + team2.getTeamName() + " 팀 : " + bTeamGoal);

        if(aTeamGoal == bTeamGoal) {
            System.out.println(team1.getTeamName() + " 팀과 " + team2.getTeamName() + " 팀이 비겼습니다.");
        } else if(aTeamGoal > bTeamGoal) {
            System.out.println(team1.getTeamName() + " 팀이 이겼습니다.");
        } else {
            System.out.println(team2.getTeamName() + " 팀이 이겼습니다.");
        }
    }
}

class Soccer {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int genarateGoalGame() {
        return ((int) (Math.random() * 10));
    }

    public int genarateGoalTeam() {
        return ((int) (Math.random() * 2));
    }

    public int genarateGoalPlayer() {
        return ((int) (Math.random() * 5));
    }

}

class Team extends Soccer {
    String teamName;
    int goal;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}

class Player extends Team {
    String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}