import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

class ComputerShop {
  Map<String, Router> routerMap = new HashMap<String, Router>();

  public void addRouter(Router oneRouter) {
    routerMap.put(oneRouter.getBrand() + ": " + oneRouter.getModelNumber(), oneRouter);
  }

  public void showRouter() {
    routerMap.forEach((key, value) -> System.out.println(routerMap.get(key).toString()));
  }

  public Set<String> modelNumberSet() {
    Set<String> modelNumberSet = new HashSet<String>();
    for (Router router : routerMap.values()) {
      modelNumberSet.add(router.getModelNumber());
    }
    return modelNumberSet;
  }

  public List<String> priceList() {
    List<String> priceList = new ArrayList<String>();
    for (Router router : routerMap.values()) {
      priceList.add(Double.toString(router.getPrice()));
    }
    return priceList;
  }
}
