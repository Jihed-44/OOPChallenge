fun main() {
val inp = "qd1"
    if (inp[0]=='q'){
        Queen().piecePosition(inp[1].toString(),inp[2].toString())
    }
    if (inp[0]=='r'){
        Rook().piecePosition(inp[1].toString(),inp[2].toString())
    }
    if (inp[0].toString()=="kn"){
        Knight().piecePosition(inp[1].toString(),inp[2].toString())
    }
    if (inp[0]=='k'){
        King().piecePosition(inp[1].toString(),inp[2].toString())
    }
    if (inp[0]=='b'){
        Bishop().piecePosition(inp[1].toString(),inp[2].toString())
    }
}

interface Pieces {
    fun movePiece(name : String,file: String, rank: String)
    fun piecePosition(file: String, rank: String)
}

open class Queen(
    var name: String="Queen",
    var file: String="",
    var rank: String=""
) : Pieces{

    override fun movePiece(name : String,file: String, rank: String) {
        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")
    }

    override fun piecePosition(file: String, rank: String) {
        println("$name file: $file rank : $rank")
    }
}

open class Rook(
    var name: String="Rook",
    var file: String="",
    var rank: String=""
) : Pieces{

    override fun movePiece(name : String,file: String, rank: String) {
        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")
    }

    override fun piecePosition(file: String, rank: String) {
        println("$name file :${this.file} rank :${this.rank}")
    }
}

open class Knight(
    var name: String="Knight",
    var file: String="",
    var rank: String=""

) : Pieces{
    override fun movePiece(name : String,file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")
    }

    override fun piecePosition(file: String, rank: String) {
        println("$name file :${this.file} rank :${this.rank}")
    }
}

open class King(
    var name: String="King",
    var file: String="",
    var rank: String=""

) : Pieces{
    override fun movePiece(name : String,file: String, rank: String) {

        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")
    }

    override fun piecePosition(file: String, rank: String) {
        println("$name file :${this.file} rank :${this.rank}")
    }
}

open class Bishop(
    var name: String="Bishop",
    var file: String="",
    var rank: String="",

) : Pieces{
    override fun movePiece(name : String,file: String, rank: String) {
        this.file =file
        this.rank=rank
        println("${this.name}${this.file}${this.rank}")
    }

    override fun piecePosition(file: String, rank: String) {
        println("$name file :${this.file} rank :${this.rank}")
    }
}