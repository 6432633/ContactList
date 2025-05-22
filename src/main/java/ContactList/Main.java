package ContactList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactList.ContactManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("\n ---ContactManager---");
            System.out.println("1. Add contact");
            System.out.println("2. List contacts");
            System.out.println("3. Search contact by first name");
            System.out.println("4. Delete contact by ID");
            System.out.println("5. Update contact by ID");
            System.out.println("6. Contact numbers");
            System.out.println("7. Exit");
            System.out.println("Choose an option");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("First name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Last name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Phone number: ");
                    String number = scanner.nextLine();
                    scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, email, number);
                    manager.addContact(newContact);
                    break;

                case 2:
                    manager.listContacts();
                    break;
                case 3:
                    System.out.println("Enter first name to search: ");
                    String nameToSearch = scanner.nextLine();
                    Contact found = manager.searchByName(nameToSearch);
                    if(found != null){
                        System.out.println("Found: " + found);
                    }else{
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter ID to delete: ");
                    long idToDelete = scanner.nextLong();
                    scanner.nextLine();
                    manager.deleteContact(idToDelete);
                case 5:
                    System.out.println("Enter ID to Update: ");
                    long idToUpdate = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("New first name: ");
                    String newFirst = scanner.nextLine();
                    System.out.println("New last name: ");
                    String newLast = scanner.nextLine();
                    System.out.println("New email: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("New phone number: ");
                    String newNumber = scanner.nextLine();


                    Contact update = new Contact( idToUpdate, newFirst, newLast , newEmail, newNumber );
                    manager.updateContact(idToUpdate,update);
                    break;
                case 6:
                    System.out.println("Total contacts: " + manager.countContacts());
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 6 .");
            }
        }
        scanner.close();
    }
}
