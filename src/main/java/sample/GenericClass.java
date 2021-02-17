package sample;
class MyGen<T>{
    T obj;
    void add(T obj){
    this.obj=obj;}
    T get(){
    return obj;}
}
public class GenericClass {
    public static void main(String args[]) {
        MyGen<Integer> m = new MyGen<Integer>();
        for(int i=0;i<5;i++) {
            m.add(i);
            System.out.println(m.get());
        }
    }
}
