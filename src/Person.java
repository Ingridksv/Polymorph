public abstract class Person {
    //Hvis vi laver en abstract class, så må man ikke længere lave objekter af denne.
    //Så hedde denne class, "public abstract class Person{"
    //Derfor kan man ikke længere lave "new Person", heller ikke i de andre klasser.
    //Man kan kun arve fra en klasse

    protected String name;
    protected String address;
    protected String mail;
    protected String phoneNo; //Hvis det ikke er tal der skal beregnes på, så kan det også bare være String

    //Generate... getter and setter & constructor, husk at vælge alle (så de er blå), så generer:

    public Person(String name, String address, String mail, String phoneNo) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.phoneNo = phoneNo;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        System.out.println("Metode i Person");
        this.phoneNo = phoneNo;
    }


}
