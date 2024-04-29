import java.util.Scanner;

public class ex312 {
    private String partNumber
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // Constructor to initialize instance variables
    public ex312(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); // Use setter to ensure quantity is positive
        setPricePerItem(pricePerItem); // Use setter to ensure pricePerItem is positive
    }
    
    // Getter and setter methods for partNumber
    public String getPartNumber() {
        return partNumber;
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    // Getter and setter methods for partDescription
    public String getPartDescription() {
        return partDescription;
    }
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    // Getter and setter methods for quantity
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        // Ensure quantity is positive
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    // Getter and setter methods for pricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }
    
    public void setPricePerItem(double pricePerItem) {
        // Ensure pricePerItem is positive
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
    
    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

/* And here's how you can implement the InvoiceTest class 
to demonstrate the capabilities of the Invoice class:
 
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // Constructor to initialize instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); // Use setter to ensure quantity is positive
        setPricePerItem(pricePerItem); // Use setter to ensure pricePerItem is positive
    }
    
    // Getter and setter methods for partNumber
    public String getPartNumber() {
        return partNumber;
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    // Getter and setter methods for partDescription
    public String getPartDescription() {
        return partDescription;
    }
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    // Getter and setter methods for quantity
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        // Ensure quantity is positive
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }
    
    // Getter and setter methods for pricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }
    
    public void setPricePerItem(double pricePerItem) {
        // Ensure pricePerItem is positive
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
    
    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

*/