
package pahrdorb_management_system;


public class Beneficiary extends Person {
       
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
   
   void displayInforfamion(){
   
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getPhn_num());
        System.out.println(getAddress());
        System.out.println("\n");
   }
    
    
}
