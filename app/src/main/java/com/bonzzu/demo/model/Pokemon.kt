package com.bonzzu.demo.model

data class Pokemon(val name: String, val game_indices: List<GameIndex>)

data class GameIndex(val game_index: Int)
