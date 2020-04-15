
package pahrdorb_management_system;


public class Executive extends Members{
    
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    void displayInforfamion(){
        
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getPhn_num());
        System.out.println(getBlood_grp());
        System.out.println(getJoining_date());
        System.out.println(getNid_num());
        System.out.println(getRank());
        System.out.println("\n");
        
   
   }
}
