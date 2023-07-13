package com.vadimko.translator_kmm.translate.domain.history

import com.vadimko.translator_kmm.core.domain.language.Language

data class HistoryItem(
    val id: Long?,
    val fromLanguageCode: String,
    val fromText: String,
    val toLanguageCode: String,
    val toText: String,
)
