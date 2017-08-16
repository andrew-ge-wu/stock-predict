package com.thinkbig.ai.stockanalysis;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.hive.HiveContext;

public class StockPredictor {

    public static void main(String[] args) {
        JavaSparkContext sc = new JavaSparkContext(new SparkConf().setAppName("StockPredict"));
        SparkSession session = SparkSession.builder().sparkContext(sc.sc()).enableHiveSupport().getOrCreate();

    }
}
