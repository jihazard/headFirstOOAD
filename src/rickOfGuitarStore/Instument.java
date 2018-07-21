package rickOfGuitarStore;

public  class Instument {
    private String serialNumber;
    private double price;
    private InstumentSpec spec;

    public Instument(String serialNumber, double price, InstumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstumentSpec getSpec() {
        return spec;
    }
}
