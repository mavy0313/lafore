package chapter5.priorityqueue;

public class SortedLinkList {

  private Link first;

  public SortedLinkList() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insert(Long item) {
    Link newLink = new Link(item);
    Link previous = null;
    Link current = first;
    while (current != null && item > current.data) {
      previous = current;
      current = current.next;
    }
    if (previous == null) {
      first = newLink;
    } else {
      previous.next = newLink;
    }
    newLink.next = current;
  }

  public Long remove() {
    Long temp = first.data;
    first = first.next;
    return temp;
  }
}
