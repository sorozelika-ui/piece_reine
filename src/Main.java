public class Main {

    public static void main(String[] args) {

        Queen queen = new Queen();

        queen.row = 5;
        queen.column = 5;

        Position testPosition = new Position(3, 7);

        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}