package ru.sectorsj.learning.videoblogers.alishev.lesson17methodparameters;

    public class MethodParameters {
        public static void main(String[] args) {
            Person person1 = new Person();
            person1.setNameAndAge("Роман", 50);

            String s1 = "Вова";

            //переменная (s1) не обязано должна совпадать с переменной в методе "setName"  (String username) из строки 22

            Person person2 = new Person();
            person2.setNameAndAge(s1, 30);

            person1.speak();
            person2.speak();

        }
    }
    class Person {
        String name;
        int age;

        //      void setName(String username){ // метод setName
        //          name = username;
        //      void setName(int x) - можно поставлять в параметры целые числа
        //      void setName(int[]) - можно поставлять массивы
        //      }

        void setNameAndAge(String username, int userage) { // метод setName
            name = username;
            age = userage;
        }

        int calculateYearsToRetirement(){
            int years = 65-age;
            return years;
        }

        void speak(){ // метод speak
            for (int i = 0; i < 3; i++) {
                System.out.println("Меня зовут "+ name + ", мне " + age + " лет");
            }
        }
        void sayHello(){
            System.out.println("Привет!");
        }
    }

