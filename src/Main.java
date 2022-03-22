public class Main {
    public static void main(String[] args){
        Owner alisher = new Owner();
        Fio fio = new Fio();
        fio.init("a","b", "c");
        alisher.init(fio, 0,0);
        alisher.enter();
        alisher.print();
    }
}
