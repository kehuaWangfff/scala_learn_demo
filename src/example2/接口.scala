package example2
//java 8提供了面向函数的一些实现，提供了lamda的
//scala 的一些东西关于trait
//Trait 的一些基础知识 ：作为接口使用    trait中定义一些具体的方法   在trait中定义一些具体字段 定义抽象字段
//
//scala中比支持对于类进行多继承，但是支持多继承trait，使用with关键字即可
//类继承trait，必须实现其中抽象方法，不需要使用override
//第一种利用trait实现接口功能；但远远不只这中情况
trait SayHello{
  def sayHello(names:String)
}
trait MakeFriends{
  def makeFriends(p:Person)
}
trait logger{
  def log(message :String) =println(message) //trait 里面可以有具体的方法
}
class Person(val name :String) extends SayHello with MakeFriends{
  def sayHello(othernames:String){
    printf("hello,my friend %s ,I am  %s",othernames,name)
  }
  def makeFriends(p:Person){
    printf("hell ,my name is %s,i want to make friends with you %s",name,p.name)
  }
}

//在实例中混入trait
trait Logged{
  def log(msg :String){}
}
trait Mylogged extends Logged{
  override def log(msg :String){println(msg)}
}
class Per(name:String) extends Logged{
  def sayHello()={
    printf("pleas call me %s \n",name)
    log("qyq")
  }
}

//trait 调用链
trait Handler{
  def handle(data :String){}
}
trait Date1Hand extends Handler{
  override def handle(data :String){
    printf("实现对%s的第一步检查\n",data)
    super.handle(data)
  }
}
trait Date2Hand extends Handler{
  override def handle(data :String){
    printf("实现对%s的第二步检查\n",data)
    super.handle(data)
  }
}
class P1(val data:String) extends Date2Hand with Date1Hand{
  handle(data)
}
object 接口 {
  def main(args:Array[String]){
//    val per1=new Person("leo")
//    val per2=new Person("lee")
//    per2.makeFriends(per1)
//    
//    val p1=new Per("leo")
//    val p2=new Per("jack") with Mylogged
//    p1.sayHello()
//    p2.sayHello()
    //
      val p1 =new P1("ssdds")
 
          
    
  }
}