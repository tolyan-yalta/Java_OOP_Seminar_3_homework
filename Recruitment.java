import java.util.Scanner;

public class Recruitment {

    public void setRecruitment(Department dep1, Department dep2){
        Persona p = AddCandidate();

        System.out.println("В какой отдел Вы хотите устроиться?");
        System.out.println("Если Вы передумали - 0; если в бухгалтерию - 1; если преподавателем -2");
        String option = (new Scanner(System.in)).nextLine();
        switch (option) {
            case "0":
                System.out.println("Как надумаете приходите");
                break;
            case "1":
                p.setDepartment(dep1.getDepName());
                dep1.addPeople(p);
                break;
            case "2":
                p.setDepartment(dep2.getDepName());
                dep2.addPeople(p);
                break;
        }

    }

    public Persona AddCandidate(){
        String fio;
        int age;
        String department;
        System.out.println("ФИО работника: ");
        fio = (new Scanner(System.in)).nextLine();
        System.out.println("Возраст работника: ");
        age = (new Scanner(System.in)).nextInt();
        department = "кандидат";
        Persona persona =  new Persona(fio, age, department);
        return persona;
    }
    
}
