package musicApp

class MusicApp {
    private val library = mutableListOf<Song>()
    private val history = mutableListOf<Song>()

    fun addSongToLibrary(song: Song){
        library.add(song)
    }

    fun playSong(title: String){
        val songToPlay = library.find { it.name == title }
        if (songToPlay != null){
            println("Сейчас играет: ${songToPlay.name } - ${songToPlay.artist}")
        }
        else{
            println("Песня под таким названием не найдена")
        }
    }
    fun showHistory(){
        if (history.isEmpty()){
            println("Вы ещё ничего не слушали, ваша история пуста")
        }
        else{
            println("История прослушивания")
            for ((index, song) in history.withIndex()) {
                println("${index + 1}. ${song.name} - ${song.artist}")
            }
        }
    }
    fun clearHistory(){
        history.clear()
        println("История очищена")
    }
}