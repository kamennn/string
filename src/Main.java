public class Main {
    public static void main(String[] args) {
        //        первая задача
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);
//         вторая задача
        String firstName1 = "Ivan";
        String middleName1 = "Ivanov";
        String lastName1 = "Ivanovich";
        String fullName1 = middleName1 + " " + firstName1 + " " + lastName1;
        String upperFullname1 = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + upperFullname1);
//        тертья задача
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + fullName2);
    }
}
