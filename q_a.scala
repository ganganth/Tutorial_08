object q1 {

  case class point(a:Int,b:Int){
    def x : Int=a
    def y : Int=b

    def add(r: point) =(x + r.x, y + r.y)
  }
  def main(args: Array[String]): Unit ={

    val p=point(10,2)
    val q=point(2,40)
    val sum=p.add(q)
    println(sum)

    
  }
}