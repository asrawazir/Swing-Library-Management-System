package Code;

public class Person {

    private String id;
    private String name;

    public Person(){
        id = "null";
        name = "none";
    }

    public Person(String i, String n){
        id = i;
        name = n;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
