class Game {
    void gameType() {
        System.out.println("Game: Cricket");
    }
}
class Team extends Game {
    void teamDetails() {
        System.out.println("Team: India");
        System.out.println("Captain: Ganesh");
    }
}
class Umpire extends Game {
    void umpireDetails() {
        System.out.println("Umpire: Vaibahv");
        System.out.println("Role: On-field Umpire");
    }
}
class Player extends Game {
    void playerDetails() {
        System.out.println("Player: Aslam");
        System.out.println("Role: Bowler");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("Team: Maharastra");
        Team team = new Team();
        team.gameType();
        team.teamDetails();

        System.out.println("umpire: Vaibhav");
        Umpire umpire = new Umpire();
        umpire.gameType();
        umpire.umpireDetails();

        System.out.println("player: Aslam");
        Player player = new Player();
        player.gameType();
        player.playerDetails();
    }
}
