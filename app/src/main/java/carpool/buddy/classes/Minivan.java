package carpool.buddy.classes;

import java.util.ArrayList;

public class Minivan extends Vehicle {
    private int range;

    public void setRange(int range) {this.range = range;}

    public int getRange() {return range;}

    public Minivan(String ow, String m, int c, String vid, ArrayList<String> rid, boolean op, String vt, boolean e, int r) {
        super(ow, m, c, vid, rid, op, vt, e);
        range = r;
    }
}
