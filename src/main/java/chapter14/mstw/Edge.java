package chapter14.mstw;

public class Edge {
  public int srcVert; // Индекс начальной вершины ребра
  public int destVert; // Индекс конечной вершины ребра
  public int distance; // Расстояние от начала до конца
  // -------------------------------------------------------------
  public Edge(int sv, int dv, int d) // Конструктор
  {
    srcVert = sv;
    destVert = dv;
    distance = d;
  }
// -------------------------------------------------------------
} // Конец класса Edge
////////////////////////////////////////////////////////////////
