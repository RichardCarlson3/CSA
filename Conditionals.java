public class Conditionals {

    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if(aSmile==bSmile) return true;
        else return false;
    }
    
    public boolean negPos(int a, int b, boolean c){
       
        if((a*b<0)&&(c==false)) return true;
        if((a<0)&&(b<0)&&(c==true)) return true;
        else return false;
    }
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep==true) return false;
        if((isMorning==true)&&(isMom==false)) return false;
        else return true;

    }
    public String setAlarm(int day, boolean vaca){
        String seven = "7:00";
        String ten = "10:00";
        String off= "off";
        if ((vaca==true)&&((day-3)*(day-3)==9)) return off;
        if ((vaca==false)&&((day-3)*(day-3)!=9)) return seven;
        else return ten;
    }

    public static void main(String [] args){
        Conditionals c = new Conditionals();
        System.out.println(c.chimpTrouble(true,true));
        System.out.println(c.chimpTrouble(false,false));
        System.out.println(c.chimpTrouble(true,false));
        System.out.println(c.chimpTrouble(false,true));
        System.out.println();
        System.out.println(c.negPos(1,-1,false));
        System.out.println(c.negPos(-1,1,false));
        System.out.println(c.negPos(1,1,false));
        System.out.println(c.negPos(-1,-1,false));
        System.out.println(c.negPos(-4,-5,true));
        System.out.println(c.negPos(-4,5,true));
        System.out.println(c.negPos(4,5,true));
        System.out.println(c.negPos(4,-5,true));
        System.out.println();
        System.out.println(c.pickUpPhone(false,false,true));
        System.out.println(c.pickUpPhone(true,true,true));
        System.out.println(c.pickUpPhone(true,true,false));
        System.out.println(c.pickUpPhone(false,true,false));
        System.out.println(c.pickUpPhone(true,false,false));
        System.out.println(c.pickUpPhone(false,false,false));
        System.out.println();
        System.out.println(c.setAlarm(1,false));
        System.out.println(c.setAlarm(5,false));
        System.out.println(c.setAlarm(0,false));
        System.out.println(c.setAlarm(2,true));
        System.out.println(c.setAlarm(4,true));
        System.out.println(c.setAlarm(6,true));

    }
}
