import java.io._
object demo4 {
  //没有返回值的函数称为过程
  def main(args:Array[String]):Unit={
    //定义一个lazzy值,只有第一次使用才会真正初始化;只有val值可以被lazy推迟初始化
    lazy val str=scala.io.Source.fromFile("/home/kehua/eclipse-workspace/scala_example/src/dataset/test.txt")
    .mkString
    //上面的lazzy值等价于
    def getlins=scala.io.Source.fromFile("/home/kehua/eclipse-workspace/scala_example/src/dataset/test.txt")
    .mkString
   // print(getlins)
    
    //scala 的异常处理机制
    try{
      throw new IOException("user defined exception")
    }catch{
     // case e1:IllegalAgumentException
      case e2:IOException =>println("io execption")
    }finally{
      println("finally")
    }
  }
}