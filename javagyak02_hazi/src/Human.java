public class Human {

    public String name;
    public int height;
    public int weight;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String questionMark(char a) {
        char[] chars = this.name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == a) {
                chars[i] = '?';
            }
        }
        return String.valueOf(chars);
    }

    public int sum() {
        return this.height + this.weight;
    }
}
