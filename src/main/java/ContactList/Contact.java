package ContactList;


//TODO: set the class as public-> Executed
   public class Contact {
       private static long idCounter = 1;
   private String lastName;
   private String firstName;
   private String email;
   private String number;
   private Long id;

  public  Contact (String lastName, String firstName, String email, String number){
        this.id = idCounter++;
        if(Validators.isNameValid(lastName)) {
            this.lastName = lastName;
        } else throw  new RuntimeException("Invalid lastname");

         if(Validators.isNameValid(firstName)) {
             this.firstName = firstName;
         }else throw new RuntimeException("Invalid firstname.");

        if (Validators.isEmailValid(email)) {
            this.email = email;
        }else throw new RuntimeException("Invalid Email");
        if(Validators.isNumberValid(number)) {
            this.number = number;
        }else throw new RuntimeException("Invalid Number");

    }
    public Contact(Long id, String lastName, String firstName, String email, String number ){
      this.id = id;
      this.firstName =firstName;
      this.lastName = lastName;
      this.email = email;
      this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public Long getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", id=" + id +
                '}';
    }
}

