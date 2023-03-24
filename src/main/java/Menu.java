import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    private Contact contact;
    //private String contacts;
    private Contact index;
    private Contact newContact;

    public String contacts;

    public Menu (){
        contacts = String.valueOf(new ArrayList<>());
    }

    public void start(){
        JOptionPane.showConfirmDialog(null, "Please choose an option");
        this.displayMainMenu();
    }

    private void displayMainMenu(){
        String option = this.getUserInput ("Write a number for an option you want to perform\n" +
                "1. Create contact\n " +
                "2. Find contact\n " +
                "3. Update contact\n " +
                "4. Delete contact\n " +
                "5. See all contacts\n " +
                "6. Exit\n "
        );

        switch (option){
            case "1":
                this.createContact();
                break;
            case "2":
                this.findContactByName(contact);
                break;
            case "3":
                this.updateContact(index, newContact);
                break;
            case "4":
                this.deleteContact(contact);
                break;
            case "5":
                this.seeAllContacts(contact);
                break;
            case "6":
                System.out.println("Good bye!");
                break;
        }

        System.exit(0);

    }

    private void seeAllContacts(Contact contacts) {

        if(contacts.isEmpty()){
            JOptionPane.showInputDialog ("phonebook is empty");
        }else{
            JOptionPane.showInputDialog(contact);
        }
    }

    private static Contact getContacts(Contact contacts) {
        return contacts;
    }

    private void deleteContact(Contact contact) {
        if (delete(contact)) {
            JOptionPane.showInputDialog ("Contact deleted successfully");
        } else {
            JOptionPane.showInputDialog("Contact not found");
        }
    }

    private boolean delete(Contact contact) {
        return false;
    }

    private void updateContact(Contact oldContact, Contact newContact) {
        int index = contacts.indexOf (String.valueOf(oldContact));
        if (index != -1) {
            contacts (index, newContact);
            JOptionPane.showInputDialog("Contact updated successfully");
        }else{
            JOptionPane.showInputDialog("Contact not found");
        }
    }

    private void contacts(int index, Contact newContact) {
    }

    private void findContactByName(Contact fullName) {
        boolean found = false;

        if (contact.getFullName().equals(fullName)) {
            JOptionPane.showInputDialog(contact);
            found = true;
        }else{
            JOptionPane.showInputDialog("No matching contacts found");
        }
    }

    private void createContact() {
        String fullName = this.getUserInput("Enter Name Surname");
        String phoneNumber = this.getUserInput("Enter phone number");
        String email = this.getUserInput("Enter e-mail");
        Contact contact = new Contact (fullName, phoneNumber, email);

        this.displayMessage("New contact " + contact.getFullName() + " is created");

        //User user = new User(fullName, phoneNumber, email);
        // this.displayMessage("New contact " +  user.getFullName() + " is created");

    }

    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
    private void displayMessage (String message){
        JOptionPane.showInputDialog(null, message);
    }

}

