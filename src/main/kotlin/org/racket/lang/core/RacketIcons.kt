package org.racket.lang.core

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

/**
 * Racket plugin icons.
 */
object RacketIcons {
    // Logos
    val RACKET = getIcon("/icons/racket/racket.svg")

    // File types
    val RACKET_FILE = getIcon("/icons/racket-file.svg")

    /**
     * Helper function to load icons from the filesystem.
     * @param path  Path to the icon on the filesystem.
     * */
    private fun getIcon(path: String): Icon = IconLoader.getIcon(path, RacketIcons::class.java)
}
