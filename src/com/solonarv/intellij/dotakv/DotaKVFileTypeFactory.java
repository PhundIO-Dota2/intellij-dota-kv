package com.solonarv.intellij.dotakv;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Solonarv on 12/26/2016.
 */
public class DotaKVFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer){
        consumer.consume(DotaKVFileType.INSTANCE, "dotakv");
        consumer.consume(DotaKVFileType.INSTANCE, "txt");
    }
}
