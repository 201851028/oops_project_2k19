import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveUser {
    public void createAccount(User u) {
        try {
            FileOutputStream fileOS = new FileOutputStream("userInfo.txt");
            ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
            objectOS.writeObject(u);
            objectOS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}