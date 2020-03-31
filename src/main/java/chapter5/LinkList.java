package chapter5;

public class LinkList {
  private Link first;            // Ссылка на первый элемент списка
  // -------------------------------------------------------------
  public void LinkList() {         // Конструктор
    first = null;               // Список пока не содержит элементов
  }
  // -------------------------------------------------------------
  public boolean isEmpty() {       // true, если список пуст
    return (first==null);
  }
  // -------------------------------------------------------------
  public void insertFirst(int id, double dd) {
    Link newLink = new Link(id, dd);
    newLink.next = first;
    first = newLink;
  }

  public Link deleteFirst() {
    Link temp = first;
    first = first.next;
    return temp;
  }
  public void displayList() {
    System.out.print("List (first-->last): ");
    Link current = first;       // От начала списка
    while (current != null) {      // Перемещение до конца списка
      current.displayLink();   // Вывод данных
      current = current.next;  // Переход к следующему элементу
    }
    System.out.println("");
  }
}
