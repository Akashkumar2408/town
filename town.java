import java.util.*;

class townships {
  // input
  int township, house, roofbedroom, standerdroom, hall;

  void enterhouse() {
    Scanner s = new Scanner(System.in);
    System.out.print(" enter no of townships ");
    township = s.nextInt();
    System.out.print("eneter no of house ");
    house = s.nextInt();

  }
}

class wa extends townships {
  int troofwall, standerdwall, wallhall, totalwall, t,time ;
  double t1,t2,totaltime,accent,normal;

  void allwall() {
    System.out.print("  townships ");
    System.out.println(township);
    System.out.print("  house ");
    System.out.println(house);

    for (int index = 0; index < township; index++) {
      for (int k = 0; k < house; k++) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no of roof bed room");
        roofbedroom = s.nextInt();
        System.out.print("enetr standerd room ");
        standerdroom = s.nextInt();
        System.out.print("Enter no hall ");
        hall = s.nextInt();

        System.out.print("  roof bed room ");
        System.out.println(roofbedroom);
        System.out.print("  standerd room ");
        System.out.println(standerdroom);
        System.out.print("  hall ");
        System.out.println(hall);

        troofwall = roofbedroom * 3;
        standerdwall = standerdroom * 4;
        wallhall = hall * 6;

        // calculation for total wall
        totalwall = troofwall + standerdwall + wallhall;
        System.out.println(totalwall);
        // total time
        System.out.println("total walls");
        t += totalwall;
        t1= totalwall* ((1.0 / 3.0) * 2.5);
        t2= totalwall*((2.0/3.0)*3.25);
        normal=totalwall*((2.0/3.0)*2.25);
        accent=totalwall*((1.0/3.0)*1.5);
        totaltime= t1 + t2;
        System.out.println("total time"+ totaltime);
        System.out.println("total accent color"+ accent);
        System.out.println("total normal color"+ normal);
      }  
    } 
  }
}

class town {
  public static void main(String[] arg) {
    wa e = new wa();
    e.enterhouse();
    e.allwall();

  }
}