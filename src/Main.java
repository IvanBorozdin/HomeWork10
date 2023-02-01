public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

    }
    public static void task2(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = firstName + " " + middleName + " " + lastName;
        String fullNameUpperCase=fullName.toUpperCase();
        System.out.println(fullNameUpperCase);


    }
    public static void task3(){
        String fullName="Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё','е'));


    }
}