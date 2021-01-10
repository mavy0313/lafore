package chapter2.array.binary;

public class OrdArray {
  private long[] a; // Ссылка на массив a
  private int nElems; // Количество элементов данных
  //-----------------------------------------------------------
  public OrdArray(int max) // Конструктор
  {
    a = new long[max]; // Создание массива
    nElems = 0;
  }
  public int size()
  { return nElems; }
  //-----------------------------------------------------------
  public int find(long searchKey)
  {
    int lowerBound = 0;
    int upperBound = nElems-1;
    int curIn;
    while(true)
    {
      curIn = (lowerBound + upperBound ) / 2;
      if(a[curIn]==searchKey)
        return curIn; // Элемент найден
      else if(lowerBound > upperBound)
        return nElems; // Элемент не найден
      else // Деление диапазона
      {
        if(a[curIn] < searchKey)
          lowerBound = curIn + 1; // В верхней половине
        else
          upperBound = curIn - 1; // В нижней половине
      }
    }
  }
  //-----------------------------------------------------------
  public void insert(long value) // Вставка элемента в массив
  {
    int j = find(value);
    for(int k=nElems; k>j; k--) // Перемещение последующих элементов
      a[k] = a[k-1];
    a[j] = value; // Вставка
    nElems++; // Увеличение размера
  }

  public boolean delete(long value)
  {
    int j = find(value);
    if(j==nElems) // Найти не удалось
      return false;
    else // Элемент найден
    {
      for(int k=j; k<nElems; k++) // Перемещение последующих элементов
        a[k] = a[k+1];
      nElems--; // Уменьшение размера
      return true;
    }
  }
  //-----------------------------------------------------------
  public void display() // Вывод содержимого массива
  {
    for(int j=0; j<nElems; j++) // Перебор всех элементов
      System.out.print(a[j] + " "); // Вывод текущего элемента
    System.out.println();
  }

  public long[] merge(long[] array1, long[] array2) {
    long[] result = new long[array1.length + array2.length];

    int i = 0;
    int j = 0;

    for (int k = 0; k < result.length; k++) {
      if (i == array1.length) {
        //append 2 to 1
        result[k] = array2[j];
        j++;
        continue;
      }
      if (j == array2.length) {
        //append 1 to 2
        result[k] = array1[i];
        i++;
        continue;
      }
      if (array1[i] < array2[j]) {
        result[k] = array1[i];
        i++;
      } else {
        result[k] = array2[j];
        j++;
      }
    }

    return result;
  }
}
