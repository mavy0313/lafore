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
  }

  public void delete(int id)
  {
  }
}
