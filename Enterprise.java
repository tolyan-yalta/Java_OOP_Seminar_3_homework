import java.util.ArrayList;

public class Enterprise {
    public String enterpriseName;
    public ArrayList<Department> listDepartment;

    public Enterprise(String n){
        this.enterpriseName = n;
        this.listDepartment = new ArrayList<>();
    }

    public void AddDepartment(Department department){
        this.listDepartment.add(department);
    }

    public void PrintWorker(){
        for (Department department : listDepartment) {
            System.out.printf("%s. Список сотрудников:\n", department.getDepName());
            //Department d = new Department(null)
            for (Persona p : department.personaInDept) {
                System.out.println(p.getInfo());
            }
        }
        System.out.println("----------------------------");
    }

    public void ClearList(Enterprise e){
        e.listDepartment.clear();

    }


    
}