package org.racket.lang.core

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object RacketIcons {
    // Racket logo
    val RACKET = getIcon("/icons/racket-logo.svg")

    // File icon (Scaled down Racket logo)
    val RACKET_FILE = getIcon("/icons/racket-file.svg")

    /**
     * Helper function to load icons from filesystem.
     * @param path  Path to the icon on the filesystem.*/
    private fun getIcon(path: String): Icon = IconLoader.getIcon(path, RacketIcons::class.java)
}
