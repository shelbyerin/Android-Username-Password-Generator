package cosc426.assign1part3;


public class Generator {
    String firstName, lastName, DOB;

    public Generator(){

    }

    public void set(String firstName, String lastName, String DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public String getUsername(){
        String username;
        String day;
        String month;
        String year;
        String[] DateBirth;

        DateBirth = this.DOB.split("/");
        month = DateBirth[0];
        day = DateBirth[1];
        year = DateBirth[2];


        this.firstName = this.firstName.toLowerCase();
        this.lastName = this.lastName.toLowerCase();

        username = "" + this.firstName.charAt(0) + this.lastName + day;

        return username;
    }

    public String getPassword(){
        String password;
        String day;
        String month;
        String year;
        String[] DateBirth;

        DateBirth = this.DOB.split("/");
        month = DateBirth[0];
        day = DateBirth[1];
        year = DateBirth[2];

        this.firstName = this.firstName.toLowerCase();
        this.lastName = this.lastName.toLowerCase();

        password = "" + this.firstName.charAt(0) + this.firstName.charAt(this.firstName.length() - 1) + month + year.substring(2,4) + this.lastName.substring(0,3)
                + this.firstName.length() + this.lastName.length();

        return password;
    }
}
