package chapter8;

class Node {
  int iData; // Данные, используемые в качестве ключа
  double dData; // Другие данные
  Node leftChild; // Левый потомок узла
  Node rightChild; // Правый потомок узла
  public void displayNode()
  {
    System.out.print('{');
    System.out.print(iData);
    System.out.print(", ");
    System.out.print(dData);
    System.out.print("} ");
  }
}
