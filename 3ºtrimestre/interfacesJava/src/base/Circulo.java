package base;

public class Circulo implements FiguraGeometrica {


  private int raio;
  
  
  public int getRaio() {
  return raio;
  }
  
  
  public void setRaio(int raio) {
  this.raio = raio;
  }
  
  
  @Override
  public String getNomeFigura() {
  return "Circulo";
  }
  
  
  @Override
  public int getArea() {
  int area =0;
  area =  (int) (Math.PI * Math.pow(this.raio, 2));
  return area;
  }
  
  
  @Override
  public int getPerimetro() {
  int area = 0;
  area = (int) (2 * Math.PI * this.raio);
  return area;
  }
  
  
  }
