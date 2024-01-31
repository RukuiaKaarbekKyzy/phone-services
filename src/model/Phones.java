package model;

import java.util.List;

public class Phones {
    private static int incID= 1;
   private int id;
   private String name;
   private String brand;
   private List<Contacts>contacts;

    public Phones(String name, String brand, List<Contacts> contacts) {
        this.id = incID++;
        this.name = name;
        this.brand = brand;
        this.contacts = contacts;
    }

    public static int getIncID() {
        return incID;
    }

    public static void setIncID(int incID) {
        Phones.incID = incID;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
