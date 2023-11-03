// Generic class to represent a palette
class Palette<T> {
    private String flavor;
    private double price;
    private T specificType;

    public Palette(String flavor, double price, T specificType) {
        this.flavor = flavor;
        this.price = price;
        this.specificType = specificType;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public T getSpecificType() {
        return specificType;
    }

    public void showInformation() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: $" + price);
        System.out.println("SpecificType: " + specificType);
    }
}

// Specific class for a type of palette
class StrawberryPalette {
    // Defines specific properties for a strawberry popsicle
}

