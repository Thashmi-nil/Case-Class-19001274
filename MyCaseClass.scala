object MyCaseClass extends App{
    val p1 = Point(5,2)
    val p2 = Point(3,4)

    val p3 = p1+p2
    val p4 = p1.move(4,1)
    val p5 = p1.distance(p2)
    val p6 = p1.invert()

    println("------------------------------------------------")
    println("> Addition of "+p1+" + "+p2+"      : "+p3)
    println("> Move "+p1+" by a distance 4 and 1    : "+p4)
    println("> Distance between "+p1+" & "+p2+" : "+p5)
    println("> Invert coordinates of "+p1+"         : " +p6)
    println("------------------------------------------------")
}

case class Point(x:Int,y:Int){

    def +(that:Point)=Point(this.x+that.x, this.y+that.y)

    def move(dx:Int,dy:Int)=Point(this.x+dx, this.y+dy)

    def distance(that:Point)=Point(this.x-that.x, this.y-that.y)

    def invert()=Point(this.y,this.x)
}