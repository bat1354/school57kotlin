package musicApp

class Playlist (val title: String){
    private val songs = mutableListOf<Song>()
    fun addSong(song: Song){
        songs.add(song)
        println("Песня добавлена")
    }
    fun removeSong(song: Song){
        if(songs.remove(song)){
            println("Песня ${song.name} удалена из плейлиста $title")
        } else {
            println("Песня под таким названием не найдена в плейлисте $title")
        }
    }
    fun showPlaylist(){
        if(songs.isEmpty()){
            println("Плейлист $title пуст")
        }
        else{
            println("Плейлист $title :")
           for ((index, song) in songs.withIndex()) {
               println("${index + 1}. ${song.name} - ${song.artist}")
           }

        }
    }
}