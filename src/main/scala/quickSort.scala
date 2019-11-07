object quickSort {
  //Avg time complexity is O(n log(n)) and worst case is O(n2)
  // If implemented well quick sort works 2 to 3 times faster than  merge sort and heap sort
  //here is a quick sort link
  // https://javarevisited.blogspot.com/2014/08/quicksort-sorting-algorithm-in-java-in-place-example.html
  def main(args: Array[String]): Unit = {
    //declaring a Array
    var initailarray = Array(3,2,2,1,31,5,10,4)

    quickSortAsc(initailarray).foreach(println)

  }

//Solved using recursion
  def quickSortAsc( unsort:Array[Int]):Array[Int]={
    var pivot=unsort.length/2
    if (unsort.length<2){
    unsort
    }

    else if(unsort.length ==2){
      if(unsort(pivot-1)>unsort(pivot))
        {
          var temp= 0
          temp=unsort(pivot-1)
          unsort(pivot-1)=unsort(pivot)
          unsort(pivot)=temp
        }

       unsort
    }


    else
      {
        var piv= unsort(pivot)
        Array.concat(
          quickSortAsc(unsort.filter(_ < piv)),
         // quickSortAsc(unsort.filter (_ == piv)), another process
          unsort.filter (_ == piv),
          quickSortAsc(unsort.filter( _ > piv )))

      }
  }

  }
