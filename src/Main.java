public class Main {
    public static void main(String[] args) {
        ArrayClass obj=new ArrayClass(7);
        obj.insert(78);
        obj.insert(56654);
        obj.insert(5621);
        obj.insert(568868);
        obj.insert(56218);
        obj.insert(56321);
        obj.insert(56789);
        //obj.insert(56);
        obj.display();
        obj.shellShort();
        obj.display();
    }
}
