package ie.gmit;

public class StudentClass {
    private String name;
    private String email;

    public String getName(){ return name;}
    public String getEmail(){return email;}

    public StudentClass(String name, String email){
        setName(name);
        setEmail(email);
    }

    public void setName(String name) {
        if(name == "Garry Thomas"){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Entered!");
        }
    }
    public void setEmail(String email){
        if(email == "G00386543"){
            this.email = email;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Entered!");
        }

    }
}
