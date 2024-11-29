class GUNS{
  String name,type; 
  int magSize; 
  double range;
  public static void main(String []args){//AKM, Scarl, M762, AWM, M416
  GUNS g1 = new GUNS();
  GUNS g2 = new GUNS();
  GUNS g3 = new GUNS();
  GUNS g4 = new GUNS();
  GUNS g5 = new GUNS();
  g1.name = "AKM";
  g1.type = "ASSUALT";
  g1.magSize = 70;
  g1.range = 250;
  g2.name = "AWM";
  g2.type = "SNIPER";
  g2.magSize = 7;
  g2.range = 1000;
  g3.name = "M416";
  g3.type = "LMG";
  g3.magSize = 80;
  g3.range = 150;
  g4.name = "M762";
  g4.type = "RIFAL";
  g4.magSize = 70;
  g4.range = 200;
  g5.name = "SlCARL";
  g5.type = "SHORTGUN";
  g5.magSize = 10;
  g5.range = 100;
  
  System.out.println("Name of Gun1: "+g1.name+"\nRange: "+g1.range+"m\nType of gun : "+g1.type+"\n Mag. size "+g1.magSize);
  System.out.println("-------------------------------------------------------");
  System.out.println("Name of Gun1: "+g2.name+"\nRange: "+g2.range+"m\nType of gun : "+g2.type+"\n Mag. size "+g2.magSize);
  System.out.println("-------------------------------------------------------");
  System.out.println("Name of Gun1: "+g3.name+"\nRange: "+g3.range+"m\nType of gun : "+g3.type+"\n Mag. size "+g3.magSize);
  System.out.println("-------------------------------------------------------");
  System.out.println("Name of Gun1: "+g4.name+"\nRange: "+g4.range+"m\nType of gun : "+g4.type+"\n Mag. size "+g4.magSize);
  System.out.println("-------------------------------------------------------");
  System.out.println("Name of Gun1: "+g5.name+"\nRange: "+g5.range+"m\nType of gun : "+g5.type+"\n Mag. size "+g5.magSize);


  }
}