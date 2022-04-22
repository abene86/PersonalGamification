case class Monster(
    name: String,
    description: String,
    toughness: Int
):
    def string: String
        s"""" ᕙ༼ ,,ԾܫԾ,, ༽ᕗ 
        --Monster--
        | Name :  $name
        | description : $description
        | toughness : $toughness
        ----------------------
        """
