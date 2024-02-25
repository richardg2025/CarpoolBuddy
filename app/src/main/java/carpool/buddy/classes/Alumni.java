package carpool.buddy.classes;

import java.util.ArrayList;

import carpool.buddy.classes.User;

public class Alumni extends User {
    private String graduateYear;

    public void setGraduateYear(String graduateYear) {this.graduateYear = graduateYear;}

    public String getGraduateYear() {return graduateYear;}

    public Alumni(String id, String n, String e, String ut, ArrayList<String> ov, int r, String gy) {
        super(id, n, e, ut, ov, r);
        graduateYear = gy;
    }
}
