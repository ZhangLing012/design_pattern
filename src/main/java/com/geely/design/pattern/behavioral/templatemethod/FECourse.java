package com.geely.design.pattern.behavioral.templatemethod;

/**
 * 前端课程
 * vue  react angular 可能写手记 可能不写
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;
    // 开放给应用层test决定
    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
