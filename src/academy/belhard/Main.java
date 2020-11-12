package academy.belhard;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Address address1 = new Address("Minsk","Rokossovskogo",236);
        Person person1 = new Person("Maxim","Ryzhykh", address1);

        Address address2 = new Address("Minsk","Narodnaya",17);
        Person person2 = new Person("Nastya","Gladkaya", address2);

        Address address3 = new Address("Gomel","Brezhneva",21);
        Person person3 = new Person("Iosif","Cuper", address3);

        Address address4 = new Address("Gomel","Gorovca",35);
        Person person4 = new Person(null,"Sivec", address4);

        Address address5 = new Address("Gomel","Brezhneva",21);
        Person person5 = new Person("Iosif",null, address5);

        Person person6 = new Person("Iosif","Cuper", null);


        List<Person> personList1 = new ArrayList<>();

        personList1.add(person1);
        personList1.add(person2);
        personList1.add(person3);
        personList1.add(person4);
        personList1.add(person5);
        personList1.add(person6);


//        List<Person> streamResult = personList1
//                .stream()
//                .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAddress() != null)
//                .collect(Collectors.toList());
//        System.out.println(streamResult);


        List<Person> streamResult = personList1
                .stream()
                .sorted((p1, p2) -> p2.getAddress().getHouseNumb() - p1.getAddress().getHouseNumb())
                .collect(Collectors.toList());
        System.out.println(streamResult);



//        System.out.println(person1.toString());
//        System.out.println(person2.toString());
//        System.out.println(person3.toString());
//        System.out.println(person4.toString());
//        System.out.println(person5.toString());
//        System.out.println(person6.toString());

    }
}
