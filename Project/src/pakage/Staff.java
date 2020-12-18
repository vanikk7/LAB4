package pakage;

/**
 * @author VS
 */
public class Staff {
    /**
     * Имя
     */
    private final String name;
    /**
     * ID
     */
    private final String id;
    /**
     * Дата рождения
     */
    private final String BirtDate;
    /**
     * Подразделение
     */
    private final Subdivision st;
    /**
     * ЗП
     */
    private final String salary;
    /**
     * Пол
     */
    private final String gender;

    /**
     * @param name     - Имя сотрудника
     * @param BirtDate _ День рождения сотрудниуа
     * @param nameTwo  - Имя подразделения
     * @param salary   - Заробатная плата
     * @param gender   - пол сотрудника
     */
    public Staff(String name, String BirtDate, String nameTwo, String salary, String gender) {
        this.BirtDate = BirtDate;
        this.id = Subdivision.generation();
        this.name = name;
        this.salary = salary;
        st = new Subdivision(nameTwo);
        this.gender = gender;
    }

    /**
     * @param mas - ввод с поомщью строк
     */
    public Staff(String[] mas) {
        this.id = mas[0];
        this.name = mas[1];
        this.gender = mas[2];
        this.BirtDate = mas[3];
        this.st = new Subdivision(mas[4]);
        this.salary = mas[5];
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", BirtDate='" + BirtDate + '\'' +
                ", st=" + st.toString() +
                ", salary='" + salary + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
