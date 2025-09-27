package musicApp

fun main(){
    val spotify = MusicApp()
    val song1 = Song("Less than zero", "The Weeknd")
    val song2 = Song("A&W", "Lana Del Rey")
    val song3 = Song("Redecorate", "Twenty One Pilots")
    spotify.addSongToLibrary(song1)
    spotify.addSongToLibrary(song2)
    spotify.addSongToLibrary(song3)
    spotify.playSong("Redecorate")
    spotify.playSong("A&W")
    spotify.playSong("Happier than ever")
    spotify.showHistory()
    val fav = Playlist("Favorite songs")
    fav.addSong(song3)
    fav.addSong(song1)
    fav.addSong(song2)
    fav.removeSong(song2)
    fav.showPlaylist()
    spotify.clearHistory()
}