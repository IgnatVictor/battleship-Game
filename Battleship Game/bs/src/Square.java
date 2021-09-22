public class Square {

    private int x;
    private int y;
    private SquareStatus squareStatus;

    public Square(int x, int y, SquareStatus squareStatus) {
        this.x = x;
        this.y = y;
        this.squareStatus = squareStatus;
    }

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SquareStatus getSquareStatus() {
        return squareStatus;
    }

    public char getCharacter() {
        char result=' ';
        switch (squareStatus) {

            case EMPTY :
                result = 'E';
                break;
            case HIT:
                result = 'H';
                break;
            case SHIP:
                result = 'S';
                break;
            case OCEAN:
                result = 'O';
                break;
            case MISSED:
                result = 'M';
                break;
        }
        return result;
    }
}
