package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

/*
        문제 7. 상품 리뷰순과 가격순 정렬

        온라인 상점의 상품들의 리스트가 있습니다.
        각 상품은 이름, 가격, 리뷰 수를 가지고 있습니다.
        우선 상품을 리뷰 수가 많은 순으로 정렬하세요.
        만약 리뷰 수가 같다면, 가격이 낮은 순으로 정렬하세요.

        List<Product> products = Arrays.asList(
            new Product("Laptop", 999.99, 250),
            new Product("Smartphone", 499.99, 300),
            new Product("Tablet", 199.99, 300),
            new Product("Smartwatch", 199.99, 150)
        );
*/

        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, 250),
                new Product("Smartphone", 499.99, 300),
                new Product("Tablet", 199.99, 300),
                new Product("Smartwatch", 199.99, 150)
        );

        List<Product> list = products.stream()
                .sorted(Comparator.comparing(Product::getReviews).reversed().thenComparing(Product::getPrice))
                .toList();

        list.forEach(System.out::println);
    }

    public static class Product {

        String name;
        double price;
        int reviews;

        public Product(String name, double price, int reviews) {
            this.name = name;
            this.price = price;
            this.reviews = reviews;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getReviews() {
            return reviews;
        }

        @Override
        public String toString() {
            return "%s - $%.2f | Reviews : %d".formatted(name, price, reviews);
        }
    }
}
