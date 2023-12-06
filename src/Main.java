// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //多态的向上转型--直接赋值-方法传参-方法返回
        Animal cc=new Bird(new String("cc"));

        //多态的动态绑定----与new的对象相绑定

        Animal lucky=new Animal(new String("lucky"));
        lucky.eat("甜甜圈");
        System.out.println(lucky.getname());//方法返回


        Animal Tom=new Bird(new String("Tom"));
        Tom.eat("lucky");
        System.out.println(Tom.getname());
        Tom.dodo(Tom.name);//方法传参

    }
}
