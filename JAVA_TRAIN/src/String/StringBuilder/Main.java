package String.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Manh");
        System.out.println(sb);
        sb.append("!");

        sb.insert(3,"Nam");
        System.out.println(sb);

        sb.delete(1,2);
        System.out.println(sb);
    }
}
