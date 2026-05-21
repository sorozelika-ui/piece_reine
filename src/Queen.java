class Queen extends Piece {

    boolean isValidMove(Position newPosition) {

        Bishop bishop = new Bishop();
        Rock rock = new Rock();

        bishop.row = this.row;
        bishop.column = this.column;

        rock.row = this.row;
        rock.column = this.column;

        return bishop.isValidMove(newPosition) ||
                rock.isValidMove(newPosition);
    }
}