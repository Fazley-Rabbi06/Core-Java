package Collection;

public class Account {
    int id;
    String email;
    int balance;
    String name;
    int phone;

    public Account(int id, String email, int balance, String name, int phone) {
        this.id = id;
        this.email = email;
        this.balance = balance;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
