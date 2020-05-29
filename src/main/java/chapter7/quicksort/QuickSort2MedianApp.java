package chapter7.quicksort;

class QuickSort2MedianApp {

  public static void main(String[] args)
  {
    int maxSize = 6;             // Размер массива
    ArrayInsMedian arr;                 // Ссылка на массив
    arr = new ArrayInsMedian(maxSize);  // Создание массива
    for(int j=0; j<maxSize; j++)  // Заполнение массива
    {                          // случайными числами
      long n = (int)(java.lang.Math.random()*99);
      arr.insert(n);
    }
    arr.display();                // Вывод элементов
    arr.quickSort();              // Быстрая сортировка
    arr.display();                // Повторный вывод
  }
}
