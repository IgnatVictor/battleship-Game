import java.util.List;

public class Ship {

    private List<Square> NewShip1;
    private ShipType shipType;

    public Ship(List<Square> fields, ShipType shipType) {
        this.NewShip1 = fields;
        this.shipType = shipType;
    }

    public boolean isPlacementOk(Ship ship1, List<Ship> ships, Board board) {
        int count = 0;
        for(int i= 0; i< ship1.getFields().size(); i++) {
            if(ship1.getFields().get(i).getY() > board.getSizeY() ||
                    ship1.getFields().get(i).getX() > board.getSizeX()) {
                count++ ;
            }
            for(int k = 0; k < ships.size();k++) {
                for(int z= 0; z< ships.get(k).getFields().size(); z++) {
                    if((ship1.getFields().get(i).getX() == ships.get(k).getFields().get(z).getX() &&
                        ship1.getFields().get(i).getY() == ships.get(k).getFields().get(z).getY())) {
                        count ++ ;
                    }
                }
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }





    public ShipType getShipType() {
        return shipType;
    }



    public List<Square> getFields() {
        return NewShip1;
    }




    public void add(Square square) {

        NewShip1.add(square);
    }
}
