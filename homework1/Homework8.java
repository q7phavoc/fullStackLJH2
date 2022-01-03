public class Homework8 {
    public static void main(String[] args) {
        RockPaperScissors player1 = new RockPaperScissors();
        player1.make();

        RockPaperScissors player2 = new RockPaperScissors();
        player2.make();

        if (player1.getMy().equals(player2.getMy())) {
            System.out.println("비겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        } else if (player1.getMy().equals("Rock") && player2.getMy().equals("Paper")) {
            System.out.println("player2가 이겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        } else if (player1.getMy().equals("Rock") && player2.getMy().equals("Scissors")) {
            System.out.println("player1가 이겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        } else if (player1.getMy().equals("Paper") && player2.getMy().equals("Rock")) {
            System.out.println("player1가 이겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        } else if (player1.getMy().equals("Paper") && player2.getMy().equals("Scissors")) {
            System.out.println("player2가 이겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        } else if (player1.getMy().equals("Scissors") && player2.getMy().equals("Rock")) {
            System.out.println("player2가 이겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        } else if (player1.getMy().equals("Scissors") && player2.getMy().equals("Paper")) {
            System.out.println("player1가 이겼습니다." + "player1은 : " + player1.getMy() + ", player2는 : " + player2.getMy());
        }
    }
}

class RockPaperScissors {
    private String my;

    public void setMy(String my) {
        this.my = my;
    }

    public String getMy() {
        return this.my;
    }

    public void make() {
        int myTurn = 0;
        myTurn = (int) (Math.random() * 3);

        switch (myTurn) {
            case 0:
                this.my = "Rock";
                break;
            case 1:
                this.my = "Paper";
                break;
            case 2:
                this.my = "Scissors";
                break;
        }
    }
}