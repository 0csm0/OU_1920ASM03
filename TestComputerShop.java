public class TestComputerShop {

  public static void main(String[] args) {
    ComputerShop aShop = new ComputerShop();
    Router newRouter1 = new Router("Linksys", "RVS4000", 1080.0);
    Router newRouter2 = new Router("Planet", "VRT-311s", 510.0);
    aShop.addRouter(newRouter1);
    aShop.addRouter(newRouter2);
    aShop.showRouter();
    System.out.println(aShop.modelNumberSet());
    System.out.println(aShop.priceList());
  }

}