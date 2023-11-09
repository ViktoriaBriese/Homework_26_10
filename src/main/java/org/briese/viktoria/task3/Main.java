package org.briese.viktoria.task3;

import org.briese.viktoria.task3.Subject.Biology;
import org.briese.viktoria.task3.Subject.Literature;
import org.briese.viktoria.task3.Subject.Mathematics;

public class Main {
    /*Создайте иерархию учебных предметов (Subject -> Natural sciences/exact sciences/humanities ->
    Biology, Chemistry / Physics, Mathematics / Literature, Philology).
    Напишите класс Student, параметризируемый предметом.
    Создайте классы студентов по каждому из направлений (Natural sciences/exact sciences/humanities),
    укажите в наследуемом параметре конкретный тип направления.*/

    public static void main(String[] args) {
        NaturalSciencesStudent bioStudent = new NaturalSciencesStudent("John", new Biology());
        ExactSciencesStudent mathStudent = new ExactSciencesStudent("Alice", new Mathematics());
        HumanitiesStudent litStudent = new HumanitiesStudent("Bob", new Literature());

        System.out.println(bioStudent);
        System.out.println(mathStudent);
        System.out.println(litStudent);
    }
}
