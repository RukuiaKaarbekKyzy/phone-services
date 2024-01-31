package service;

import model.Contacts;
import model.Phones;

import java.util.List;

public interface PhoneService {
    String addPhone(Phones phone);

    // with stream

    Phones getPhoneById(int phoneId);

    // with stream

    Phones updatePhoneNameById(int phoneId, String newName);

    // with stream

    List<Phones> getAllPhones();

    // with stream

    List<Phones> getAllPhonesByBrand(String brand);

    void deletePhoneById(int phoneId);
}
