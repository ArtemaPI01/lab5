public class Main {
    public static void main(String[] args){
        Fio fio = new Fio();
        fio.init("a","b", "c");
        Owner alisher = new Owner();
        alisher.init(fio, 0,0);
        alisher.enter();
        alisher.print();
        Shop ashan = new Shop();
        ashan.enter();
        ashan.print();
        ashan.cloak();
        
    }
}
