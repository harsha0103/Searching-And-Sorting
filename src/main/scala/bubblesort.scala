object bubblesort {

  /* initial testing of bubble sort  with time complexity of O(n2)*/

  def main(args: Array[String]): Unit = {

    //declaring a list
    var initailarray = Array(3,2,31,1,5,10,4)
    var a=0

    bubblesortasc(initailarray).foreach(println)

  }


  def bubblesortasc( unsort:Array[Int]):Array[Int]={
    var temp =0
    //Writing 2 for loops in to one used only in scala
    // time complex is O(n2)
    for(i <- 1 to unsort.length-1;j<- i-1 to 0 by -1){
        if(unsort(j)>unsort(j+1))
        {
          temp=unsort(j)
          unsort(j)=unsort(j+1)
          unsort(j+1)=temp
        }
    }
    unsort
  }

}
