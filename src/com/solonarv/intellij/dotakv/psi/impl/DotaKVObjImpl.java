// This is a generated file. Not intended for manual editing.
package com.solonarv.intellij.dotakv.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.solonarv.intellij.dotakv.psi.DotaKVTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.solonarv.intellij.dotakv.psi.*;

public class DotaKVObjImpl extends ASTWrapperPsiElement implements DotaKVObj {

  public DotaKVObjImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DotaKVVisitor visitor) {
    visitor.visitObj(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DotaKVVisitor) accept((DotaKVVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DotaKVKeyval> getKeyvalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DotaKVKeyval.class);
  }

}
