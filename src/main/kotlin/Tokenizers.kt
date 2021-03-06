package com.github

import com.kennycason.kumo.nlp.tokenizer.api.WordTokenizer
import com.kennycason.kumo.nlp.tokenizers.ChineseWordTokenizer

enum class Tokenizers(val instance: WordTokenizer){
    JIEBA(JieBaTokenizer()),
    KUMO(ChineseWordTokenizer())
}