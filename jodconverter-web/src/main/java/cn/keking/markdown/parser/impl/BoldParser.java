package cn.keking.markdown.parser.impl;

import cn.keking.markdown.mark.MARK;

public class BoldParser extends AbstractWithEndTagParser {
    @Override
    public MARK mark() {
        return MARK.BOLD;
    }
}
