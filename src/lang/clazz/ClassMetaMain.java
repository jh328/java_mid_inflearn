package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    public static void main(String[] args){
        Class clazz = String.class;// 우리가 만든 클래스의 정보를 다 갖고 올 수 잇다.


        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
