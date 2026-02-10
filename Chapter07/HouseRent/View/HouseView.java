package Chapter07.HouseRent.View;

import Chapter07.HouseRent.Service.HouseService;
import Chapter07.HouseRent.Utilities.Utility;
import Chapter07.HouseRent.Domain.House;

public class HouseView {

  private boolean loop = true; // 控制显示菜单
  private char key = ' '; // 接收用户输入
  private HouseService houseService = new HouseService(10); // 这里我们最多存放10个房屋信息

  public void updateHouse() {
    System.out.println("修改房屋");
    System.out.print("请输入要修改的房屋id: ");
    int id = Utility.readInt();
    House house = houseService.find(id);
    if (house != null) {
      System.out.print("姓名(" + house.getName() + "): ");
      String name = Utility.readString(8);
      if (!name.equals("")) {
        house.setName(name);
      }
      System.out.print("电话(" + house.getPhone() + "): ");
      String phone = Utility.readString(12);
      if (!phone.equals("")) {
        house.setPhone(phone);
      }
      System.out.print("地址(" + house.getAddress() + "): ");
      String address = Utility.readString(16);
      if (!address.equals("")) {
        house.setAddress(address);
      }
      System.out.print("月租(" + house.getRent() + "): ");
      String rentStr = Utility.readString(10);
      if (!rentStr.equals("")) {
        int rent = Integer.parseInt(rentStr);
        house.setRent(rent);
      }
      System.out.println("修改房屋信息成功");
    } else {
      System.out.println("没有找到房屋信息");
    }
  }

  public void findHouse() {
    System.out.println("查找房屋");
    System.out.print("请输入要查找的房屋id: ");
    int id = Utility.readInt();
    House house = houseService.find(id);
    if (house != null) {
      System.out.println("找到房屋信息:");
      System.out.println(house);
    } else {
      System.out.println("没有找到房屋信息");
    }
  }

  public void deleteHouse() {
    System.out.println("删除房屋");
    System.out.print("请输入要删除的房屋id: ");
    int id = Utility.readInt();
    if (houseService.delete(id)) {
      System.out.println("删除房屋成功");
    } else {
      System.out.println("删除房屋失败");
    }
  }

  public void addHouse() {
    System.out.println("添加房屋");
    System.out.print("请输入id: ");
    int id = Utility.readInt();
    System.out.print("姓名: ");
    String name = Utility.readString(8);
    System.out.print("电话: ");
    String phone = Utility.readString(12);
    System.out.print("地址: ");
    String address = Utility.readString(16);
    System.out.print("月租: ");
    int rent = Utility.readInt();

    // 创建一个新的House对象, 注意id是唯一的
    House newHouse = new House(id, name, phone, address, rent, "未出租");
    
    if (houseService.add(newHouse)) {
      System.out.println("添加房屋成功");
    } else {
      System.out.println("添加房屋失败");
    }
  }

  public void listHouse() {
    System.out.println("显示房屋列表");
    System.out.println("ID\t房主\t电话\t地址\t月租\t状态(未出租/已出租)");
    House[] houses = houseService.list();
    for (int i = 0; i < houses.length; i++) {
      if (houses[i] != null) {
        System.out.println(houses[i]);
      }
    }
  }

  public void mainMenu() {
    do{
      System.out.println("==========房屋出租系统==========");
      System.out.println("\t\t1 新 增 房 源");
      System.out.println("\t\t2 查 找 房 源");
      System.out.println("\t\t3 删 除 房 源");
      System.out.println("\t\t4 修 改 房 源");
      System.out.println("\t\t5 房 屋 列 表");
      System.out.println("\t\t6 退 出 系 统");
      System.out.print("请输入你的选择(1-6): ");
      key = Utility.readChar();
      switch (key) {
        case '1':
          addHouse();
          break;
        case '2':
          findHouse();
          break;
        case '3':
          deleteHouse();
          break;
        case '4':
          updateHouse();
          break;
        case '5':
          listHouse();
          break;
        case '6':
          char c = Utility.confirmSelection();
          if (c == 'Y') {
            loop = false;
          } else {
            System.out.println("取消退出");
          }
          break;
        default:
          System.out.println("输入有误，请重新输入");
      }
    }while (loop);
  }
}
