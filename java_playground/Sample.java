
public class Sample {

    public static void main(String[] args) {
        Controller controller = new Controller(new MM());
        controller.print();
    }
}

interface IService {

    String message();
}

class Controller {

    private MessageService service;


    public Controller(MessageService service) {
        this.service = service;
    }

    public void print() {
        System.out.println(service.message());
    }
}

class MessageService implements IService {

    public String message() {
        return "Hello World!";
    }
}

class MM implements IService{
    public String message(){
        return "이렇게는?";
    }
}
