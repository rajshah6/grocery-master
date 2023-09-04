// main Item class

public class Item {
    // initialize private fields based on format provided 
    private String sku, name, category;
    private int quantity, minimumQuantity;
    private double vendorPrice, regularPrice, currentPrice, markupPercentage, currentDiscount;
    
    // constructor method where all fields must be set in order to create the class
    public Item(String sku, String name, String category, int quantity, int minimumQuantity, double vendorPrice, double markupPercentage, double regularPrice, double currentDiscount, double currentPrice) {
        // initialize all fields
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.minimumQuantity = minimumQuantity;
        this.vendorPrice = vendorPrice;
        this.markupPercentage = markupPercentage;
        this.regularPrice = regularPrice;
        this.currentDiscount = currentDiscount;
        this.currentPrice = currentPrice;
    }
    
    // since fields are private, getters and setters are required for all fields
    
    // create getters to access fields outside of class

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public double getVendorPrice() {
        vendorPrice = Math.round(vendorPrice*100);
        vendorPrice /= 100; // round to hundreths
        
        return vendorPrice;
    }

    public double getRegularPrice() {
        regularPrice = Math.round(regularPrice*100);
        regularPrice /= 100; // round to hundreths
        
        return regularPrice;
    }

    public double getCurrentPrice() {
        currentPrice = Math.round(currentPrice*100);
        currentPrice /= 100; // round to hundreths
        
        return currentPrice;
    }

    public double getMarkupPercentage() {
        markupPercentage = Math.round(markupPercentage*100);
        markupPercentage /= 100; // round to hundreths
        
        return markupPercentage;
    }

    public double getCurrentDiscount() {
        currentDiscount = Math.round(currentDiscount*100);
        currentDiscount /= 100; // round to hundreths
        
        return currentDiscount;
    }
    
    // create setters to change fields outside of class

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public void setVendorPrice(double vendorPrice) {
        this.vendorPrice = vendorPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setMarkupPercentage(double markupPercentage) {
        this.markupPercentage = markupPercentage;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }
    
    // override toString method, this will allow the array list to store the info
    
    // should store info in this format:
    // ABC-1234,name,category,quantity,minimum quantity,vendor price,markup percentage,regular price,current discount percentage,current price
    @Override
    public String toString() {
        // round all numerical values
        vendorPrice = Math.round(vendorPrice*100);
        vendorPrice /= 100; // round to hundreths
        
        regularPrice = Math.round(regularPrice*100);
        regularPrice /= 100; // round to hundreths
        
        currentPrice = Math.round(currentPrice*100);
        currentPrice /= 100; // round to hundreths
        
        markupPercentage = Math.round(markupPercentage*100);
        markupPercentage /= 100; // round to hundreths
        
        currentDiscount = Math.round(currentDiscount*100);
        currentDiscount /= 100; // round to hundreths
        
        return sku + "," + name + "," + category + "," + quantity + "," + minimumQuantity + "," + vendorPrice + "," + markupPercentage + "," +  regularPrice + "," + currentDiscount + "," + currentPrice;
    }
}
