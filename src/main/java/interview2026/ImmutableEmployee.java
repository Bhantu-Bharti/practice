package interview2026;

import java.util.*;
import java.util.stream.Collectors;

public final class ImmutableEmployee {
    private final String name;
    private final Date joiningDate;
    private final List<Address> addresses;
//    private final Map<String,Address> map;

    public ImmutableEmployee(String name,Date joiningDate, List<Address> addresses){
        this.name = name;
        this.joiningDate = new Date(joiningDate.getTime());
        this.addresses = addresses.stream()
                .map(Address::new)
                .toList();

    }

    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return addresses.stream()
                .map(Address::new)
                .toList();
    }

    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "name='" + name + '\'' +
                ", joiningDate=" + joiningDate +
                ", addresses=" + addresses +
                '}';
    }
}
