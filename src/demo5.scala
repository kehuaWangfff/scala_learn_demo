//常见的数据结构数组和集合列 Array 
import scala.collection.mutable.ArrayBuffer
object demo5 {
  def main(args:Array[String]):Unit={
    //初始化一个数组
    var a=new Array[Int](10)
    var b = new Array[String](10)
    //可以直接用Array()创建一个数组，元素类型自己判断
    val st=Array("hello","world")
    // s(2)<-"assad"    //Array的长度是固定的
    println(st(0))
    //注意一种元素类型Any
    val s=Array("heh",12) //此时s 的类型就是any
    s.length
  
    //Array的长度是不可变的，需要ArrayBuffer,ArrayBuffer是一个集合
    val bs = new ArrayBuffer[Int]()
    bs+=2 //向bs中添加元素
    bs+=(2,3,4,5,6,7,8,9) //向bs中添加所个元素
    bs++=Array(1,2,3,4,5,6)// 将Array中的元素加入ArrayBuffer
    bs.trimEnd(5)  //从尾部开始截断n个元素
    bs.insert(2, 6)  //在第二个Index中插入元素
    bs.insert(2, 6,7,8,9,0,10)  //在第二个Index中插入多个元素
    bs.remove(2,3)  //从index2处删掉3个元素
    
    var bsArray= bs.toArray  //将ArrayBuffer转换成Array
    var abuffer=bsArray.toBuffer  //将Array转换成ArrayBuffer
    //如果需要想Array中添加元素，可以先转化成ArrayBuffer
   
    //遍历Array
    for(i <- bsArray) print(i+"  ")  //利用for循环的增强for循环
    println()
    for(i <- 0 until bsArray.length) print(bsArray(i)+" ")
    println()
    for(i <- 0 until (bsArray.length,2)) print(bsArray(i)+" ") //跳跃式遍历，每次跳跃两个
    println()
    for(i <- (0 until bsArray.length).reverse) print(bsArray(i)+" ") //倒序遍历
    println()  
    
    //Array的常见操作
    val ar=Array(1,2,3,4,5,6,7)
    //求和
    val sumvalue=ar.sum
    //最大最小值 max,min
    //并成一个字符串输出
    var str=ar.mkString
    //并成一个字符串中间以特殊字符隔开
    var str1=ar.mkString(sep=",")
    //指定左右符和分割符
    var str2=ar.mkString("<",",",">")
    
  }
}