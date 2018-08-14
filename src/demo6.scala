//数组操作之数组转换
import scala.collection.mutable.ArrayBuffer
object demo6 {
  def main(args:Array[String]):Unit={
    ///通过yield 的方式完成数组转换
    //对Array转换得到的还是Array
    var a1=Array(1,2,3,4,5,6)
    var a2=for(ele<-a1) yield ele*ele+1
    println(a2.mkString("  "))
    //对ArrayBuffer的转换还是得到一个ArrayBuffer
    var b=new ArrayBuffer[Int]()
    b+=(1,2,3,4,5,6,7)
    var b2=for(ele <-b) yield ele*ele+3
    var b3=for(ele <- b if ele%2==0) yield ele*ele+3
    
    //scala的函数性编程
    var a3=a1.filter(_%2==0).map(_*2)
    
    //移除ArrayBuffer里面除了第一个负数以外的所有负数u
    var a =new ArrayBuffer[Int]()
    a+=(1,2,3,4,-1,-2,-3,-4,1,2,3,43)
    var temp1=a.filter(_>=0)
    var temp2=a.filter(_<0)
    temp1+=temp2(0).toInt
    println(temp1.mkString("  "))
    
    //另外一种方法
    var mark :Boolean=false
    var out1=for(i<-a if i>0 || mark==false) yield{
      if(i<0) mark=true
      i
    }
    println(out1.mkString("  "))
    
    
//    for( i<-1 to 9;j <-1 to i;k<-1 to j){
//      printf("%d * %d * %d = %d  ",i,j,k,i*j*k)
//      if(j==i && j==k)println()
//    }
//    //
  }
}