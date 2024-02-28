package nested;

public class FranchiseMain {
    public static void main(String[] args) {

        Franchise.TaskForce taskForce1 = new Franchise.TaskForce("부산점", "홍길동");
        Franchise busanBranch = taskForce1.launch();

        Franchise.TaskForce taskForce2 = new Franchise.TaskForce("서울점", "김자바");
        Franchise seoulBranch = taskForce2.launch();

        busanBranch.getCoupon(10000, "홍길동");
        seoulBranch.getCoupon(5000, "김자바");
    }
}
