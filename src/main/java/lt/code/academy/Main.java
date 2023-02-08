package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String USER_FILE_NAME = "user.json";
    public static void main(String[] args) {

        User user = new User("Vardas", "Pavarde", "Asmens kodas");


        /*ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite varda:");
        String name = scanner.nextLine();
        System.out.println("Įveskite pavarde");
        String surname = scanner.nextLine();
        System.out.println("Įveskite savo AK");
        String code = scanner.nextLine();

        List<String> users = new ArrayList<>();
        users.add(name);
        users.add(surname);
        users.add(code);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            File file = new File(USER_FILE_NAME);
            mapper.writeValue(file, List.of(users));
            if (!file.exists()) {
                file.createNewFile();
            }

        } catch (IOException e) {
            System.out.println("Failo sukūrimo klaida: " + e.getMessage());
        }


    }
}