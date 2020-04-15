
package pahrdorb_management_system;


public class MainClass {
    
    public static void main(String[] args) {
        
    { System.out.println("Super Class:");
        Members m1 = new Members();
    
        
        m1.setName("Mahmuda Akter Lopa");
        m1.setAge(20);
        m1.setGender("female");
        m1.setPhn_num("019XXXXXXX");
        m1.setBlood_grp("A+");
        m1.setJoining_date("28th June,2019");
        m1.setNid_num(85468);
        m1.displayInformation();
       
    }
        
    { System.out.println("Executive Member");
      Executive e1 = new Executive();
    
        e1.setName("Md. Masud Rana");
        e1.setAge(25);
        e1.setGender("male");
        e1.setPhn_num("01888888888");
        e1.setBlood_grp("b+");
        e1.setJoining_date("1st January, 2019");
        e1.setNid_num(862263);
        e1.setRank("President");
        e1.displayInformation();
       
    }
        System.out.println("Ordinary Member");
     { Ordinary o1 = new Ordinary();
        
        o1.setName("Maksuda Akter ");
        o1.setAge(23);
        o1.setGender("female");
        o1.setPhn_num("013XXXXXXX");
        o1.setBlood_grp("O+");
        o1.setJoining_date("1st August,2019");
        o1.setNid_num(66769);
        o1.setRreg_date("31st July 2020");
        o1.displayInformation();
       
    }
        System.out.println("Beneficiary");
        {
            Beneficiary b1 = new Beneficiary();
            
            b1.setName("Md.Rahim");
            b1.setAge(50);
            b1.setGender("male");
            b1.setPhn_num("017XXXXXXX");
            b1.setAddress("tongi");
            b1.displayInforfamion();
            
        }
        
        System.out.println("Events:");
        
        Events event1 = new Events("Blood donation camp","Dhaka Medical College",20 ,10000.00);
        event1.displayInformation();
        
        Events event2 = new Events("Winter cloth distribution","Rongpur",50,"10000.00",15000.00);
        event2.displayInformation();
}
