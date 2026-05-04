public class car {
    public static String filterString(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;

        var s = ' ';
        var r = "";

        while (i < str.length()) {
            var t = str.charAt(i);
            if (t == ch) {
                t = s;
            } else {
                r = r + t;
            }

            i += 1;
        }
        // END
    return r;
    }
    public static void main(String[] args) {
        System.out.println(car.filterString("If I look back I am lost", 'I'));
    }
}
