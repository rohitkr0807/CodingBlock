package Goldman;

public class TwoRectangle {
    public class Point{
        int x;
        int y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public boolean isRectangle(Point l1,Point r1,Point l2,Point r2){
        Point P= new Point(l2.x,r2.y);
        if(l2.x<r1.x && l2.x>l1.x && r2.y>r1.y && r2.y>l1.y){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        TwoRectangle t= new TwoRectangle();

    }
}
