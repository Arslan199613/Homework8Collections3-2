import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 3.2");
        Set<String> tasks = new HashSet<>();
        tasks.add("2*4");
        tasks.add("2*5");
        tasks.add("2*1");
        tasks.add("4*3");
        tasks.add("4*5");
        tasks.add("9*2");
        tasks.add("6*2");
        tasks.add("8*5");
        tasks.add("9*9");
        tasks.add("7*1");
        tasks.add("7*8");
        tasks.add("9*1");
        tasks.add("10*2");
        tasks.add("2*8");
        tasks.add("1*8");

        for (String task : tasks) {
            System.out.println(task);
        }
            System.out.println("Домашнее задание 3.2");

            Passport passportOffice = new Passport();
            passportOffice.addPasport(8423426L, "Сергей", "Иванов", "Андеевич", LocalDate.ofEpochDay(1990- 03 -11));

        }
    }
