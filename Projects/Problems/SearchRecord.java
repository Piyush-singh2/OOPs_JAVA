/*
Write a Java program to create a class with methods to search 
for flights and hotels, and to book and cancel reservations.

*/

public class SearchRecord {
    int PhoneNo;
    String NAme;
    String reportTime;
    String DepartureTime;
    static  int length = 0;

    static SearchRecord[] records = new SearchRecord[10];

    public SearchRecord() {
        
    }

    public static void searchrecord(int phoneNo){
        for (int idx = 0; idx < length; idx++) {
            if (records[idx]!=null && records[idx].PhoneNo == phoneNo) {
                System.out.println("Reservation found");
                return;
            }
        }    
     System.out.println("No reservation");       
    }
    void bookReservation(int phoneNo,String name, String reporttime, String Deaparttime){
            this.PhoneNo = phoneNo;
            this.NAme = name;
            this.reportTime = reporttime;
            this.DepartureTime = Deaparttime;
            records[length] = this;
            length++;
    }
    static void cancelReservation(int phoneNo){
         for (int idx = 0; idx < length; idx++) {
            if (records[idx]!=null && records[idx].PhoneNo == phoneNo) {
                records[idx] = null;
            }
        }
        System.out.println("Reservation cancelled");    
        }
    }
