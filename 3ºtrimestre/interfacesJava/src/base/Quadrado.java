package base;

public class Quadrado implements FiguraGeometrica{


    private int lado;
    
    public int getLado() {
    return lado;
    }
    
    
    public void setLado(int lado) {
    this.lado = lado;
    }
    
    
    @Override
    public String getNomeFigura() {
    return "Quadrado";
    }
    
    
    @Override
    public int getArea() {
    int area =0;
    area = this.lado * this.lado;
    return area;
    }
    
    
    @Override
    public int getPerimetro() {
    int perimetro = 0;
    perimetro = this.lado * 4;
    return perimetro;
    }
    
    
    }