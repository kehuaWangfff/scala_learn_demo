// 控制台读入、打印、以及判断的最基本练习
object demo1 {
  def main(args : Array[String]):Unit ={
    val names = readLine("Please tell me your names :") //这种方法只能读入字符串
    println("your name is "+names)
    println("Please tell me your age :")
    val age = readInt()                                 //不能像readLine一样加参数
    println("Your age is "+ age)
    if(age > 18){ //有参数的打印要使用printf
      printf("hi,%s you are %d years old,you can come into",names,age)
    }else{
      printf("hi,%s you are %d years old,you can't come into",names,age)
    }
  }
}