package jp.gr.java_conf.atsushitominaga.drumlessonfragmentver

class MovieLessonModel() {

    var newIcon : Boolean = false       //新着かどうかでがぞうを出す trueならnew画像をだす falseださない
    var titleText : String = ""         //動画のタイトル
    var movieImageUrl : String = ""     //動画のサムネイル画像
    var url : String = ""               //youtube動画のurl

    constructor(newIcon : Boolean, titleText: String, movieImageUrl : String, url :String): this(){
        this.newIcon = newIcon
        this.titleText = titleText
        this.movieImageUrl = movieImageUrl
        this.url = url
    }

}