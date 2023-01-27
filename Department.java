import java.util.ArrayList;

public class Department {
    public String departmentName;
    public ArrayList<Persona> personaInDept;

    public Department (String dn){
        this.departmentName = dn;
        this.personaInDept = new ArrayList<>();
    }



    public void addPeople(Persona p){
        this.personaInDept.add(p);
    }

    public String getDepName(){
        return this.departmentName;
    }
}
