package chapter5.priorityqueue;

public class LinkList {

  private Link first;

  public LinkList() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insert(Long item) {
    Link newLink = new Link(item);
    first = newLink;
  }
}
