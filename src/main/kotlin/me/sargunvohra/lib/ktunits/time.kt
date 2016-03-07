package me.sargunvohra.lib.ktunits

val Long.nanoseconds: TimeValue
    get() = TimeValue(this)

val Long.milliseconds: TimeValue
    get() = (this * 1000000).nanoseconds

val Long.seconds: TimeValue
    get() = (this * 1000).milliseconds

val Long.minutes: TimeValue
    get() = (this * 60).seconds

val Long.hours: TimeValue
    get() = (this * 60).minutes

val Long.days: TimeValue
    get() = (this * 24).hours

val Int.nanoseconds: TimeValue
    get() = toLong().nanoseconds

val Int.milliseconds: TimeValue
    get() = toLong().milliseconds

val Int.seconds: TimeValue
    get() = toLong().seconds

val Int.minutes: TimeValue
    get() = toLong().minutes

val Int.hours: TimeValue
    get() = toLong().hours

val Int.days: TimeValue
    get() = toLong().days

data class TimeValue internal constructor(internal val ns: Long) {
    val toNanoseconds = ns
    val toMilliseconds = toNanoseconds / 1000000
    val toSeconds = toMilliseconds / 1000
    val toMinutes = toSeconds / 60
    val toHours = toMinutes / 60
    val toDays = toHours / 24
}