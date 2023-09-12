package java_generics.generics_class;
class KeyValuePair<K,V>{
    private K key;
    private V value;
    public KeyValuePair(){

    }
    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }
    public V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }
    public void print(){
        System.out.println("Name: " + key + " - ID: " + value);
    }
}
class ContactEntry extends KeyValuePair<String, Integer>{
    public ContactEntry(String key, Integer value){
        super(key,value);
    }
//    public void print(){
//        System.out.println("Class son");
//    }

}
class ContactEntry2<V> extends KeyValuePair<String, V>{
    public ContactEntry2(String key , V value){
        super(key, value);
    }
}

class ContactEntry3<K , V> extends KeyValuePair<K,V>{
    public ContactEntry3(K key , V value){
        super(key, value);
    }

}

class ContactEntry4<K , V , T> extends KeyValuePair<K , V>{
    private T obj;
    public ContactEntry4(K key , V value, T obj){
        super(key, value);
        this.obj = obj;
    }
    public T getObj(){
        return obj;
    }
    public void setObj(T obj){
        this.obj = obj;
    }
    public void print(){
        System.out.println("Name: " + getKey() + " - ID: " + getObj() + " - GPA: " + obj);

    }
}
public class Main {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> entry = new KeyValuePair<>();
        entry.setKey("Manhh");
        entry.setValue(1000);
        System.out.println("Name: " + entry.getKey() + " - ID: " + entry.getValue());


        //Generics Class with inheritance
        ContactEntry entry1 = new ContactEntry("Nobi",001);
        entry1.print();

        ContactEntry2<String> entry2 = new ContactEntry2<>("Mah","001");
        entry2.print();

        ContactEntry3<Double,Double> entry3 = new ContactEntry3<>(12.5,16.5);
        entry3.print();

        ContactEntry4<String, String, Double> entry4 = new ContactEntry4<>("004","Bee",3.4);
        entry4.print();
    }

}
