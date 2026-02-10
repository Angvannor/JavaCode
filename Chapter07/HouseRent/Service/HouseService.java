package Chapter07.HouseRent.Service;

import Chapter07.HouseRent.Domain.House;

public class HouseService {
  private House[] houses; // 存放House对象
  private int houseNum = 1; // 记录当前房屋数量
  private int idCounter = 1; // 记录当前id的值

  public HouseService(int size) {
    houses = new House[size];
    // test
    houses[0] = new House(1, "jack", "123456", "海淀区", 2000, "未出租");
  }

  public House[] list() {
    return houses;
  }

  public House find(int id) {
    for (int i = 0; i < houseNum; i++) {
      if (houses[i].getId() == id) {
        return houses[i];
      }
    }
    return null; // 没有找到
  }

  public boolean delete(int id) {
    int index = -1; // 记录要删除的房屋在数组中的位置
    // 删除房屋信息
    for (int i = 0; i < houses.length; i++) {
      if (houses[i] != null && houses[i].getId() == id) {
        index = i;
      } 
    }

    if (index == -1) {
      return false; // 没有找到要删除的房屋
    } else {
      // 将要删除的房屋后面的房屋向前移动一位
      for (int i = index; i < houseNum - 1; i++) {
        houses[i] = houses[i + 1];
      }
      houses[houseNum - 1] = null; // 最后一个位置置空
      houseNum--; // 房屋数量减1
      return true;
    }
  }

  public boolean add(House newHouse) {
    // 判断是否还有位置
    for (int i = 0; i < houses.length; i++) {
      if (houses[i] == null && houseNum < houses.length) {
        houses[i] = newHouse;
        houseNum++; // 增加房屋数量
        idCounter++; // 增加id的值
        return true;
      } else if (houseNum >= houses.length) {
        System.out.println("房屋已满，无法添加");
        return false;
      } 
    }
    return false;
  }
}
