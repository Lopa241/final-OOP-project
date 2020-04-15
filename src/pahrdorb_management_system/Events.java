
package pahrdorb_management_system;


 public class Events {
    
     String event_name, event_venue,donation;
    int beneficiary;
    double expenses;
    
   Events( String n, String v, int b, String d ,double e ){
        event_name = n;
        event_venue = v;
        beneficiary = b;
        donation = d;
        expenses = e;
                
   }
   Events( String n, String v, int b ,double e ){
       event_name = n;
        event_venue = v;
        beneficiary = b;
        expenses = e;
   }
           
           
   void displayInformation(){
       System.out.println("Event name:"+event_name);
       System.out.println("Vanue:"+event_venue);
       System.out.println("Number of benificiary:"+beneficiary);
       System.out.println("Donation collected:"+donation);
       System.out.println("Total expenses:"+expenses);
       System.out.println("\n");
   }
}
