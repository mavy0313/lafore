package chapter5;

public class LinkListInfiniteApp {

  public static void main(String[] args) {
    LinkList theList = new LinkList();
    int totalCount = 0;
    int count = 0;
    while (true) {
      count++;
      theList.insertFirst(10, 2.99);
      if (count == 1000) {
        totalCount += count;
        count = 0;
        System.out.println(totalCount);
      }
    }
  }
}
