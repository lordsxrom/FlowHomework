package otus.homework.flowcats

sealed class Result<out T> {
    data class Success<out R>(val value: R) : Result<R>()
    data class Error(val message: String?, val throwable: Throwable?) : Result<Nothing>()
}