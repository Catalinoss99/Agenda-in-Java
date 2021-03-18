
package agenda;

public class Contact implements Comparable<Contact>{
    private int id;
    private String firstname;
    private String lastname;
    private String phoneno;
    private String mob_fix;
    private String birthdate;
        
    public Contact(int id, String firstname, String lastname, String phoneno,
        String mob_fix, String birthdate){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneno = phoneno;
        this.mob_fix = mob_fix;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getMob_fix() {
        return mob_fix;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setMob_fix(String mob_fix) {
        this.mob_fix = mob_fix;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Contact))
            return false;
        Contact c = (Contact)o;
        return (firstname.equals(c.firstname) &&
                lastname.equals(c.lastname) &&
                phoneno.equals(c.phoneno) &&
                birthdate.equals(c.birthdate));
    }
    
    @Override
    public String toString() {
        String str = this.getId() + ", " + this.getFirstname() + ", " +
            this.getLastname() + ", " + this.getPhoneno() + ", " + 
            this.getMob_fix() + ", " + this.getBirthdate();
        return str;
    }
    
    @Override
    public int compareTo(Contact c) {
        return id - c.id;
    }
}
