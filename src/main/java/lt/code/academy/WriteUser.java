package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
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

    void writeUser(Map<String, User> users) {
        try (ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(USER_FILE_NAME))) {
            for (User user: users.values()) {

            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
