 sealed class Directory(dir:String) {
  /*case class FolderName(foldername:Int) extends Directory
  case class FileName(fileNmae:List[String]) extends Directory*/
   class FolderNmae(folderNmae: FolderNmae)
   def folderName(f:Int)={}

  def givenFolder(d:String,l:List[Int]) = d match {
    case "Home/ScalaTest/1"=> givenFolder(println(d))

  }
}


 object Main extends App {
   val folders: Array[Directory] = (new Directory("/Home/ScalaTest")).listFiles.filter(_.isDirectory)
   folders.foreach(println)

 }
 