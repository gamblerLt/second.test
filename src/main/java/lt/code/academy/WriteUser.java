package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class WriteUser {
    private static final String USER_FILE_NAME = "user.json";

    Map<String, User> getUsers() {
        Map<String, User> users = new HashMap<>();
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(USER_FILE_NAME))) {
            while (true) {

                User user = (User) objectInput.readObject();
                users.put(user.getCode(), user);
            }
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return users;
    }


}
