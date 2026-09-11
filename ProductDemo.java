abstract class Product {
    int productId;
    String name;
    double price;

    Product(int id, String n, double p) {
        productId = id; name = n; price = p;
    }

    abstract double calculateDiscount();

    void showFinalPrice() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;
        System.out.println(name + " Final Price: ₹" + finalPrice);
    }
}

class Electronics extends Product {
    Electronics(int id, String n, double p) { super(id, n, p); }
    double calculateDiscount() { return price * 0.10; } // 10% off
}

class Clothing extends Product {
    Clothing(int id, String n, double p) { super(id, n, p); }
    double calculateDiscount() { return price * 0.20; } // 20% off
}

class Books extends Product {
    Books(int id, String n, double p) { super(id, n, p); }
    double calculateDiscount() { return price * 0.05; } // 5% off
}

public class ProductDemo {
    public static void main(String[] args) {
        Product e = new Electronics(101, "Laptop", 50000);
        Product c = new Clothing(102, "Shirt", 2000);
        Product b = new Books(103, "Java Book", 800);

        e.showFinalPrice();
        c.showFinalPrice();
        b.showFinalPrice();
    }
}
