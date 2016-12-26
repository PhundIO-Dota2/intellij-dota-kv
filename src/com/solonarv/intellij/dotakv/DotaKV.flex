package com.simpleplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.solonarv.intellij.dotakv.psi.DotaKVTypes;
import com.intellij.psi.TokenType;

%%
%class DotaKVLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

CRLF = \R
WHITE_SPACE = [\ \t\f]
STRING_SEP = "\""
BLOCK_START = "{"
BLOCK_END = "}"

EOL_COMMENT = "//"[^\r\n]

%state building_key
%state awaiting_value
%state building_value
%state building_block

%%

<YYINITIAL> {EOL_COMMENT}           {yybegin(YYINITIAL); return DotaKVTypes.COMMENT }
