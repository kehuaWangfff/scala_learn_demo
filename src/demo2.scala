//练习scala里面的循环
import scala.util.control.Breaks._  //用于退出循环
object demo2 {
  //while do 循环
  def main(args: Array[String]): Unit = {
    var n = 10
    while (n > 1) {
      print(n+" ")
      n -= 1
    }
    println()
    n=10
    
    //三种for循环  
    for(i<-1 to n) print(i+ " ")
    println()
    for(i <- 1 until n) print(i + " ")
    println()
    for(i <-"hello,world") print(i +" ")
    println()
    //scala 退出循环,因为是对异常的捕捉，所以要尽量避免运用breakable的使用
    breakable{
      n=1
      for(c <-"hello word"){
        if(n==5)break
        print(c+" ")
        n+=1
      }
    }
    println()
    //for循环的高级使用
    ///多重for循环
    for(i<-1 to 9;from=i; j<-1 to from){
      printf("%d * %d = %d   ",j,i,i*j)
      if(j==i)println()
    }
  println()
  ///for 的守卫
  for(i<- 1 to 20 if i%2==0 && i>4  ) print(i+" ")
  println()
  ///for推导式
  var res=for(i <- 1 to 10) yield i
  print(res.getClass)
  
  //数组的常见的一些操作
  
  }
}