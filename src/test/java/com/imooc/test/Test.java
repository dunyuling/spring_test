package com.imooc.test;

import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.dao.PessimisticLockingFailureException;

import java.util.Date;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test {

    @org.junit.Test
    public void test() {
        int a = 3;
        int b = 2;
        System.out.println("a = " + a + " b = " + b);
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
        b = a ^ b;
        System.out.println("a = " + a + " b = " + b);
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
    }

    private byte[] int2Byte(int id) {
        byte[] arr = new byte[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (id >> i * 8);
        }
        return arr;
    }

    private int bytes2Int(byte[] arr) {
        int result = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = (arr[i]) << i * 8;
            result += temp;

            System.out.println("i= " + i + ",temp= " + temp + ",b1= " + Integer.toBinaryString(arr[i]) + ",b2= " + Integer.toBinaryString(arr[i] & 0xff) + "\t");
        }
        System.out.println();
        return result;
    }

    @org.junit.Test
    public void byteOper() {
        byte[] arr = int2Byte(8143);
        for (byte anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
        int result = bytes2Int(arr);
        System.out.println(result);

        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());

        }
//
//
//        System.out.println(Integer.toBinaryString(8143));
//        System.out.println(Integer.parseInt("00110001",2));
    }
//11111
//11001111
//00110000
//00110001

//00110000
//11001111

//    i= 0,temp= 207	i= 1,temp= 7936	i= 2,temp= 0	i= 3,temp= 0

    @org.junit.Test
    public void test2() {
        System.out.println(Integer.toBinaryString(-49));
        System.out.println(Integer.toBinaryString(-49 & 0xff));


        System.out.println(Integer.toBinaryString(8143));

        System.out.println(Integer.parseInt("11001111", 2));
        System.out.println(Integer.parseInt("ff", 16));
        System.out.println(Integer.toBinaryString(255));
    }
}