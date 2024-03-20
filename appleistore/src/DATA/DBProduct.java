package DATA;
import java.util.ArrayList;
import Business.Products;
public class DBProduct {
    
    private ArrayList<Products>Plist;
    
       public DBProduct() {
        Plist=new ArrayList<>();
    }
    
    public boolean add(Products p){
        return Plist.add(p);       
    }
    
    public Products get(int PID){
        for(Products p:Plist){
            if(p.getProductID()==PID){
                return p;
            }
        }
        return null;
    }
    
    public boolean delete(int PID){
       Products p= get(PID);
       if(p!=null){
           return Plist.remove(p);
       }
       return false;
    }
    
    public boolean update(Products pp){
       Products p= get(pp.getProductID());
       if(p!=null){
            Plist.remove(p);
            Plist.add(pp);
            return true;
       }
       return false;
    }
    
    public ArrayList<Products> getAll(){
        return Plist;
    }
}


