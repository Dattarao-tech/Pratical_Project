class Game {
    void gameName() {
        System.out.println("Game: Cricket");
    }
}

class Team extends Game {
    void teamName() {
        System.out.println("Team: India");
    }
}

class Player extends Team {
    void playerDetails() {
        System.out.println("Player Name: Ganesh");
        System.out.println("Role: Batsman");
        System.out.println("Jersey Number: 45");
    }
}

public class MultilevelInheritance5 {
    public static void main(String[] args) {
        Player player = new Player();
        player.gameName();
        player.teamName();
        player.playerDetails();
    }
}
