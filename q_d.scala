object q1 {

  case class point(a:Int,b:Int){
    def x : Int=a
    def y : Int=b

    def switch() =(y,x)
  }

  def main(args: Array[String]): Unit ={

    val p=point(14,21)
    val result=p.switch()
    println(result)
  }
}