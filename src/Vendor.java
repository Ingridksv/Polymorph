public class Vendor extends Person{
    String dropOffLocation;

    public Vendor(String name, String address, String dropOffLocation) {
        super(name, address); //super kalder fra superklassen, som i dette tilfælde er Person og object, sub klasse
        //er customer, vendor og employee
        this.dropOffLocation = dropOffLocation;
    }
    //public Vendor(String dropOffLocation) {
      //  this.dropOffLocation = dropOffLocation;
    //}

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }
}
