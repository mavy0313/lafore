package chapter5.iterator;

class Link {
  public long dData;              // Данные
  public Link next;              // Следующий элемент в списке
  // -------------------------------------------------------------
  public Link(long dd) { // Конструктор
    dData = dd;               // Инициализация данных (‘next’ автоматически
  }                           // присваивается null)
  // -------------------------------------------------------------
  public void displayLink() {      // Вывод содержимого элемента
    System.out.print("{" + dData + "} ");
  }
}
