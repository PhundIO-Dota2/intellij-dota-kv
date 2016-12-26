// This is a generated file. Not intended for manual editing.
package com.solonarv.intellij.dotakv.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.solonarv.intellij.dotakv.psi.impl.*;

public interface DotaKVTypes {

  IElementType KEY = new DotaKVElementType("KEY");
  IElementType KEYVAL = new DotaKVElementType("KEYVAL");
  IElementType KEYVAL_OBJ = new DotaKVElementType("KEYVAL_OBJ");
  IElementType KEYVAL_SIMPLE = new DotaKVElementType("KEYVAL_SIMPLE");
  IElementType OBJ = new DotaKVElementType("OBJ");
  IElementType VAL = new DotaKVElementType("VAL");


  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == KEY) {
        return new DotaKVKeyImpl(node);
      }
      else if (type == KEYVAL) {
        return new DotaKVKeyvalImpl(node);
      }
      else if (type == KEYVAL_OBJ) {
        return new DotaKVKeyvalObjImpl(node);
      }
      else if (type == KEYVAL_SIMPLE) {
        return new DotaKVKeyvalSimpleImpl(node);
      }
      else if (type == OBJ) {
        return new DotaKVObjImpl(node);
      }
      else if (type == VAL) {
        return new DotaKVValImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
