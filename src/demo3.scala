
//scala既面向对象也面向过程，函数可以不依赖对象
object demo3 {
  //简单的函数实例
  def sayhello(name: String, age: Int): Unit = {
    if (age >= 18) {
      printf("%s,you are %d years old,you are a adult", name, age)
    } else {
      printf("%s,you are %d years old,you are not a adult", name, age)
    }
    println()
  }
  //递归函数
  def fab(n: Int): Int = {
    if (n <= 2) 1
    else fab(n - 1) + fab(n - 2)
  }
  def print_fab(n: Int) {
    var fabValues = fab(n)
    printf("fab values is %d,when n = %d", fabValues, n)
    println()
  }
  //默认参数;java默认参数不是很支持;带名参数
  def decorate(str: String, left: String = "[", right: String = "]") =
    println(left + str + right)
  //变长参数
    def sum(nums:Int*):Int={
    var result=0
    for(i<-nums){
      result+=i
    }
      result
  }
  //使用递归函数实现累加
  def sum2(nums:Int*):Int={
    if(nums.length==0)0
    else nums.head+sum2(nums.tail:_*)
  }
  
  

  def main(args: Array[String]): Unit = {
    sayhello("kehua", 18)
    print_fab(10)
    print_fab(9)
    print_fab(8)
    decorate("ds", "asa", "assasa")
    println(sum(1,2,4,5,6,7))
    println(sum2(1 to 5:_*))

  }
}
