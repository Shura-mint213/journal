package models;

public class PersonModel extends DbObjectModal {
    private String name;

    private String surname;

    private String patronymic;

    private int age;

    PersonModel(long id, String name, String surname, String patronymic, int age) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }
}
