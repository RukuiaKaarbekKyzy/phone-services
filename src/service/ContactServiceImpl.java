package service;

import db.DataBase;
import model.Contacts;
import model.Phones;

import java.util.List;

public class ContactServiceImpl implements ContactService {
    private DataBase dataBase;


    @Override
    public String addContactToPhone(int phoneId, Contacts contact) {
        return dataBase.addContactToPhone(phoneId,contact);
    }

    @Override
    public Contacts findContactByName(int phoneId, String contactName) {
        return dataBase.findContactByName(phoneId,contactName);
    }

    @Override
    public Contacts findContactByPhoneNumber(int phoneId, String phoneNumber) {
        return dataBase.findContactByPhoneNumber(phoneId,phoneNumber);
    }

    @Override
    public List<Contacts> sortContactsByName(int phoneId) {
        return dataBase.sortContactsByName(phoneId);
    }

    @Override
    public void deleteContactByNameFromPhone(int phoneId, String contactName) {
        dataBase.deleteContactByNameFromPhone(phoneId,contactName);
    }
}
