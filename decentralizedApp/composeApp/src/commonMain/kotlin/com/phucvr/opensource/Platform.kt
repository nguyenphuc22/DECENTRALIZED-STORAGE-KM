package com.phucvr.opensource

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform