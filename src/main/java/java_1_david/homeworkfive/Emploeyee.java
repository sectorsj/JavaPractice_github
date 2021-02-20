package java_1_david.homeworkfive;

public class Emploeyee {

    private String fio;         // ФИО
    private String position;    // должность
    private String email;       // email
    private int phone;          //телефон
    private double salary;      //зарплата
    private int age;          //возраст


    public Emploeyee(String fio, String position, String email, int phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);

    }


    // не получалось по тому что не знал про этот блок кода
    @Override
    public String toString() {
        return "Emploeyee{" +
                "fio:'" + fio + '\'' +
                ", position:'" + position + '\'' +
                ", email:'" + email + '\'' +
                ", phone:" + phone +
                ", salary:" + salary +
                ", age:" + age +
                '}';
    }
}

