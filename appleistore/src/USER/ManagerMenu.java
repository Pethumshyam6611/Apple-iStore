package USER;

import Business.Products;
import DATA.DBProduct;
import java.util.ArrayList;

public class ManagerMenu {
    public static void main(String[] args) {
        DBProduct DBP = new DBProduct();

        Products p1 = new Products(100, "Apple Iphone 14", "Rs 250,000", "256GB", 50);
        Products p2 = new Products(101, "Apple Iphone 11", "Rs 100,000", "256GB", 60);
        Products p3 = new Products(102, "Apple Iphone 13", "Rs 200,000", "256GB", 70);
        Products p4 = new Products(103, "Apple Iphone 12", "Rs 150,000", "256GB", 90);

        DBP.add(p1);
        DBP.add(p2);
        DBP.add(p3);
        DBP.add(p4);

        Products p = DBP.get(100);
        System.out.println(p.getProductID() + " " + p.getName() + " " + p.getPrice() + " " + p.getDetails() + " " + p.getStock());

        boolean result = DBP.delete(100);
        if (result) {
            System.out.println("Record is deleted");
        } else {
            System.out.println("Record is not deleted");
        }

        Products pu = new Products(103, "Apple Iphone 12", "Rs 150,000", "256GB", 120);
        boolean result1 = DBP.update(pu);
        if (result1) {
            System.out.println("Record is updated");
        } else {
            System.out.println("Record is not updated");
        }

        ArrayList<Products> Plist = DBP.getAll();
        for (Products pp : Plist) {
            System.out.println(pp.getProductID() + " " + pp.getName() + " " + pp.getPrice() + " " + pp.getDetails() + " " + pp.getStock());
        }
    }
}
