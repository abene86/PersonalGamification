import java.util.Calendar

case class Item(
    name: String,
    description: String,
    affect: Int,
    lifetime: Calendar
):
    def string: String
        s""" ---Items---
        |       O
        |0{XXXX}+====================>
        |       O
        | Name : $name
        | description: $description
        | affect: $affect
        | lifetime : $lifetime
        -------------------------
        """.stripMargin
