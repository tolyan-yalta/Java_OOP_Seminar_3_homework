public class Program {
    public static void main(String[] args){
        // Создаем предприятие
        Enterprise gb = new Enterprise("GB");
        // Создаем отдел и добавляем его в список отделов
        Department acc = new Department("Бухгалтерия");
        gb.AddDepartment(acc);
        Department teach = new Department("Преподаватели");
        gb.AddDepartment(teach);
        // Первоначальное добавление кандидатов в отделы
        Recruitment rec = new Recruitment();
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);

        // Вывод в консоль списков отделов
        gb.PrintWorker();

        // Перевод сотрудника из одного отдела в другой
        Transfer tr = new Transfer();
        tr.getTransfer(gb, acc, teach);

        // Вывод в консоль списков отделов
        gb.PrintWorker();
    }
    
}
