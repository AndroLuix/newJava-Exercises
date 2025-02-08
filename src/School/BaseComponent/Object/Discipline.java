package School.BaseComponent.Object;

public class Discipline {

    private String name;

    Discipline(String name){
        this.name = name;
    }

    public String getDiscipline(){
        return this.name;
    }

    public void setDiscipline(String name){
        this.name = name;
    }
}
