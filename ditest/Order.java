package src.ditest;


import java.util.List;

public class Order {
    public static void main(String[] args) {

        MenuService menuService = new TeaService() {
            @Override
            public List<Menu> getMenuList() {
                return null;
            }
        };
        MenuController controller = new MenuController(menuService);
        List<Menu> list = controller.getMenus();

        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i).getId()+" / "+list.get(i).getName() + " / " + list.get(i).getPrice() + "원");
        }

    }
}

