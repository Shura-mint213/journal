package interfaces;

/** Interface for data validation */
public interface DataChecking {

    public Boolean intValidation(String number);

    public Boolean fioValidation(String fio);

    public Boolean ageValidation(String age);
}
