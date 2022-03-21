import java.util.Scanner;
import java.lang.*;

public class Fio {
    private String name;
    private String surname;
    private String patronymic;
    public void init(String name,String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nВведите имя: ");
        name = sc.nextLine();
        System.out.printf("\nВведите фамилию: ");
        surname = sc.nextLine();
        System.out.printf("\nВведите отчество: ");
        patronymic = sc.nextLine();
    }
    public void print() {
        System.out.printf("%d %d %d", this.name, this.surname, this.patronymic);
    }
}
