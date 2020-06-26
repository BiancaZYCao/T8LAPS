package sg.edu.iss.sa50.t8.model;

 

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

 

@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    
    
    public User() {
        super();
        // TODO Auto-generated constructor stub 
    }

 

    public User(int id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        
    }

 

    public User(String name, String email) {
        super();
        this.name = name;
        this.email = email;
        
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getEmail() {
        return email;
    }

 

    public void setEmail(String email) {
        this.email = email;
    }

 

    

 

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
    
    
    

 

}