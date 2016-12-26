// This is a generated file. Not intended for manual editing.
package com.solonarv.intellij.dotakv.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.solonarv.intellij.dotakv.psi.DotaKVTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class KVParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == KEY) {
      r = key(b, 0);
    }
    else if (t == KEYVAL) {
      r = keyval(b, 0);
    }
    else if (t == KEYVAL_OBJ) {
      r = keyval_obj(b, 0);
    }
    else if (t == KEYVAL_SIMPLE) {
      r = keyval_simple(b, 0);
    }
    else if (t == OBJ) {
      r = obj(b, 0);
    }
    else if (t == VAL) {
      r = val(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return kvFile(b, l + 1);
  }

  /* ********************************************************** */
  // "\"key\""
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = consumeToken(b, "\"key\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keyval_obj | keyval_simple
  public static boolean keyval(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyval")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYVAL, "<keyval>");
    r = keyval_obj(b, l + 1);
    if (!r) r = keyval_simple(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // key obj
  public static boolean keyval_obj(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyval_obj")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYVAL_OBJ, "<keyval obj>");
    r = key(b, l + 1);
    r = r && obj(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // key val
  public static boolean keyval_simple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyval_simple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYVAL_SIMPLE, "<keyval simple>");
    r = key(b, l + 1);
    r = r && val(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keyval_obj
  static boolean kvFile(PsiBuilder b, int l) {
    return keyval_obj(b, l + 1);
  }

  /* ********************************************************** */
  // "{" keyval* "}"
  public static boolean obj(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obj")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJ, "<obj>");
    r = consumeToken(b, "{");
    r = r && obj_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyval*
  private static boolean obj_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obj_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!keyval(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "obj_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "\"val\""
  public static boolean val(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "val")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAL, "<val>");
    r = consumeToken(b, "\"val\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
