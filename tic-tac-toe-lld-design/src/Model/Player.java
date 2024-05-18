package Model;


public class Player {
    public String name;
    public PlayingPiece piece;

    public Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPlayingPiece() {
        return piece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayingPiece(PlayingPiece piece) {
        this.piece = piece;
    }
}
