import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import com.fasterxml.jackson.module.scala.ClassTagExtensions
import com.fasterxml.jackson.core.`type`.TypeReference

object writer{
    def createNeededDir(filePath:os.Path, fileName: String)={
        if(!(os.exists(filePath / fileName)))
            os.makeDir(filePath / fileName)
    }
    private val mapper =
    new YAMLMapper() with ClassTagExtensions
    mapper.registerModule(DefaultScalaModule)

    def searlize(filePath:os.Path, fileName: String, obj:Object ): Unit =
        val out = os.write.outputStream(filePath / fileName)
        mapper.writeValue(out, obj)
        out.close()
    def desearlize(filePath:os.Path, fileName: String): Any =
        val in =os.read.inputStream(filePath / fileName)
        val retObject =  mapper.readValue(in)
        in.close()
        return retObject
    def delete(filePath:os.Path, fileName:String):Unit =
        os.remove.all(filePath / fileName)
}