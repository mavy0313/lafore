package chapter8;

class Tree {
  private Node root; // Единственное поле данных

  public Node find(int key)
  {
    Node current = root; // Начать с корневого узла
    while(current.iData != key) // Пока не найдено совпадение
    {
      if(key < current.iData) // Двигаться налево?
        current = current.leftChild;
      else
        current = current.rightChild; // Или направо?
      if(current == null) // Если потомка нет,
        return null; // поиск завершился неудачей
    }
    return current;
  }

  public void insert(int id, double dd)
  {
    Node newNode = new Node(); // Создание нового узла
    newNode.iData = id; // Вставка данных
    newNode.fData = dd;
    if(root==null) // Корневой узел не существует
      root = newNode;
    else // Корневой узел занят
    {
      Node current = root; // Начать с корневого узла
      Node parent;
      while(true) // (Внутренний выход из цикла)
      {
        parent = current;
        if(id < current.iData) // Двигаться налево?
        {
          current = current.leftChild;
          if(current == null) // Если достигнут конец цепочки
          { // вставить слева
            parent.leftChild = newNode;
            return;
          }
        }
        else // Или направо?
        {
          current = current.rightChild;
          if(current == null) // Если достигнут конец цепочки,
          { // вставить справа
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  public void delete(int id)
  {
  }

  private void inOrder(Node localRoot)
  {
    if(localRoot != null)
    {
      inOrder(localRoot.leftChild);
      System.out.print(localRoot.iData + " ");
      inOrder(localRoot.rightChild);
    }
  }
}
