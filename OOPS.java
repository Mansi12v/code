public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip (5);
        System.out.println(p1.tip);
        p1.color= "yellow";
        System.out.println(p1.color);
    }

    
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
