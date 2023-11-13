public class C5 {
    int x;
    int y;

    public C5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        if(y==0){
            return true;
        } else{
            return false;
        }
    }

    public boolean isY(){
        if(x==0){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "P("+x+","+y+")";
    }
    
    
}
