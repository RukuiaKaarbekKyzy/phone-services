import db.DataBase;
import model.Contacts;
import model.Phones;
import service.ContactServiceImpl;
import service.PhoneServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        DataBase dataBase=new DataBase();
        PhoneServiceImpl phoneService=new PhoneServiceImpl(dataBase);
        ContactServiceImpl contactService=new ContactServiceImpl();

        int choice;

        do {
            System.out.println("1.add Phone");
            System.out.println("2.get Phone ById");
            System.out.println("3.update Phone Name ById");
            System.out.println("4.get All Phones");
            System.out.println("5.get All Phones By Brand");
            System.out.println("6.delete Phone By Id");
            System.out.println("7.add Contact To Phone");
            System.out.println("8.find Contact By Name");
            System.out.println("9.find Contact By Phone Number");
            System.out.println("10.sort Contacts By Name");
            System.out.println("11.delete Contact By Name From Phone");
            System.out.println("12.exit");

            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter phone name:");
                    String name1=scanner.nextLine();
                    System.out.println("Enter phone brand:");
                    String brand=scanner.nextLine();

                    System.out.println("Enter phone contacts:");
                    System.out.println("Enter contact name:");
                    String contactName=scanner.nextLine();
                    System.out.println("Enter contact phone number:");
                    String number=scanner.nextLine();
                    Contacts contacts=new Contacts(contactName,number);
                    Phones phone=new Phones(name1,brand,new ArrayList<>());
                    phone.getContacts().add(contacts);
                    phoneService.addPhone(phone);
                    break;
                case 2:
                    System.out.println("Enter phone id:");
                    int id1=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(dataBase.getPhoneById(id1));
                    break;
                case 3:
                    System.out.println("Enter phone id:");
                    int id2=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter phone name to update:");
                    String newName=scanner.nextLine();
                    System.out.println(dataBase.updatePhoneNameById(id2, newName));
                    break;
                case 4:
                    System.out.println(dataBase.getAllPhones());
                    break;
                case 5:
                    System.out.println("Enter phone brand:");
                    String brand1=scanner.nextLine();
                    System.out.println(dataBase.getAllPhonesByBrand(brand1));
                    break;
                case 6:
                    System.out.println("Enter phone id to delete:");
                    int id3=scanner.nextInt();
                    scanner.nextLine();
                    dataBase.deletePhoneById(id3);
                    break;
                case 7:
                    System.out.println("Enter phone id:");
                    int id4=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter contact name:");
                    String contactName1=scanner.nextLine();
                    System.out.println("Enter contact phone number:");
                    String number1=scanner.nextLine();
                    Contacts contacts1=new Contacts(contactName1,number1);
                    System.out.println(dataBase.addContactToPhone(id4, contacts1));
                    break;
                case 8:
                    System.out.println("Enter phone id:");
                    int id5=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter contact name:");
                    String contactName2=scanner.nextLine();
                    System.out.println(dataBase.findContactByName(id5, contactName2));
                    break;
                case 9:
                    System.out.println("Enter phone id:");
                    int id6=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter contact phone number:");
                    String number2=scanner.nextLine();
                    System.out.println(dataBase.findContactByName(id6, number2));
                    break;
                case 10:
                    System.out.println("Enter phone id:");
                    int id7=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(dataBase.sortContactsByName(id7));
                case 11:
                    System.out.println("Enter phone id:");
                    int id8=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter contact name:");
                    String contactName3=scanner.nextLine();
                    dataBase.deleteContactByNameFromPhone(id8,contactName3);
                    break;
                case 0:
                    break;
            }

        }while (true);

    }
}
