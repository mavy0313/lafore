package chapter13.bfs;

class Vertex {
  public char label; // метка (например, 'A')
  public boolean wasVisited;
  // ------------------------------------------------------------
  public Vertex(char lab) // Конструктор
  {
    label = lab;
    wasVisited = false;
  }
}
