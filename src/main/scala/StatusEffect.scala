import java.util.Calendar

case class StatusEffect(
    name: String,
    description: String,
    affect: Int,
    lifetime: Calendar
):
    def string: String
        s"""------Status (@ _ ^) Effects------"
        |Name : $name
        |Description : $description
        |Affect : $affect
        |lifeTime : $lifetime 
        """
