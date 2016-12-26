package com.solonarv.intellij.dotakv;

import com.intellij.lang.Language;

/**
 * Created by Solonarv on 12/26/2016.
 */
public class DotaKV extends Language {
    public static final DotaKV INSTANCE = new DotaKV();

    private DotaKV(){
        super("Dota KV");
    }
}
