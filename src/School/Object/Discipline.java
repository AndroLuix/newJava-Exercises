package School.Object;

import School.Exception.NotFoundException;
import School.Human.Teacher;

public class Discipline {

    private String name;
    protected Teacher teacher;

    Discipline( String name, Teacher tch){
        this.teacher = tch;
        this.name = name;
    }
    Discipline(String name){
        this.name = name;
        this.teacher = null;
    }

    public String getDataTeacher() throws NotFoundException {
        if (this.teacher != null) {
            return this.teacher.get(); // Assicurati che 'get()' non lanci un errore se teacher è null
        } else throw new NotFoundException("Teacher not assigned!"); // Messaggio di fallback se l'insegnante è null
    }

    public String getDiscipline(){
        return this.name;
    }
}
