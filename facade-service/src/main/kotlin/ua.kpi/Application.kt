package ua.kpi

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("ua.kpi")
            .start()
}

