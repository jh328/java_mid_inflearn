package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("memberA", address);
        MemberV2 memberB = new MemberV2("memberB", address);

        // 회원 둘 다 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 B -> 부산으로 변경
        memberB.setImmutableAddress(new ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
