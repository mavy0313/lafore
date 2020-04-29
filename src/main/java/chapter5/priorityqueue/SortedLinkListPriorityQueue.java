package chapter5.priorityqueue;

class SortedLinkListPriorityQueue {

  private SortedLinkList sortedLinkList;

  public SortedLinkListPriorityQueue() {
    this.sortedLinkList = new SortedLinkList();
  }

  public boolean isEmpty() {
    return sortedLinkList.isEmpty();
  }

  public void insert(Long item) {
    sortedLinkList.insert(item);
  }

  public Long remove() {
    return sortedLinkList.remove();
  }
}
