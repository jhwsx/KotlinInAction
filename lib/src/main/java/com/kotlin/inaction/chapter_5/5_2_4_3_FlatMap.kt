package com.kotlin.inaction.chapter_5


/**
 *
 *
 * @author wangzhichao
 * @date 20-9-18
 */
class Card private constructor(val suit: String, val value: String) {

    override fun toString(): String {
        return "$suit $value"
    }

    companion object {
        val SUITS = setOf("♣" /* clubs*/, "♦" /* diamonds*/, "♥" /* hearts*/, "♠" /*spades*/)
        val VALUES = setOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")
        val DECK: List<Card> = SUITS.flatMap { suit ->
            VALUES.map { value -> Card(suit, value) }
        }
    }
}

fun main() {
    println(Card.DECK)
}