package lt.code.academy;

public class User {
    private String name;
    private String surName;
    private String code;

    public User(String name, String surName, String code) {
        this.name = name;
        this.surName = surName;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
