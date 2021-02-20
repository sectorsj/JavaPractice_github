package alishev.lesson28accessmodifierspublicprivateprotecteddefault;

import alishev.lesson28accessmodifierspublicprivateprotecteddefault.packet1.Person;

public class AccessModifiers extends Person {  // класс может быть либо - public или default, основной класс должен быть public
    // public int id;       //public
    // int id;              //default - в пределах этого пакета
    // protected int id;    //protected - в пределах одного пакета, доступны всем подкласcам вне пакета (потомкам)

public AccessModifiers(){
    name = "Tom";
}

    // public static void main(String[] args) {
        //public, private, default, protected

        // Person person1 = new Person();
        // person1.name = "Billy"; // перетал быть публичным!!!

        // System.out.println(Person.CONSTANT);
//     }
}
    // private void technicalMethod() {   // private
    //
    // }

// class AccessModifiers2 {
        // классы схожие по названию с основным классом - (вспомогательные) могут быть default
// }
