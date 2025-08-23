package Assignment25;

public class Product {
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;

        public Builder withName(String name) {
            this.name = name != null ? name : "";
            return this;
        }

        public Builder withCode(String code) {
            this.code = code != null ? code : "";
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price >= 0 ? price : 0;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category != null ? category : "General";
            return this;
        }

        public Product build() {
            if (name == null || code == null) {
                throw new IllegalStateException("Name and code are required");
            }
            return new Product(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public static void main(String[] args) {
        try {
            Product product1 = new Product.Builder()
                .withName("Laptop")
                .withCode("LAP123")
                .withPrice(999.99)
                .withCategory("Electronics")
                .build();
            System.out.println("Product 1: Name=" + product1.getName() + ", Code=" + product1.getCode() + 
                              ", Price=" + product1.getPrice() + ", Category=" + product1.getCategory());

            // Invalid price
            Product product2 = new Product.Builder()
                .withName("Phone")
                .withCode("PH456")
                .withPrice(-100.0)
                .withCategory("Electronics")
                .build();
            System.out.println("Product 2: Price=" + product2.getPrice());

            // Missing required field
            Product product3 = new Product.Builder()
                .withPrice(50.0)
                .build();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
