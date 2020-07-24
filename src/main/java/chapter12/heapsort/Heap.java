package chapter12.heapsort;

class Heap {
  private Node[] heapArray;
  private int maxSize; // Размер массива
  private int currentSize;
  // -------------------------------------------------------------
  public Heap(int mx)
  {
    maxSize = mx;
    currentSize = 0;
    heapArray = new Node[maxSize];
  }
  // -------------------------------------------------------------
  public Node remove()
  {
    Node root = heapArray[0];
    heapArray[0] = heapArray[--currentSize];
    trickleDown(0);
    return root;
  }

  public void trickleDown(int index)
  {
    int largerChild;
    Node top = heapArray[index]; // Сохранение корня
    while(index < currentSize/2) // до нижнего уровня
    {
      int leftChild = 2*index+1;
      int rightChild = leftChild+1;
// Определение большего потомка
      if(rightChild < currentSize && // (Правый потомок существует?)
          heapArray[leftChild].getKey() <
              heapArray[rightChild].getKey())
        largerChild = rightChild;
      else
        largerChild = leftChild;
// top >= largerChild?
      if(top.getKey() >= heapArray[largerChild].getKey())
        break;
// Потомок сдвигается вверх
      heapArray[index] = heapArray[largerChild];
      index = largerChild; // Переход вниз
    }
    heapArray[index] = top; // index <- корень
  }

  public void displayHeap()
  {
    int nBlanks = 32;
    int itemsPerRow = 1;
    int column = 0;
    int j = 0; // Текущий элемент
    String dots = "...............................";
    System.out.println(dots+dots); // Верхний пунктир
    while(currentSize > 0) // Для каждого элемента пирамиды
    {
      if(column == 0) // Первый элемент в строке?
        for(int k=0; k<nBlanks; k++) // Предшествующие пробелы
          System.out.print(' ');
// Вывод элемента
      System.out.print(heapArray[j].getKey());
      if(++j == currentSize) // Вывод завершен?
        break;
      if(++column==itemsPerRow) // Конец строки?
      {
        nBlanks /= 2; // Половина пробелов
        itemsPerRow *= 2; // Вдвое больше элементов
        column = 0; // Начать заново
        System.out.println(); // Переход на новую строку
      }
      else // Следующий элемент в строке
        for(int k=0; k<nBlanks*2-2; k++)
          System.out.print(' '); // Внутренние пробелы
    }
    System.out.println("\n"+dots+dots); // Нижний пунктир
  }

  public void displayArray()
  {
    for(int j=0; j<maxSize; j++)
      System.out.print(heapArray[j].getKey() + " ");
    System.out.println("");
  }
  // -------------------------------------------------------------
  public void insertAt(int index, Node newNode)
  { heapArray[index] = newNode; }
  // -------------------------------------------------------------
  public void incrementSize()
  { currentSize++; }
}
