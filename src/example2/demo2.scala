package example2
//泛型的概念，对一些类型进行强限制
class Student[T](val locallod:T){
  def getSchoolId(hukouId:T)=println("S-"+hukouId+"-"+locallod)
    }
    //上下边界bounds
class Person1(name:String){
  def sayHello=println("hello , i am"+name)
  def makfriends(p:Person1){
    sayHello
    p.sayHello
  }
}
class Party[T<:Person1](p1:T,p2:T){
  def play =p1.makfriends(p2)
}


//Manifest Context Bounds
class Meat (val name:String)
//协变和逆变

object demo2 {
  def main(args:Array[String]){
    val st1=new Student[Int](111)
    st1.getSchoolId(24322)
    //上下边界bounds
    val leo=new Person1("leo")
    val jack=new Person1("jack")
    val p1=new Party(leo,jack)
    p1.play
  }
}