package chapter5.insertionSort;

public class Link {

  public double dData;           // Данные
  public Link next;              // Следующий элемент в списке
  // -------------------------------------------------------------
  public Link(double dd) { // Конструктор
    dData = dd;                 // Инициализация данных (‘next’ автоматически присваивается null)
  }
  // -------------------------------------------------------------
  public void displayLink() {      // Вывод содержимого элемента
    System.out.print("{" + dData + "} ");
  }
}
