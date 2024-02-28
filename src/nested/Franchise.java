package nested;

public class Franchise {

    String storeName;

    public Franchise(String storeName) {
        this.storeName = storeName;
    }

    static class TaskForce {

        String branchName;
        String leader;

        public TaskForce(String branchName, String leader) {
            this.branchName = branchName;
            this.leader = leader;
            System.out.println("리더 " + leader + "님을 선두로 " + branchName + " TF 팀 출두!");
        }

        public Franchise launch() {
            System.out.println(branchName + " 오픈!");
            return new Franchise(branchName);
        }
    }

    class Coupon {

        int amount;
        String to;
        String message;

        public Coupon(int amount, String to) {
            this.amount = amount;
            this.to = to;
            this.message = "%s에서 %d원 쿠폰을 %s님께 드립니다.".formatted(storeName, amount, to);
            System.out.println(message);
        }
    }

    public Coupon getCoupon(int amount, String to) {
        return new Coupon(amount, to);
    }
}