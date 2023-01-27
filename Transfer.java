import java.util.Scanner;
import java.util.ArrayList;

public class Transfer {
    public void getTransfer(Enterprise e, Department d1, Department d2){
        System.out.println("Введите ФИО сотрудника:");
        Scanner scan = new Scanner(System.in);
        String fio = scan.nextLine();
        if (Consenting()) {
            for (Persona p : d1.personaInDept) {
                if (fio.equals(p.getFIO())){
                    Persona temp = p;
                    int index = d1.personaInDept.indexOf(p);
                    d1.personaInDept.remove(index);
                    temp.setDepartment(d2.getDepName());
                    d2.personaInDept.add(temp);
                    e.ClearList(e);
                    e.listDepartment.add(d1);
                    e.listDepartment.add(d2);
                    fio = "";
                    break;
                }
            }
            for (Persona p : d2.personaInDept) {
                if (fio.equals(p.getFIO())){
                    Persona temp = p;
                    int index = d2.personaInDept.indexOf(p);
                    d2.personaInDept.remove(index);
                    temp.setDepartment(d1.getDepName());
                    d1.personaInDept.add(temp);
                    e.ClearList(e);
                    e.listDepartment.add(d1);
                    e.listDepartment.add(d2);
                    break;
                }
            }
        }
    }

    public boolean Consenting(){
        System.out.println("Хотите перейти в другой отдел?");
        //Scanner scan = ;
        System.out.println("0 - НЕТ;   1 - ДА");
        int choice = (new Scanner(System.in)).nextInt();
        return choice != 0;
    }
}
