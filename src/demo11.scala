
//匿名内部类
//匿名子类，也就是说，可以定义一个类的没有名称的子类，并直接创建其对象，然后将
//变量的引用赋予一个变量，之后甚至可以将该匿名子类的对象传递给其他函数
class Per(protected val name:String){
  def sayhello=printf("hello,i am %s",name)
}
object demo11 {
  def main(args:Array[String]){
    val p =new Per("leo"){
      override def sayhello=printf("hi,i am %s",name)
    }
    val p1=new Per("leo")
    def greeting(p:Per){
      p.sayhello
    }
    greeting(p)
    println()
    greeting(p1)
  }
  
}