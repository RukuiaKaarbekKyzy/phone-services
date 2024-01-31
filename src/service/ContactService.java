package service;

import model.Contacts;
import model.Phones;

import java.util.List;

public interface ContactService {
    String addContactToPhone(int phoneId, Contacts contact);

    // with stream (телефонду phoneId мн табып, ичинен контантактардын  арасынан contactName мн табып кайтарып берсин)
    Contacts findContactByName(int phoneId, String contactName);

    // with stream

   Contacts findContactByPhoneNumber(int phoneId, String phoneNumber);

// with stream (телефонду phoneId мн табып, ичинен контантактарды аттарын осуу тартибинде чыгарып берсин)

   List<Contacts>sortContactsByName(int phoneId);

   void deleteContactByNameFromPhone(int phoneId, String contactName);
}
