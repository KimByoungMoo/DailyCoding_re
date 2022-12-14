package src.ditest;

import java.util.List;

public class TeaService implements MenuService{

    @Override
    public List<Menu> getMenuList() {
        return List.of (
                new Menu(1, "아이스티", 2000),
                new Menu(2, "그린티라떼", 3500),
                new Menu(3, "초콜릿라떼", 3500)
        );
    }
}
