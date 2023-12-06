public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void eat(String food){
        System.out.println("小鸟"+name+"正在吃"+food);
    }

    //方法重写
    @Override
    public String getname(){
        return "小鸟"+this.name;
    }
}
