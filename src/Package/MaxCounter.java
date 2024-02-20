package Package;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 1;
        this.max = max;
    }

    public void increment() {
        if (count <= max) {
            System.out.println(count);
            count++;
        } else if (count > max) {
            System.out.println("최댓값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
