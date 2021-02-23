package com.example.android.kt.swings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.awt.EventQueue
import javax.swing.JFrame

class KotlinSwingSimpleEx(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(300, 200)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {

    val frame = KotlinSwingSimpleEx("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}