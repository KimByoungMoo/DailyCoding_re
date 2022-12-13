package src.ditest;

import java.util.List;

public class MenuController {
    private MenuService menuService;

    public MenuController (MenuService menuService) {
        this.menuService = menuService;
    }

    public List<Menu> getMenus() {
        return menuService.getMenuList();
    }
}
