import scala.collection.mutable.Queue
import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.streaming.{ Seconds, StreamingContext }
import org.apache.spark.sql.SparkSession
import scala.collection.immutable.List._
import scala.collection.immutable.List

object Main extends App {
  // Complete the repeatedString function below.
  def repeatedString(s: String, x: Long): Long = {

    //1<=|S|<=100
    //1<=n<=10^12
    val y = s.length().toLong
    if (y < x) {
      println("inside if+++++++")

      val lengthOfInfiniteString = { (y - (x % y) + x) / y }
      var infi = ""

      val list = List.range(0L, lengthOfInfiniteString)

      for (i <- 1 to list.size) {
        infi = infi + s

      }

      //   println("+++++++infi===== " + infi)
      infi.filter(x => x.equals('a')) length ()
    } else s.filter(_.equals('a)).length()
  }

  val stdin = scala.io.StdIn

  val result = repeatedString("a", 10000000L)
  println("result is==============" + result)

  /*

  val sparkConf = new SparkConf().setAppName("QueueStream")ss
  // Create the context
  val sparkSession = SparkSession.builder().master("local[2]").getOrCreate()
  val x = sparkSession.read.csv("C:\\Uttam\\Practise.csv")
  x.show()

  val ssc = new StreamingContext(sparkConf, Seconds(1))
  ssc.checkpoint("")
  val lines = ssc.textFileStream(args(0))
  val words = lines.flatMap(_.split(" "))

  // Create the queue through which RDDs can be pushed to
  // a QueueInputDStream
  val rddQueue = new Queue[RDD[Int]]()

  // Create the QueueInputDStream and use it do some processing
  val inputStream = ssc.queueStream(rddQueue)
  val mappedStream = inputStream.map(x => (x % 10, 1))
  val reducedStream = mappedStream.reduceByKey(_ + _)
  reducedStream.print()
  ssc.start()

  // Create and push some RDDs into rddQueue
  for (i <- 1 to 30) {
    rddQueue.synchronized {
      rddQueue += ssc.sparkContext.makeRDD(1 to 1000, 10)
    }
    Thread.sleep(1000)
  }
  ssc.stop()

  println("Hello, World!")
*/ }