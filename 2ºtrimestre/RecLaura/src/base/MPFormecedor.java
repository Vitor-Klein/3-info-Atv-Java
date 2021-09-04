package base;

public class MPFormecedor {
  private String ID_Forn,ID_MP;
  public MPFormecedor(String ID_Forn, String ID_MP){
    super();
    this.ID_Forn = ID_Forn;
    this.ID_MP=ID_MP;
  }

  public String getID_Forn() {
    return ID_Forn;
   }
   
   public void setID_Forn(String ID_Forn) {
    this.ID_Forn = ID_Forn;
   }

   public String getID_MP() {
    return ID_MP;
   }
   
   public void setID_MP(String ID_MP) {
    this.ID_MP = ID_MP;
   }
}


