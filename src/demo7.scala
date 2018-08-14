//scala的编程Map和Tuple，
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap

object demo7 {
  //Tuple
  def main(args:Array[String]):Unit={
      val ages=Map("leo"->25,"jack"->23,"kh"->45,"jen"->35)
      // ages("leo")=23   value update is not a member of scala.collection.immutable.Map[String,Int]
      ages("leo")=23 //mutable下的Map是可以变得
      println(ages.mkString("  "))
      
      //另外一种方式定义Map
      val ages1=Map(("leo",25),("jack",23),("kh",45),("jen",35))
      println(ages1.mkString("  "))
      
      //创建一种空的Map
      val ages2 = new HashMap[String,Int]()
      
      //访问Map中的函数
      val leoAges=ages("leo") //如果Key不存在，会报错
      val leoAges1=ages.getOrElse("leo", 0)  //如果关键字不存在，就会返回0
      
      //修改Map的元素，默认的Map是无序的
      ages("leo")=32        //更新map的元素
      ages+=(("Mike",23),("zhangfei",33),("lisi",55))  //添加多个元素
      ages-="jack"  //删除元素
      println(ages.mkString("  "))

      //上述的操作都是对于mutable可更改的map,对于不可更改immutable的map
      val age = scala.collection.immutable.Map("leo"->25,"jack"->23,"kh"->45,"jen"->35)
      // age+=(("Mike",23),("zhangfei",33),("lisi",55))  age本身是不可以更改的
      val age2=age +(("Mike",23),("zhangfei",33),("lisi",55)) 
      val age3=age2-"lisi"
      
      //map 的遍历
      //利用for增强for循环
      for((key,value)<-ages) println(key +" : "+value)
      //遍历map里面的所有的key
      for(key <-ages.keySet) print(key+"  ")
      println()
      //遍历map里面所有的value
      for(value<-ages.values) print(value +" , ")
      println()
      
      //利用yield生成一个新的map，实现key,value的反转 ;
      //mutable 生成nutable; immutable生成immutable
      val agee =for((key,value)<-ages) yield (value,key)
      println(agee.mkString(" , "))
      println(agee.keySet.mkString(" , "))

      //Map的排序和如何维护Map的插入顺序
      val sortAges=scala.collection.mutable.SortedMap("leo"->25,"jack"->23,"kh"->45,"jen"->35)
      println(sortAges.mkString(" , ")) //SortedMap会按照字母的顺序排序,自动按照key排序
      
      //LinkedHashMap按照插入顺序对map排序
      val linkedAges=new scala.collection.mutable.LinkedHashMap[String,Int]()
      linkedAges("leo")=32
      linkedAges("jack")=25
      linkedAges("jen")=27
      println(linkedAges.mkString(" , "))
      
      //Map的元素类型 Tuple
      var t=("leo","30","dds")
      println(t._1) //访问第一个元素
      
      //zip操作
      val names=Array("leo","jack","jen")
      val array_ages=Array(23,24,14)
      val namesAges=names.zip(array_ages) //namesAges就是一个元素为tuple的Array
      for((name,age)<-namesAges) println(name +" : "+age) 
  }
  
}