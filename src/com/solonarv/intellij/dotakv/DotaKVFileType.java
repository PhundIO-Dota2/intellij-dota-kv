package com.solonarv.intellij.dotakv;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

/**
 * Created by Solonarv on 12/26/2016.
 */
public class DotaKVFileType extends LanguageFileType {
    public static final DotaKVFileType INSTANCE = new DotaKVFileType();

    private DotaKVFileType(){
        super(DotaKV.INSTANCE);
    }

    @NotNull
    @Override
    public String getName(){
        return "Dota KV file";
    }

    @NotNull
    @Override
    public String getDescription(){
        return "Dota KV file";
    }

    @NotNull
    @Override
    public String getDefaultExtension(){
        return "txt";
    }

    @NotNull
    @Override
    public Icon getIcon(){
        return DotaKVIcons.FILE;
    }
}
