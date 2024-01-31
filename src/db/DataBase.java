package db;

import model.Contacts;
import model.Phones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataBase {
    private List<Phones>phonesList;


    public DataBase() {
        this.phonesList =new ArrayList<>();
    }
    public void savePhones(Phones phone){
        phonesList.add(phone);
        System.out.println("Phone added successfully" +phonesList);
    }

    public Phones getPhoneById(int id){
        return phonesList.stream()
                .filter(phones -> phones.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public Phones updatePhoneNameById(int phoneId, String newName){
        phonesList.stream()
                .filter(phones -> phones.getId()==phoneId)
                .forEach(phones -> phones.setName(newName));
        return getPhoneById(phoneId);
    }
    public List<Phones> getAllPhones(){
        return phonesList;
    }
    public List<Phones> getAllPhonesByBrand(String brand){
        return phonesList.stream()
                .filter(phones -> phones.getBrand().equals(brand))
                .toList();
    }
    public void deletePhoneById(int phoneId) {
        phonesList.stream()
                .filter(phones -> phones.getId()==phoneId)
                .findFirst()
                .ifPresent(phones -> phonesList.remove(phones));
    }

    public String addContactToPhone(int phoneId, Contacts contact) {
        Phones phones = getPhoneById(phoneId);
        if (phones !=null && contact !=null && !phones.getContacts().contains(contact)){
            phones.getContacts().add(contact);
            return "Contact added successfully";

        }
        return "Failed to add contact. Please check the provided phoneId or contact.";
    }

    public Contacts findContactByName(int phoneId, String contactName) {
        Phones phones=getPhoneById(phoneId);
        return phones.getContacts().stream()
                .filter(contacts -> contacts.getName().equals(contactName))
                .findFirst()
                .orElse(null);
    }

    public Contacts findContactByPhoneNumber(int phoneId, String phoneNumber) {
        Phones phones=getPhoneById(phoneId);
        return phones.getContacts().stream()
                .filter(contacts -> contacts.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);
    }
    public List<Contacts> sortContactsByName(int phoneId) {
        Phones phones=getPhoneById(phoneId);
        return phones.getContacts().stream()
                .sorted(Comparator.comparing(Contacts::getName))
                .toList();
    }
    public void deleteContactByNameFromPhone(int phoneId, String contactName) {
        Phones phone = getPhoneById(phoneId);
        if (phone != null) {
            boolean removed=phone.getContacts().removeIf(contact -> contact.getName().equals(contactName));

            if (removed){
                System.out.println("Contact with name " + contactName + " removed successfully.");
            }else{
                System.out.println("No contact with name " + contactName + " found.");
            }
        }
    }

}
