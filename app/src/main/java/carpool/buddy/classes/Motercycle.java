package carpool.buddy.classes;

import java.util.ArrayList;

public class Motercycle extends Vehicle{
    private int weightCapacity;

    public void setWeightCapacity(int weightCapacity) {this.weightCapacity = weightCapacity;}

    public int getWeightCapacity() {return weightCapacity;}

    public Motercycle(String ow, String m, int c, String vid, ArrayList<String> rid, boolean op, String vt, boolean e, int wc) {
        super(ow, m, c, vid, rid, op, vt, e);
        weightCapacity = wc;
    }
}
