package chapter2.array;

public class HighArrayApp {
  public static void main(String[] args) {
    int maxSize = 100;
    HighArray arr; // Ссылка на массив
    arr = new HighArray(maxSize); // Создание массива
    arr.insert(77); // Вставка 10 элементов
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);
    arr.display(); // Вывод элементов

    System.out.println("Max:" + arr.getMax());

    int searchKey = 35; // Поиск элемента
    if( arr.find(searchKey) )
      System.out.println("Found " + searchKey);
    else
      System.out.println("Can't find " + searchKey);
    arr.delete(00); // Удаление трех элементов
    arr.delete(55);
    arr.delete(99);
    arr.display(); // Повторный вывод

    HighArray highArray2 = new HighArray(5);
    System.out.println(highArray2.getMax());
    highArray2.insert(1);
    highArray2.insert(2);
    highArray2.insert(3);
    System.out.println(highArray2.getMax());

    int size = 6;
    HighArray array3 = new HighArray(size);
    array3.insert(3);
    array3.insert(2);
    array3.insert(1);
    array3.insert(25);
    array3.insert(40);
    array3.insert(15);
    long[] sorted = new long[size];

    for (int i = size - 1; i >= 0; i--) {
      sorted[i] = array3.removeMax();
    }

    System.out.println("Sorted:");
    for (int i = 0; i < size; i++) {
      System.out.print(sorted[i] + " "); // Вывод
    }
      System.out.println("");
  }
}
