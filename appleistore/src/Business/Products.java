
package Business;
public class Products {
    private int ProductID;
    private String Name;
    private String Price;
    private String Details;
    private int Stock;

    public Products() {
    }

    public Products(int ProductID, String Name,String Price, String Details,int Stock){
        this.ProductID = ProductID;
        this.Name = Name;
        this.Price = Price;
        this.Details = Details;
        this.Stock =  Stock;
        
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    public String getPrice(){
    return Price;
    }
    
    
    public void setPrice(String Price){
    this.Price =Price;}
    
    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }
    
     public int getStock(){
    return Stock;
    }
     
     public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    
}

