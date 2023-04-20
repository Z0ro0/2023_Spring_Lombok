package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter//게터
@Setter//세터
@NoArgsConstructor//기본생성자
class MyClass implements Serializable{
    private String value1;
    private String value2;


}

//class MyClass implements Serializable {//3번 조건
//    private String value1;//1번 조건
//    private String value2;
//
//    public MyClass(){}//2번 조건
//
//    public String getValue1() {//1번 조건
//        return value1;
//    }
//
//    public String getValue2() {
//        return value2;
//    }
//
//    public void setValue1(String value1) {
//        this.value1 = value1;
//    }
//
//    public void setValue2(String value2) {
//        this.value2 = value2;
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}