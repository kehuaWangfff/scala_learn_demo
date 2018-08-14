package example2

//scala 中的集合体系主要包括 Iterable,Seq,Set,Map，集合分为可变和不可变两种
//Seq包含了RangeArrrayBuffer,List ,ArrayBuffer相当与java的ArrayList

object func2set {
  def main(args:Array[String]){
    //创建一个list //head 第一个元素，tail除了第一个元素的其他元素list
    //：：特殊操作符
    var list =List(1,2,3,4,5)
    println(list.mkString("+,+"))
    list=0::list
    println(list.mkString("+,+"))

    //
    def decorator(list:List[Int],prefix:String){
      if(list !=Nil){
        println(prefix +list.head)
        decorator(list.tail,prefix)
      }
    }
    decorator(list,"sss")
    
    ///////////////////////////
    val linllist=scala.collection.mutable.LinkedList(1,2,3,4,5,6,7,8,9,10)
    var currentList=linllist
    var first=true
    while(currentList!=Nil&&currentList.next!=Nil){
      if(first){currentList.elem=currentList.elem*2;first=false}
      currentList=currentList.next.next
      if(currentList!=Nil)currentList.elem=currentList.elem*2
    }
    println(currentList.mkString(","))
  }
}