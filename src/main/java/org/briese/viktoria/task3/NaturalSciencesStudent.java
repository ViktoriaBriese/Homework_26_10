package org.briese.viktoria.task3;

import org.briese.viktoria.task3.Subject.ExactSciences;
import org.briese.viktoria.task3.Subject.Humanities;
import org.briese.viktoria.task3.Subject.NaturalSciences;
import org.briese.viktoria.task3.student.Student;

public class NaturalSciencesStudent extends Student<NaturalSciences> {
    public NaturalSciencesStudent(String name, NaturalSciences major) {
        super(name, major);
    }
}

class ExactSciencesStudent extends Student<ExactSciences> {
    public ExactSciencesStudent(String name, ExactSciences major) {
        super(name, major);
    }
}

class HumanitiesStudent extends Student<Humanities> {
    public HumanitiesStudent(String name, Humanities major) {
        super(name, major);
    }
}