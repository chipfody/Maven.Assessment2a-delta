package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

import static java.lang.Long.MIN_VALUE;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = MIN_VALUE;
        name = "";
        address = new Address();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {

            Person o1 = (Person) o;
            if(o1.id == this.id) {
                return true;
            }else if(Objects.equals(o1.name, this.name)){
                return true;
            }
            return false;
        }

//        return (
//                ((Person) o).id.equals(this.id) &&
//                ((Person) o).name.equals(this.name) &&
//                ((Person) o).address.equals(this.address)
//                );
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}