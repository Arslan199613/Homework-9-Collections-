import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();


        Map<String, Integer> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("Иванов Иван", +798771721);
        telephoneDirectory.put("Петров Андрей", +798771723);
        telephoneDirectory.put("Сидоров Олег", +798771725);
        telephoneDirectory.put("Джунов Джун", +798771726);
        telephoneDirectory.put("Воробьев Олег", +798771344);
        telephoneDirectory.put("Васильев Василий", +798771723);
        telephoneDirectory.put("Депутатов Михаил", +798771743);
        telephoneDirectory.put("Меров Павел", +798771798);
        telephoneDirectory.put("Иванов Павел", +798771709);
        telephoneDirectory.put("Иванов Олег", +798771111);
        telephoneDirectory.put("Иванов Михаил", +798771888);
        telephoneDirectory.put("Петров Евгений", +798771555);
        telephoneDirectory.put("Оспенников Константин", +798771333);
        telephoneDirectory.put("Хомяков Иван", +798771727);
        telephoneDirectory.put("Сидоров Сергей", +798771667);
        telephoneDirectory.put("Сергеев Иван", +798771134);
        telephoneDirectory.put("Сергеев Дмитрий", +798776768);
        telephoneDirectory.put("Дмитрьев Иван", +798771686);
        telephoneDirectory.put("Никифоров Иван", +798771686);
        telephoneDirectory.put("Климов Иван", +798771686);

        for (Map.Entry<String, Integer> contact: telephoneDirectory.entrySet()) {
            System.out.println(contact);


        }


        }


    }


