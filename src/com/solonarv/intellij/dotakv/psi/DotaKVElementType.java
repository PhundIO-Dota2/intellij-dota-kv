package com.solonarv.intellij.dotakv.psi;

import com.intellij.psi.tree.IElementType;
import com.solonarv.intellij.dotakv.DotaKV;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Solonarv on 12/26/2016.
 */
public class DotaKVElementType extends IElementType {
    public DotaKVElementType(@NotNull @NonNls String debugName){
        super(debugName, DotaKV.INSTANCE);
    }
}
