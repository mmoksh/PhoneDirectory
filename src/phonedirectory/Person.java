package phonedirectory;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable{
    static ArrayList<Person> persons = new ArrayList<Person>();
    private String firstName;
    private String lastName;
    private long ID;
    private int age;
    private String gender;
    private final long phoneNumber;
    private String address;
    
    public Person(String firstName, String lastName,long ID, int age, String address, long phoneNumber, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;        
        this.address = address;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the ID
     */
    public long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(long ID) {
        this.ID = ID;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
}