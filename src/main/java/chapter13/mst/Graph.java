package chapter13.mst;

class Graph {
  private final int MAX_VERTS = 20;
  private Vertex vertexList[]; // Массив вершин
  private int adjMat[][]; // Матрица смежности
  private int nVerts; // Текущее количество вершин
  private StackX theStack;
// -------------------------------------------------------------
public Graph() // Конструктор
  {
    vertexList = new Vertex[MAX_VERTS];
// Матрица смежности
    adjMat = new int[MAX_VERTS][MAX_VERTS];
    nVerts = 0;
    for(int j=0; j<MAX_VERTS; j++) { // Матрица смежности
      for (int k = 0; k < MAX_VERTS; k++) { // заполняется нулями
        adjMat[j][k] = 0;
      }
    }
    theStack = new StackX();
  }
// -------------------------------------------------------------
  public void addVertex(char lab) // В аргументе передается метка
  {
    vertexList[nVerts++] = new Vertex(lab);
  }
// -------------------------------------------------------------
  public void addEdge(int start, int end)
  {
    adjMat[start][end] = 1;
    adjMat[end][start] = 1;
  }
// -------------------------------------------------------------
  public void displayVertex(int v)
  {
    System.out.print(vertexList[v].label);
  }

  public void mst() // Построение минимального остовного дерева
  { //
    vertexList[0].wasVisited = true; // Пометка
    theStack.push(0); // Занесение в стек
    while( !theStack.isEmpty() ) // Пока стек не опустеет
    { // Извлечение элемента из стека
      int currentVertex = theStack.peek();
// Получение следующего соседа
      int v = getAdjUnvisitedVertex(currentVertex);
      if(v == -1) // Если соседей больше нет,
        theStack.pop(); // извлечь элемент из стека
      else // Сосед существует
      {
        vertexList[v].wasVisited = true; // Пометка
        theStack.push(v); // Занесение в стек
// Вывод ребра
        displayVertex(currentVertex); // От currentVertex
        displayVertex(v); // к v
        System.out.print(" ");
      }
    }
// Стек пуст, работа закончена
    for(int j=0; j<nVerts; j++) // Сброс флагов
      vertexList[j].wasVisited = false;
  }
  // ------------------------------------------------------------
// Метод возвращает непосещенную вершину, смежную по отношению к v
  public int getAdjUnvisitedVertex(int v)
  {
    for(int j=0; j<nVerts; j++)
      if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
        return j; // Возвращает первую найденную вершину
    return -1; // Таких вершин нет
  }
}
