import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Leo");
        names.add("mike");
        System.out.println(names);
        names.remove("Leo");
        System.out.println(names);

        names.add(2, "Ross");
        System.out.println(names);

//isEmpty boolean для коллекций
        // names.clear();
        if (names.isEmpty()) {
            System.out.println("Да список пустой:" + names.size());
        } else {
            System.out.println("Нут список не пустой:" + names.size());

        }
        if (names.contains("Ross")) {
            System.out.println("Ecть:" + names.get(1));
        } else {
            System.out.println("Нету");
        }
        names.set(2, "Smith");
        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Sonya");
        names2.add("Stella");
        System.out.println(names2);

        System.out.println("Список 1" + names);
        System.out.println("Список 2" + names2);

        names.addAll(names2);

        System.out.println("Список 1 :" + names);
        System.out.println("Список 2:" + names2);
        names.removeAll(names2);
        System.out.println("Список 1 :" + names);
        System.out.println("Список 2:" + names2);
        for (String n : names) {
            System.out.println(n);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        names.forEach(plees-> {
            System.out.println(plees);
        });

         User user1 = new User("Jonh", 37);
         User user2 = new User("Leo", 13);
         User user3 = new User("Mike", 44);

         ArrayList<User> users = new ArrayList<>();
         users.add(user1);
         users.add(user2);
         users.add(user2);
         users.add(user3);
        System.out.println(users);

///Collections
        names.add("Antany");//sort sortirovka
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


        Collections.sort(names2);
        System.out.println(names2);


        ArrayList<String>colors= new ArrayList<>();
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);
        colors.add("white");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);

    }
}











