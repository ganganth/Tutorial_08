object q1 {

  case class point(a:Int,b:Int){
    def x : Int=a
    def y : Int=b

    def dis(d :Int) =(x+d,y+d)
  }
  def main(args: Array[String]): Unit ={

    val p=point(10,2)
    val dist=p.dis(45)
    println(dist)
  }
}