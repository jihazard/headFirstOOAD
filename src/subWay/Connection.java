package subWay;

public class Connection {

    private Station Station1, Station2;
    private String lineName;

    public Connection(Station station1, Station station2, String lineName) {
        Station1 = station1;
        Station2 = station2;
        this.lineName = lineName;
    }

    public Station getStation1() {
        return Station1;
    }

    public Station getStation2() {
        return Station2;
    }

    public String getLineName() {
        return lineName;
    }
}
