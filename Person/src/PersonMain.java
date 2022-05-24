import java.util.ArrayList;

public class PersonMain {

    public static void main(String[] args) {
        // write your test code here

        Teacher josh = new Teacher("Josh Taylor", "Waxhaw Highway, Waxhaw, NC", 100000);
        Teacher maya = new Teacher("Maya Jade", "Winthrop Chase Dr., Charlotte, NC", 50000);
        System.out.println(josh);
        System.out.println(maya);

        Student rob = new Student("Robert", "West Greenfield Ave, Milwaukee, WI");

        int i = 0;
        while (i < 25) {
            rob.study();
            i = i + 1;
        }
        System.out.println(rob);

    }

    public static void printPersons(ArrayList<Person> persons) {

        for (Person e : persons) {
            System.out.println(e);
        }

    }

}