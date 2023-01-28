package Departament;


import jakarta.persistence.*;



@Entity
@Table(name = "tb_ser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "departament_id")

    private departament departament;

    public User(){

    }
    public long getId(){
        return id;
    }
    public long setId(long id){
        return this.id = id;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail(String email){
        return this.email = email;
    }
    public departament getDepartament(){
        return departament;
    }
    public void setDepartament(departament departament){
        this.departament = departament;
    }

}
