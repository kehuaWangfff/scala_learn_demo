//scala 面向对象变成继承 ，可以提高代码的复用，便于维护和扩展
//scala 继承
//子类可以覆盖父类的field和method，但如果父类用final修饰则无法被继承,
//若父类中的field和method被final修饰则无法被覆盖
class Person1{
  private val name ="Leo"  //父类里面的private变量是
  val age =0
  def getName=name
}
class Stu10 extends Person1{
  private var score =100
  def getScore = score
}
//覆盖父类的一些方法
class Stu9 extends Person1{
  private var score =100
  def getScore =score
  override val age =100
  override def getName ="Hi, i am "+super.getName
}

//isInstanceOf asInstanceOf 
//父类、子类的类型判断和转换
//protected 修饰父类的对象和方法，只能在子类的实例中访问自身的父类对象和方法，也可以访问其他实例的这两个方法
//protected[this] 修饰父类的对象和方法，只能在子类的实例中访问自身的父类对象和方法，但不能访问其他实例的这两个方法和对象
//protected[this] 和private[this]很像


object demo10 {
  def main(args:Array[String]){
    val s1 = new Stu10
    println(s1.getName) //调用父类的方法和field
    val s2 = new Stu9
    println(s2.getName)
    
    val p :Person1=new Stu10 //父类的变量引用了子类的对象
    var s:Stu10=null
    if(p.isInstanceOf[Stu10]) s=p.asInstanceOf[Stu10]  //将父类转换成Stu10
    println(p.getClass)  //getClass 可以精确获得对象所属于的类
    println(p.getClass==classOf[Stu10])
    println(p.getClass==classOf[Person1])
    println(p.isInstanceOf[Stu10]+"  "+p.isInstanceOf[Person1])
    
    //利用模式匹配进行类型判断
    p match{  //匹配成功就跳出，和isInstanceOf一样分不清楚 Stu10 和 Person1 
      case per:Stu10 =>println("it is a Stu10 type")
      case per:Person1 =>println("it is a Person1 type")
      case _=>println("don't know type")
    }
    
    
    
    
    
  }
}