public enum ShipType {
    CARRIER(1),
    CRUISER(2),
    BATTLESHIP(2),
    DESTROYER(3),
    SUBMARINE(4);

    public final Integer label;

    private ShipType(Integer label) {
        this.label = label;
    }


}
