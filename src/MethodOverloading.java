public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Andrey");
        sayHello("Andrey", 17);
    }

    static void sayHello(){
        System.out.println("Hello tanpa param");
    }
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    static void sayHello(String name, int age){
        System.out.println("Hello "+name+ ", umur kamu "+age);
    }

}
