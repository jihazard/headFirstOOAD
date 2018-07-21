package subWay;

import java.util.*;

public class Subway {
    private List stations;
    private List connections;
    private Map netWork;

    public Subway() {
        this.stations = new LinkedList();
        this.connections = new LinkedList();
        this.netWork = new HashMap();
    }


    public void addStation(Station  otherStation) {
      if(otherStation instanceof Station){
          stations.add(otherStation);
      }
    }
    public void addStation(String stationName) {
        if(!this.hasStation(stationName)){
            Station station = new Station(stationName);
            stations.add(station);
        }
    }

    public boolean hasStation(String stationName) {
        return stations.contains(new Station(stationName));
    }


    public void addConnection(Connection other){
        if((this.hasStation(other.getStation1().getName()))&&
                (this.hasStation(other.getStation2().getName()))){
            Station station1 = new Station(other.getStation1().getName());
            Station station2 = new Station(other.getStation2().getName());

            Connection connection = new Connection(station1, station2,other.getLineName());
            connections.add(connection);
            connections.add(new Connection(station2,station1,connection.getLineName()));
        }
        else {
            throw new RuntimeException("invalid connection");
        }
    }

    public Connection addConnection(String stationName, String station2name, String lineName){
        if((this.hasStation(stationName))&&
                (this.hasStation(station2name))){
            Station station1 = new Station(stationName);
            Station station2 = new Station(station2name);

            Connection connection = new Connection(station1, station2,lineName);
            connections.add(connection);
            connections.add(new Connection(station2,station1,connection.getLineName()));

            addToNetwork(station1, station2);
            addToNetwork(station2, station1);

            return connection;

        }
        else {
            throw new RuntimeException("invalid connection");
        }
    }

    private void addToNetwork(Station station2, Station station1) {
        if(netWork.keySet().contains(station1)){
            List connectingStations = (List) netWork.get(station1);
            if(!connectingStations.contains(station2)){
                connectingStations.add(station2);
            }
        }else {
            List connectionStations = new LinkedList();
            connectionStations.add(station2);
            netWork.put(station1, connectionStations);
        }
    }

    public boolean hasConnection(String station1Name, String station2Name, String lineName) {
        Station station1 = new Station(station1Name);
        Station station2 = new Station(station2Name);
        for (Iterator i = connections.iterator(); i.hasNext(); ) {
            Connection connection = (Connection) i.next();
            if (connection.getLineName().equalsIgnoreCase(lineName)) {
                if ((connection.getStation1().equals(station1)) &&
                        (connection.getStation2().equals(station2)))
                {
                    return true;
                }
            }
        }
        return false;
    }

  /*  public Connection getDirections(String name1,String name2){
        SubwayPrinter print = new SubwayPrinter();
        Connection connection =new Connection(name1);
        return print.printDirection();
    }*/
}
