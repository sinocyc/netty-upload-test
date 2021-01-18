package com.sinocyc.netty.upload.test;

import java.io.File;
import java.io.Serializable;

/**
 * 文件上传对象
 *
 * @author Cui Yicheng
 * @date 2021-01-17
 */
public class FileUploadFile implements Serializable {

    private File file;
    private String file_md5;
    private int startPos;
    private byte[] bytes;
    private int endPos;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFile_md5() {
        return file_md5;
    }

    public void setFile_md5(String file_md5) {
        this.file_md5 = file_md5;
    }

    public int getStartPos() {
        return startPos;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public int getEndPos() {
        return endPos;
    }

    public void setEndPos(int endPos) {
        this.endPos = endPos;
    }
}
