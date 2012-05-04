object QuickSort {
  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs filter (pivot >)),
            xs filter (pivot ==),
        sort(xs filter (pivot <))
      )
    }
  }

  def main(args: Array[String]) {
    val sample1 = Array(2,3,5,89,7,767,6)
    val sample2 = Array(10,6,7,2,8,0)
    
    val result1 = sort(sample1)
    val result2 = sort(sample2)

    println("orig" + sample1.mkString("[", ",", "]") + "-->result" + result1.mkString("[",",", "]"))
    println("orig" + sample2.mkString("[", ",", "]") + "-->result" + result2.mkString("[",",", "]"))


  }
}
