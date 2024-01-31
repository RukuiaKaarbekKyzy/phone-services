package model;

public class Contacts {
    private static int incID= 1;
    private int id;
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.id=incID++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static int getIncID() {
        return incID;
    }

    public static void setIncID(int incID) {
        Contacts.incID = incID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
