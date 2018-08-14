package example2
import scala.collection.mutable.ArrayBuffer

//对 scala 函数的详解
class Datasets{
  private val head=new ArrayBuffer[String]()
  
}

object function_code {
  def main(args:Array[String]){
    //在scala中函数可以直接赋值给变量
    def transformation(columns :String)=println("对"+columns+"进行trnsformation处理")
    val func1=transformation _//要注意这里_与函数名之间有空格
    func1("age")
    
    //scala里面的匿名函数
    val func2=(column :String)=>println("对"+column+"进行trnsformation处理") //在spark源码中有大量匿名函数
    func2("toatalmonth")
    val func3=(num :Int)=>{
      var temp=num*num
      printf("%d * %d = %d \n",num,num,temp)
    }
    var value =func3(7)
    
    //高阶函数 ，函数可以当作传回参数和返回值
    //向一个函数里面出入一个函数参数
    val upload=(column :String)=>println("please upload the columns"+column)
    val dataAnylise =(func : (String)=>Unit, column :String)=>func(column)
    dataAnylise(upload,"month")
    
    //Array的map函数调用匿名参数
    Array(1,2,3,4,5).map((num:Int)=>println(num*num))  
    //Array(1,2,3,4,5).map((num:Int,num1:Int)=>println(num*num1))//错误的
    
    //定义返回类型G是函数的高阶函数
    def getGreetingfunc(msg:String)=(name :String)=>println(msg +", "+ name)
    val getGreetingHello=getGreetingfunc("hello")
    getGreetingHello("leo")
    
    def triple(func : (Int)=>Int)={func(3)}
    val i=triple((v1)=>v1*3)
    val i1=triple(_*3)
    println(i  +"   "+i1) 
    
    //scala内置的常用的高阶函数
    (1 to 9).map("k" *_).foreach(println _)
    //filter
    val test=(1 to 20).filter(_%2==0)
    println(test.mkString(","))
    
    //reduceLeft,从左侧元素开始对元素进行reduce操作
    val test1=(1 to 3).reduceLeft(2*_+_)
    println(test1)
    
    //进行排序
    Array(1,3,7,4,5).sortWith(_>_).mkString("  ")
    
    ///sam
    
    
}
}