
package pahrdorb_management_system;


public class Person {
    
   private String name,gender,phn_num;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhn_num() {
        return phn_num;
    }

    public void setPhn_num(String phn_num) {
        this.phn_num = phn_num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    void displayInformation(){
        
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getPhn_num());
    }
}
