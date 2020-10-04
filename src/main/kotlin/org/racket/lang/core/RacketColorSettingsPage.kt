package org.racket.lang.core

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class RacketColorSettingsPage : ColorSettingsPage {
    override fun getIcon(): Icon? {
        return RacketIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return RacketSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """#lang racket/base
;; This is a comment
()
(define (a-thing a [b 3] #:c [c 8])
  (list 42 #t #f #true #false "hello world" #"\x00" 'fixme))
`(a b ,(a-thing 42))  
"""
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Racket"
    }

    companion object {
        val DESCRIPTORS = arrayOf(
                AttributesDescriptor("Identifier", RacketSyntaxHighlighter.IDENTIFIER),
                AttributesDescriptor("Keyword", RacketSyntaxHighlighter.KEYWORD),
                AttributesDescriptor("Comment", RacketSyntaxHighlighter.COMMENT),
                AttributesDescriptor("String", RacketSyntaxHighlighter.STRING),
                AttributesDescriptor("Constant", RacketSyntaxHighlighter.CONSTANT),
                AttributesDescriptor("Unquote", RacketSyntaxHighlighter.UNQUOTE),
                AttributesDescriptor("Number", RacketSyntaxHighlighter.NUMBER),
                AttributesDescriptor("Boolean", RacketSyntaxHighlighter.BOOLEAN),
                AttributesDescriptor("Parentheses", RacketSyntaxHighlighter.PARENTHESES))
    }
}
