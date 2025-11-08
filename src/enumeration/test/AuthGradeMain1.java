package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();

        for (AuthGrade authGrade : values) {
            System.out.println("grade = " + authGrade.name() + ", level = " + authGrade.getLevel() + ", 설명 = " + authGrade.getDescription());
        }


        /*AuthGrade guest = AuthGrade.GUEST;
        AuthGrade login = AuthGrade.LOGIN;
        AuthGrade ADMIN = AuthGrade.ADMIN;
        System.out.println("guest = " + guest + ", level = " + guest.getLevel() + ", 설명 = " + guest.getDescription());
        System.out.println("guest = " + login + ", level = " + login.getLevel() + ", 설명 = " + login.getDescription());
        System.out.println("guest = " + ADMIN + ", level = " + ADMIN.getLevel() + ", 설명 = " + ADMIN.getDescription());*/
    }
}
