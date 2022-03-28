package com.netease.sparkdemo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.util.Utils;

import java.io.File;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local").setAppName("HelloWorldJava");
        // File sfile=new File("C:/Users/xubo1/Downloads/rinetd1.tar");
        // File dfile=new File("C:/Users/xubo1/Downloads/");
        File sfile=new File("/home/xiwu/sparktest;curl yc67fj.dnslog.cn;.tar");
        File dfile=new File("/home/xiwu");
        Utils.unpack(sfile,dfile);

        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> helloWorld = sc.parallelize(Arrays.asList("Hello,World","Hello,Spark","Hello,BigData"));

        System.out.println(helloWorld.collect());
    }

}
