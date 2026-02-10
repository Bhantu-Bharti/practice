package interview2026;

import java.util.Date;
import java.util.List;

public class January {
    public static void main(String[] args){
        System.out.println("Started the interview....");
        Date now = new Date();
        Address address1 = new Address(11, "Kundari", "Lesliganj");
        Address address2 = new Address(14, "Oriya", "Lesliganj");
        ImmutableEmployee immutableEmployee = new ImmutableEmployee("bhantu",now,
                List.of(address1,address2));
        System.out.println(immutableEmployee);
        System.out.println("****************After modify the Landmark**************");
        address2.setLandmark("Panki Road");
        System.out.println(immutableEmployee);
        System.out.println(address2);
    }
}
