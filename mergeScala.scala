import java.io._
import scala.io.Source


object Merge{

 def main(args: Array[String]) {
        
	var vector_in = List[String]();
        var vector_in_2= List[String]();
        
       val writer = new PrintWriter(new File(args(2)))

        val filesense = Source.fromFile(args(0))
        val fileantisense = Source.fromFile(args(1))


        filesense.getLines.foreach( (line) => {
 		 vector_in = vector_in ::: List(line)
        })      

        fileantisense.getLines.foreach( (line) => {
                //writer.write(line)
                vector_in_2 = vector_in_2 ::: List(line)
        })

         for (i <- 0 to vector_in.length-1){
                  writer.write(vector_in(i))
                  writer.write(vector_in_2(i))
          }
         
        writer.close()
 }
}


