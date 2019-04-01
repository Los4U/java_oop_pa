import controller.ManagerController;
import view.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("oop pa");

        ManagerController managerController =  new ManagerController();

        View view =  new View();
        view.printWelcomeMenu();

    }
}
