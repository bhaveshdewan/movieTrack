package onetomany.Laptops;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import onetomany.Users.User;


@Entity
public class Laptop {
    
    /* 
     * The annotation @ID marks the field below as the primary key for the table created by springboot
     * The @GeneratedValue generates a value if not already present, The strategy in this case is to start from 1 and increment for each table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double cpuClock;
    private int cpuCores;
    private int ram;
    private String manufacturer;
    private int cost;

    /*
     * @OneToOne creates a relation between the current entity/table(Laptop) with the entity/table defined below it(User)
     * @JsonIgnore is to assure that there is no infinite loop while returning either user/laptop objects (laptop->user->laptop->...)
     */
    @OneToOne
    @JsonIgnore
    private User user;

    
     // =============================== Constructors ================================== //


    public Laptop( double cpuClock, int cpuCores, int ram, String manufacturer, int cost) {
        this.cpuClock = cpuClock;
        this.cpuCores = cpuCores;
        this.ram = ram;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    public Laptop() {
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getCpuClock(){
        return cpuClock;
    }

    public void setCpuClock(double cpuClock){
        this.cpuClock = cpuClock;
    }

    public int getCpuCores(){
        return cpuCores;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public void setCpuCores(int cpuCores){
        this.cpuCores = cpuCores;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

   /* public float getCost(){
        return cost; changing into float 
    }
        
    public void setRam(float ram){
            this.ram = ram;
        }

        
    public void setCpuCores(int cpuCores){
            this.cpuCores = cpuCores;
        }

        public String getManufacturer(){
            return manufacturer;
        }

        public void setManufacturer(String manufacturer){
            this.manufacturer = manufacturer;
        }

        public float getCost(){
            return cost;
    }
*/
    

}
