package oop.assigment_problems;

abstract class ArtPiece {
    private static int counter = 0;
    private final String pieceId;

    protected ArtPiece() {
        counter++;
        pieceId = "ART-" + counter;
    }

    public abstract String describe();

    public String getPieceId() {
        return pieceId;
    }
}

class Painting extends ArtPiece {
    private final String title;

    public Painting(String title) {
        this.title = title;
    }

    @Override
    public String describe() {
        return "Painting: " + title + ", framed on canvas";
    }
}

class Sculpture extends ArtPiece {
    private final String title;

    public Sculpture(String title) {
        this.title = title;
    }

    @Override
    public String describe() {
        return "Sculpture: " + title + ", carved from stone";
    }
}

public class GalleryDescriptionCards {
    public static void main(String[] args) {
        Painting p = new Painting("Sunset Fields");
        Sculpture s = new Sculpture("The Thinker II");
        System.out.println(p.describe());
        System.out.println(s.describe());
        System.out.println(p.getPieceId());
        System.out.println(s.getPieceId());
    }
}
