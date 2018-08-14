//scala 面向对象编程的对象，scala特有的对象object

//伴生对象和伴生类  必须放在同一个 .scala文件下
object Person{  //全局就放一份就可以的放在Object中
  private var eyenums=2
  println("this is a person object!!!")
  def getEyenums = eyenums
}
class Person{ //伴生类和伴生对象可以互相访问对方private的对象
  def sayhello = printf("you are a person,you must have %d eye",Person.eyenums) 
  //只有在伴生对象可以直接访问Person.eyenums
}

//让 object继承一个抽象类
abstract class Hello(var message :String){
  def sayhello(name:String)//只给了方法，没有写如何去实现
  }
object Hellompl extends Hello("hello"){
  override def sayhello(name : String){
    println(message + " , "+name)
  }
}


//object 的十分重要的apply方法
//通常在伴生对象中实现实现apply 的方法，并在其中构造伴生类的对象的功能。
//而创造伴生类的对象时，通常不会用new Class的方式，而是使用Class()的方式，隐式地调用了伴生对象的apply方法，这样会让生成对象更加简洁
//比如Array类的伴生对象的apply方法就实现了一个接受可变数量的参数，并创建一个Array对象的功能
class Per1(val name :String){
  printf("my name is %s",name)
}
object Per1{
  def apply(name:String)=new Per1(name)
}
 
//object 实现
object demo9 {
  //main 方法 
  //一个.scala文件怎么在命令行运行
  //首先用scalac file.scala 进行编译
  //然后 scala file 进行执行 ，若有传进参数 scala file 参数
  //scala -Dscala.time file 可知道执行时间
  def main(args:Array[String]):Unit={
    println(Person.getEyenums)
    println(Person.getEyenums) //只有在第一次访问初始化
    
    val person =new Person
    person.sayhello
    println()
    Hellompl.sayhello("lek")
    
    //apply
    val per1 =Per1("kehua")
    val per2 =new Per1("kehua")
    per1.name
    
    
  }
}