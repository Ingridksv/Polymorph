public class Customer extends Person { //Da den skal arve fra "Person" skal vi tilføje "extends Person",
    //og når vi tilføjer extends Person, så virker konstruktøren ikke
    //ArrayList<String>orders;
    String username;
    String password;

    public Customer(String name, String address, String username, String psw){
        super(name, address);
        this.username = username;
        this.password = psw;
    }

    public Customer(String name){
        super(name, "N/A");
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {this.username = username; }

    public String getPassword() {return password; }

    public void setPassword(String psw) {this.password = password;  }
    @Override
    public void setPhoneNo(String phoneNo){
        System.out.println("metode i Customer");
        this.phoneNo = phoneNo;
    }



}
