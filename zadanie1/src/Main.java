public class Main {
    public static void main(String[] args) {
        double [][] mat4 = {
                {1.0,1.0,-1.0,-1.0},
                {2.0,1.0,2.0,3.0},
                {3.0,4.0,5.0,6.0},
                {5.0,7.0,8.0,9.0}
        };
        double [][] mat3 = {
                {1.0,2.0,3.0},
                {4.0,5.0,6.0},
                {7.0,8.0,9.0}
        };
        double [][] mat2 = {
                {1,2},
                {3,4},
        };
        Determin dd = new Determin(mat4);
        dd.getValue();
        Determin aa = new Determin(mat2);
        aa.getValue();
        Determin bb = new Determin(mat3);
        bb.getValue();
    }
}

