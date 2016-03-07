import scala.io._
import spray.json._

/**
  * Created by ryonext on 2016/02/08.
  */
object Fetcher {
  def main(args:Array[String]) = {
    val apiKey = sys.env("GOOGLE_API_KEY")
    val engineId = sys.env("SEARCH_ENGINE_ID")
    val query = "寿司"
    val url = "https://www.googleapis.com/customsearch/v1?key=" + apiKey + "&cx=" + engineId + "&q=" + query

    val source = Source.fromURL(url)
    println(source.getLines().mkString)
    //val result = JSON.parseRaw(source.getLines.mkString)

  }
}
