
package pahrdorb_management_system;


public class Members extends Person{
    
    private String blood_grp, joining_date;
    private int nid_num;

    public String getBlood_grp() {
        return blood_grp;
    }

    public void setBlood_grp(String blood_grp) {
        this.blood_grp = blood_grp;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public int getNid_num() {
        return nid_num;
    }

    public void setNid_num(int nid_num) {
        this.nid_num = nid_num;
    }
    
   
    @Override
    void displayInformation(){
        
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getPhn_num());
        System.out.println(getBlood_grp());
        System.out.println(getJoining_date());
        System.out.println(getNid_num());
        System.out.println("\n");
        
    }
}
