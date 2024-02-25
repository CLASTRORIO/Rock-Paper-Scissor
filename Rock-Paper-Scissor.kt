fun main() {
    var computerChoice = ""
    var playerChoice = ""

    while (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissor") {
        val randomNumber = (1..3).random()

        when(randomNumber){
            1 -> computerChoice = "Rock"
            2 -> computerChoice = "Paper"
            3 -> computerChoice = "Scissor"
        }
        println("Option -- > Rock, Paper, Scissor.\nEnter your choice: ")
        playerChoice = readln().lowercase()
        playerChoice = playerChoice.replaceFirstChar { it.uppercase() }
        if (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissor") { continue }
        println("Player Choice = $playerChoice")

        println("Computer Choice = $computerChoice")
        val winner = when{
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
            playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            else -> "Computer"
        }
        when(winner) {
            "Tie" -> println("$winner!!")
            else -> println("$winner won!!")
        }
    }
}
