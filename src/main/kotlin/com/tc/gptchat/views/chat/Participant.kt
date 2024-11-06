package com.tc.gptchat.views.chat

enum class Participant(val displayName: String, val avatarUrl: String) {
    SYSTEM("Path Buddy", "path-buddy.png"),
    USER("Explorer", "explorer.png")
}