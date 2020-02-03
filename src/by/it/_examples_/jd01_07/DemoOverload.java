package by.it._examples_.jd01_07;
public class DemoOverload {
    public static void printArgCount(Object... args)    {
        System.out.println("Object args: " + args.length);}
    public static void printArgCount(Integer[ ]...args) {
        System.out.println("Integer[ ] args: " + args.length);}
    public static void printArgCount(int[]... args) { System.out.print("int args: " + args.length);}
    public static void main(String[ ] args) {
        Integer[] i = { 1, 2, 3, 4, 5 };
        int [] j={5,6,7};
        printArgCount(7, "No", true, null); //будет вызван метод 1, разные объекты
        printArgCount(i, i, i); //будет вызван метод 2, набор массивов
        printArgCount(i, 4, 71); //будет вызван метод 1, разные объекты
        //printArgCount(i);           // хоть без приведения, хоть с явным приведением (чтобы было ясно какой тут тип)
        printArgCount((Object) i);    // будет вызван метод 1, т.к. имя массива это Object, а не Object[] (как в методе 2).
        printArgCount(j,j); //будет вызван метод 3, т.к. int ближе к сигнатуре чем Integer
        // printArgCount(); // это невозможно, неопределенность при перегрузке!
    }
}