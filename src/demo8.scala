//scala的面向对象编程 的类
//定一个简单的类 ,类里面的叫做方法
//在class里面的定义的不带private var filed,scala生成面向JVM的类时，会定义private 的name字段，但提供
//    public的getter和setter方法 如class.name ,class.name_=
// 而如果是使用private修饰的field则提供的getter,setter方法也是private
// 如果定义 val field ,则只会生产getter方法
//如果不希望生成getter和setter方法，则用private[this]修饰filed

//自己定义getter setter方法
//利用private 修饰的field，可以被本类的其他对象调用
//如果希望不被其他本类对象访问，需要private[this]修饰

class Student {
  private var myName = "leo"
  private var myage = 17
  def name = "your name is " + myName
  def age = "your name is " + myage
  def age_=(newage: Int) {
    println("you can't chang your age!!!")
    this.myage = newage
  }
  def name_=(newName: String) {  //=不能左右有空格  
    println("you can't chang your name!!!")
  }
  def nameage_=(newName :String,newage :Int){
    this.myName = newName
    this.myage = newage
  }
  def order(s :Student)={  //此时s的age虽然是private,但在这里依然可以被访问 
                              //若不想被访问，要定义为private[this]
    this.age>s.age
  }
}


//写一个新类实现javabean风格是注解


//scala 的辅助构造函数
class Stu1{
  private var name =""
  private var age =0
  def this(name :String){  //定义了两个辅助构造函数，首先调用this（）主构造函数
    this()
    this.name=name
  }
  def this(name :String,age :Int){
    this(name)
    this.age=age
  }
}

//scala的主构造函数
class Stu2(val name:String,val age :Int){
  printf("you name is %s   you age is %d   ",name,age)
}

//scala的内部类

object demo8 {

  def main(args: Array[String]): Unit = {
    val s = new Student
    println(s.name)
    s.name_=("kehua")
    s.age_=(18)
    println(s.name+"  "+s.age)
    s.nameage_=("ke", 17)
    println(s.name+" ; "+s.age)

    
    val s1=new Stu1
    val s2 = new Stu1("kehua")  //利用辅构造函数
    val s3 = new Stu1("kehua",30)

  }
}