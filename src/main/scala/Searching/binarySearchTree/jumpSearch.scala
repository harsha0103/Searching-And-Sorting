package searching.binarySearchTree
import scala.util.control.Breaks._
object jumpSearch {
  def main(args: Array[String]): Unit = {
    var initailarray = Array(1, 2, 3, 4, 5, 6, 7, 7, 8)
    var number = 8
    var arraylen = initailarray.length
    var result = jumpSearchAlg(initailarray, arraylen, number)

    if (result == -1) {
      println("element doesn't exist")
    }
    else {
      println("Index of the " + number + " = " + result)
    }
  }

  def jumpSearchAlg(array: Array[Int], arraylen: Int, number: Int): Int = {
    var jumping = math.sqrt(arraylen).toInt
    var lower = 0
    var multfact = arraylen / jumping
    var index = -1
    //    //    finding the block where the number is present last fucking
    //    if (arraylen != multfact * jumping) {
    //      if (array(arraylen - 1) >= number) {
    //        lower = multfact * jumping
    //        index = arraylen - 1
    //      }
    //    }
    if(array(arraylen-1) >= number ){
      index=arraylen-1
      lower = index-jumping
    }

    for (i <-  arraylen-1 to 0 by -jumping) {


        if (array(i) >= number) {
          index = i
          lower = index-jumping


        }

    }
      if (index == -1) {
        return index
      }
    if (lower<0){
      lower=0
    }
      for (i <- lower to index) {
        if (array(i) == number) {
          return i

        }
      }
      return -1
  }


  def tempIndex(array:Array[Int]):Int={

    return -1
  }

}




