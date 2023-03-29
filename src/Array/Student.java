package Array;

public class Student {
    private  int id;
    private  String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id){
        this.id =id;
    }

    public int getId(int id){
        return  id;
    }

    public void setName(String name){
        this.name =name;
    }
    public String getName(String name){
        return name;
    }
}
