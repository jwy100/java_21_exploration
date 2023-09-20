package pattern_matching_records;

public class Main {

    public static void main(String ... args) {
        System.out.println("Testing Pattern Matching with Records!");


        Point p = new Point(1, 2, 3);

        if (p instanceof Point q) {
            System.out.println(q.x());
            System.out.println(q.y());
            System.out.println(q.z());
        }


//        My concern with this is that it couples the pattern matching to how the parameters are ordered in the original
//        record class, potentially introducing brittleness (albeit no more so than the record constructor)
        if (p instanceof Point(int x, int y, int r)) {
            System.out.println(x);
            System.out.println(y);
            System.out.println(r);
        }



    }

}