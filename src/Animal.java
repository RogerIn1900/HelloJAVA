public class Animal {
    String name=new String();

    public Animal(String name){
        this.name=name;
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public String getname(){
        return this.name;
    }

    public void dodo(String name){
        System.out.println("dodo"+name);
    }
}
