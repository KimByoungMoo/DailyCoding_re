package src.ditest;


import java.util.List;

public class Order {
    public static void main(String[] args) {

        MenuService menuService = new MenuService();
        MenuController controller = new MenuController(menuService);
        List<Menu> list = controller.getMenus();



    }
}

