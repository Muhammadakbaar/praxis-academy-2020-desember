package latihan.dua;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();        
    }
}