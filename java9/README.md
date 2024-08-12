# Module
1. 모듈 (Module): 모듈은 패키지와 리소스의 집합이며, module-info.java 파일을 통해 정의된다. 모듈은 자신이 노출하고자 하는 패키지와 필요한 다른 모듈들을 명시적으로 선언한다.
2. `module-info.java`: 모듈의 메타데이터를 담고 있으며, 해당 모듈이 제공하는 패키지와 의존하는 모듈들을 정의한다. 모듈의 루트에 위치
3. Exports: 모듈이 제공하는 패키지들을 명시적으로 지정하며, 외부에서 사용할 수 있게 한다.
4. Requires: 모듈이 의존하는 모듈을 명시

```java
// mod1 module-info.java
// prv는 비공개
module kr.taeu.mod {
    exports kr.taeu.mod1;
}
```
```java
// app module-info.java
module kr.taeu.hello {
    requires java.base;

    requires kr.taeu.mod;
}
```
```java
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
```