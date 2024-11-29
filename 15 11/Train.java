class Train{
  String name,Time;
  double hTr; 
  static String SP="Secunderabad";
  public static void main(String []args){
  Train t1 = new Train();
  Train t2 = new Train();
  Train t3 = new Train();
  t1.name = "VandeBharat Express";
  t1.hTr = 6;
  t1.Time ="7 pm";
  t2.name = "ShatabdiExpress";
  t2.hTr = 8;
  t2.Time ="7:25pm";
  t3.name = "NagavalliExpress";
  t3.hTr = 6.5;
  t3.Time ="5:10pm";
  
  System.out.println("Name of Train1: "+t1.name+"\nDeparts at: "+t1.Time+"\nTo reach the destination takes: "+t1.hTr+"\nStarting point is "+SP);
  System.out.println("-------------------------------------------------------");
  System.out.println("Name of Train2: "+t2.name+"\nDeparts at: "+t2.Time+"\nTo reach the destination takes: "+t2.hTr+"\nStarting point is "+SP);
  System.out.println("-------------------------------------------------------");
  System.out.println("Name of Train1: "+t3.name+"\nDeparts at: "+t3.Time+"\nTo reach the destination takes: "+t3.hTr+"\nStarting point is "+SP);


  }
}