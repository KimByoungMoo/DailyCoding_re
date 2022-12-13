package src.ditest;

import java.util.List;

public class MenuService {

    public List<Menu> getMenuList() {
        return List.of (
                new Menu(1, "아메리카노", 2000),
                new Menu(2, "카페모카", 3500),
                new Menu(3, "바닐라 라떼", 3000)
        );
    }
}
