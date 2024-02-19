package carpool.buddy.classes;

import java.util.ArrayList;

public class Teacher extends User{
    private String inSchoolTitle;

    public void setInSchoolTitle(String inSchoolTitle) {this.inSchoolTitle = inSchoolTitle;}

    public String getInSchoolTitle() {return inSchoolTitle;}

    public Teacher(String id, String n, String e, String ut, ArrayList<String> ov, int r, String ist) {
        super(id, n, e, ut, ov, r);
        inSchoolTitle = ist;
    }
}
