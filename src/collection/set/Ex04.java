package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args) {

/*
        연습문제 4. 친구 추천 시스템 구현하기

        소셜 네트워크에서 자주 볼 수 있는 기능 중 하나는 "친구 추천"입니다.
        사용자들의 친구 목록을 기반으로,
        서로 친구가 아닌 사용자들에게 공통의 친구가 가장 많은 사람을 추천해 주는 간단한 친구 추천 시스템을 Set을 활용해 구현해 봅니다.

        요구사항 :
        - 각 사용자의 친구 목록은 Set<String>으로 관리합니다.
        - 사용자 A와 사용자 B가 주어졌을 때, A의 친구가 아니면서 A와 가장 많은 공통의 친구를 가진 사람(들)을 B 중에서 찾아 추천합니다.
        - 간단한 테스트 케이스를 만들어, 추천 시스템이 정상적으로 작동하는지 확인합니다.

        예시 입력 :
        Set<String> userAFriends = new HashSet<>(Arrays.asList("B", "C", "D", "E"));
        Set<String> userBFriends = new HashSet<>(Arrays.asList("A", "C", "D", "F", "G"));

        출력 결과 :
        A에게 추천하는 친구 : F, G
*/

        Set<String> userAFriends = new HashSet<>(Arrays.asList("B", "C", "D", "E"));
        Set<String> userBFriends = new HashSet<>(Arrays.asList("A", "C", "D", "F", "G"));

        Set<String> recommendFriendsToA = new HashSet<>(userBFriends);
        recommendFriendsToA.removeAll(userAFriends);
        recommendFriendsToA.remove("A");
        System.out.println("A에게 추천하는 친구 : " + recommendFriendsToA);

        Set<String> recommendFriendsToB = new HashSet<>(userAFriends);
        recommendFriendsToB.removeAll(userBFriends);
        recommendFriendsToB.remove("B");
        System.out.println("B에게 추천하는 친구 : " + recommendFriendsToB);
    }
}
