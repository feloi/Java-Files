package entities;

public class Rents {
    private String name;
    private String email;
    public  Rents(){

    }
    public Rents(String name, String email){
        this.name = name;
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
