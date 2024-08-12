package kr.taeu.main;

//import kr.taeu.prv.PrivateClass;


import kr.taeu.mod1.StringUtil;

public class Main {
    public static void main(String[] args) {
        boolean hasText = StringUtil.hasText("hello");
        System.out.println("hasText = " + hasText);

        int len = StringUtil.length("hihi");
        System.out.println("len = " + len);

//        PrivateClass privateClass = new PrivateClass(); //         cannot find symbol
//        privateClass.privateMethod();
    }
}
