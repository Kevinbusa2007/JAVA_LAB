class point {
    private int x, y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
   public static void main(String[] args) {
        
        point p = new point(10, 20);
        System.out.println(p);
    }
}