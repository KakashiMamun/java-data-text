package com.github.chen0040.data.text;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * Created by xschen on 11/4/15.
 */
@Getter
@Setter
public class VocabularyTableCell implements Serializable {
    private static final long serialVersionUID = 2293350262940297176L;
    private String word;
    private int wordIndex;
    private int count;
    private double topicSpecificity;
}
