package carpool.buddy.classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicle implements Serializable {
    private String owner;
    private String model;
    private int capacity;
    private String vehicleID;
    private ArrayList<String> ridersUID;
    private boolean open;
    private String vehicleType;
    private boolean electric;

    public void setOwner(String owner) {this.owner = owner;}
    public void setModel(String model) {this.model = model;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public void setVehicleID(String vehicleID) {this.vehicleID = vehicleID;}
    public void setRidersUID(ArrayList<String> ridersUID) {this.ridersUID = ridersUID;}
    public void setOpen(boolean open) {this.open = open;}
    public void setVehicleType(String vehicleType) {this.vehicleType = vehicleType;}
    public void setElectric(boolean electric) {this.electric = electric;}

    public String getOwner() {return owner;}
    public String getModel() {return model;}
    public int getCapacity() {return capacity;}
    public String getVehicleID() {return vehicleID;}
    public ArrayList<String> getRidersUID() {return ridersUID;}
    public boolean getOpen() {return open;}
    public String getVehicleType() {return vehicleType;}
    public boolean getElectric() {return electric;}

    public Vehicle(String ow, String m, int c, String vid, ArrayList<String> rid, boolean op, String vt, boolean e) {
        owner = ow;
        model = m;
        capacity = c;
        vehicleID = vid;
        ridersUID = rid;
        open = op;
        vehicleType = vt;
        electric = e;
    }
}
