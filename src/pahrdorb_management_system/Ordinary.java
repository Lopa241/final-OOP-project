
package pahrdorb_management_system;


public class Ordinary extends Members{
    
    private String rreg_date;

    public String getRreg_date() {
        return rreg_date;
    }

    public void setRreg_date(String rreg_date) {
        this.rreg_date = rreg_date;
    }
    
    void displayInforfamion(){
        
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getPhn_num());
        System.out.println(getBlood_grp());
        System.out.println(getJoining_date());
        System.out.println(getNid_num());
        System.out.println(getRreg_date());
        System.out.println("\n");
        
    
}
