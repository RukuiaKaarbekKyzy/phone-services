package service;

import db.DataBase;
import model.Contacts;
import model.Phones;

import java.util.List;

public class PhoneServiceImpl implements PhoneService{
    private DataBase dataBase;

    public PhoneServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addPhone(Phones phone) {
        dataBase.savePhones(phone);
        return "Phone added successfully";
    }

    @Override
    public Phones getPhoneById(int phoneId) {
       return  dataBase.getPhoneById(phoneId);
    }

    @Override
    public Phones updatePhoneNameById(int phoneId, String newName) {
        return dataBase.updatePhoneNameById(phoneId,newName);
    }

    @Override
    public List<Phones> getAllPhones() {
        return  dataBase.getAllPhones();
    }

    @Override
    public List<Phones> getAllPhonesByBrand(String brand) {
        return dataBase.getAllPhonesByBrand(brand);
    }

    @Override
    public void deletePhoneById(int phoneId) {
        dataBase.deletePhoneById(phoneId);
        System.out.println("deleted");

    }
}
