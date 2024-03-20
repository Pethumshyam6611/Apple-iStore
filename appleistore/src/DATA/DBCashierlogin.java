
package DATA;
import Business.Login;
public class DBCashierlogin {
       public boolean userVerification(Login user) {

        if (user.getUserName() == "Cashier" && user.getPassword() == "1234") {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean userVerification2(String user, String user2) {

        if (user == "Cashier" && user2 == "1234") {
            return true;
        } else {
            return false;
        }

    }
}
