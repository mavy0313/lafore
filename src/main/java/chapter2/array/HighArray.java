package chapter2.array;

public class HighArray {
  private long[] a; // Ссылка на массив a
  private int nElems; // Количество элементов в массиве
  //-----------------------------------------------------------
  public HighArray(int max) // Конструктор
  {
    a = new long[max]; // Создание массива
    nElems = 0; // Пока нет ни одного элемента
  }
//-----------------------------------------------------------
public boolean find(long searchKey)
{ // Поиск заданного значения
  int j;
  for(j=0; j<nElems; j++) // Для каждого элемента
    if(a[j] == searchKey) // Значение найдено?
      break; // Да - выход из цикла
  if(j == nElems) // Достигнут последний элемент?
    return false; // Да
  else
    return true; // Нет
}
  //-----------------------------------------------------------
  public void insert(long value) // Вставка элемента в массив
  {
    a[nElems] = value; // Собственно вставка
    nElems++; // Увеличение размера
  }
  //-----------------------------------------------------------
  public boolean delete(long value)
  {
    int j;
    for(j=0; j<nElems; j++) // Поиск заданного значения
      if( value == a[j] )
        break;
    if(j==nElems) // Найти не удалось
      return false;
    else // Значение найдено
    {
      for(int k=j; k<nElems; k++) // Сдвиг последующих элементов
        a[k] = a[k+1];
      nElems--; // Уменьшение размера
      return true;
    }
  }
//-----------------------------------------------------------
public void display() // Вывод содержимого массива
{
  for(int j=0; j<nElems; j++) // Для каждого элемента
    System.out.print(a[j] + " "); // Вывод
  System.out.println("");
}
//-----------------------------------------------------------

  public long getMax() {
    if (nElems == 0) {
      return -1;
    }
    long max = a[0];
    for (int i = 1; i < nElems; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }

  public long removeMax() {
    int i;
    int maxIndex = 0;
    if (nElems == 0) {
      return -1;
    }
    long max = a[0];
    for (i = 1; i < nElems; i++) {
      if (a[i] > max) {
        max = a[i];
        maxIndex = i;
      }
    }
//    delete(max);
    for (int k = maxIndex; k < nElems - 1; k++) // Сдвиг последующих элементов
      a[k] = a[k+1];
    nElems--; // Уменьшение размера
    return max;
  }
}
