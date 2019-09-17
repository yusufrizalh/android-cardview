package id.inixindosurabaya.cardview;

public class Persons {
    private String name;
    private String email;
    private String phone;

    public Persons(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // membuat setter and getter
    // setter digunakan untuk menulis data
    // getter digunakan untuk membaca data

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
