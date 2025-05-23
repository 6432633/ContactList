package ContactList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

//TODO: make the class public -> Executed
    public class ContactManager {
     private final List<Contact> contacts = new ArrayList<>();
    public ContactManager(){
    }


    public void addContact(Contact contact){
        //TODO check if contact already exist -> Need check !
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(c.getFirstName())) {
                System.out.println("This contact exists .");
            }
        }
      contacts.add(contact);
        System.out.println("Contact Added: " + contact);
    }

    public void listContacts(){
      if (contacts.isEmpty()){
          System.out.println("No contacts found");
      }else {
          for (Contact c :contacts){
              System.out.println(c);
          }
      }
    }
    //TODO: return a list of contacts
    public Contact searchByName(String name){
        //TODO: make it void
      for (Contact c : contacts){
          if(c.getFirstName().equalsIgnoreCase(name)) {

              return c;
          }
      }
         return null;
    }

    public void deleteContact(Long id){
        //TODO: make it void -> Need check !
        for(int i = 0; i< contacts.size(); i++){
            if(contacts.get(i).getId().equals(id)){
                Contact remover = contacts.remove(i);
                System.out.println("Contact deleted: " + remover );
            }else System.out.println("Contact not found.");
        }
    }
    public void updateContact(Long id, Contact updateContact){
        //TODO: make it void -> Need to check !
        for (int i = 0; i< contacts.size(); i++){
            if (contacts.get(i).getId().equals(id)){
                contacts.set(i, updateContact);
                System.out.println("Contact update: " + updateContact);

            }else System.out.println("Contact not found. ");
        }

    }
    public int countContacts(){
       int size = contacts.size();
       return size;
    }
}
