package java_1_david.homeworkfive;

public class Main {

    /*
    persArray[0] = new Person("Ivanov Ivan", "Engineer",
    "ivivan@mailbox.com", "892312312", 30000, 30);
    потом для каждой ячейки массива задаем объект
    persArray[4] = new
    */


    public static void main(String[] args) {
        Emploeyee emploeyee = new Emploeyee("Иванов Иван", "Product manager", "ivivan@mailbox.com", 892312312, 55000, 40);
        Emploeyee emploeyee1 = new Emploeyee("Петров Петр", "Engineer", "Petrov@mailbox.com", 891412432, 30000,  39);
        Emploeyee emploeyee2 = new Emploeyee("Александров Александр", "Manager", "Aleksandrov@mailbox.com", 893416532, 25000, 23);
        Emploeyee emploeyee3 = new Emploeyee("Дмитриев Дмитрий", "HR-manager", "Dmitriev@mailbox.com", 891214312, 45000, 31);
        Emploeyee emploeyee4 = new Emploeyee("Семенов Семен", "Developer", "Semenov@mailbox.com", 894512354, 50000, 44);


        emploeyee.printInfo();
        emploeyee1.printInfo();
        emploeyee2.printInfo();
        emploeyee3.printInfo();
        emploeyee4.printInfo();
        //System.out.println(emploeyee); - не по дз, но тоже можно.

        Emploeyee[] persArray = new Emploeyee[5];
        persArray[0] = new Emploeyee("Иванов Иван", "Product manager", "ivivan@mailbox.com", 892312312, 55000, 40);
        persArray[1] = new Emploeyee("Петров Петр", "Engineer", "Petrov@mailbox.com", 891412432, 30000,  39);
        persArray[2] = new Emploeyee("Александров Александр", "Manager", "Aleksandrov@mailbox.com", 893416532, 25000, 23);
        persArray[3] = new Emploeyee("Дмитриев Дмитрий", "HR-manager", "Dmitriev@mailbox.com", 891214312, 45000, 31);
        persArray[4] = new Emploeyee("Семенов Семен", "Developer", "Semenov@mailbox.com", 894512354, 50000, 44);


        System.out.println("");
        System.out.println("Выводим данные о сотрудниках, массивом");
        for (int i = 0; i < persArray.length; i++) {
            System.out.println(persArray[i]);
        }


    }









}
