public class qwe {
    public static String convertString(String str) {
        var a = str.substring(0, 1);
        var b = a.toUpperCase();
        if (str == "") {
            return str;
        } else {
            return a == b ? str : new StringBuilder(str).reverse().toString();
        }
    }
    public static void main(String[] args) {

        System.out.println(qwe.convertString("Slgkb dbjnk"));
    }
}
