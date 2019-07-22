import java.io.File

trait Fetcher{
  def contentsOfDirectory(dir:String)
}
class ContentFetcher extends Fetcher {

  def contentsOfDirectory(dir:String):List[File]={
    val f=new File(dir)
    if(f.exists && f.isDirectory){
      f.listFiles.filter(_.isFile).toList
    }

    else{
      List[File]()
    }
  }

}

object ContentFetcher extends App{
  val  f = new ContentFetcher
  println (f.contentsOfDirectory("Home/Documents/givenfolder"))
}
