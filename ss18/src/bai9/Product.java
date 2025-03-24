package bai9;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

