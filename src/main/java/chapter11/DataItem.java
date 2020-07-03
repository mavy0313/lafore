package chapter11;

class DataItem {
  private int iData; // Данные (ключ)
  //--------------------------------------------------------------
  public DataItem(int ii) // Конструктор
  { iData = ii; }
  //--------------------------------------------------------------
  public int getKey()
  { return iData; }
}
