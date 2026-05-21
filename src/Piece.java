class Piece {

    int row;
    int column;

    final void move(Position newPosition) {

        if (isValidMove(newPosition)) {
            this.row = newPosition.row;
            this.column = newPosition.column;
        }
    }

    boolean isValidMove(Position newPosition) {
        return false;
    }
}