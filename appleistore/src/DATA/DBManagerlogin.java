
package DATA;
import Business.Login;
public class DBManagerlogin {

    public boolean userVerification(Login user) {

        if (user.getUserName() == "Manager" && user.getPassword() == "1234") {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean userVerification2(String user, String user2) {

        if (user == "Manager" && user2 == "1234") {
            return true;
        } else {
            return false;
        }

    }

}
