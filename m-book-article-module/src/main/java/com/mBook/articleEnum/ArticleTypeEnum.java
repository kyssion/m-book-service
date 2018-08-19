package com.mBook.articleEnum;

public enum  ArticleTypeEnum {
    BLOWEBSIE("博客网站",1),NEWSWEBSTIE("新闻网站",2),SHOPPINGWEBSITE("购物网站",3),SOCIALWEBSITE("社交网站",4),ORTHERWEBSITE("其他网站",100),USERUPDATE("用户上传",5);
    private String TypeName;
    private int index;
    ArticleTypeEnum(String typeName,int index){
        this.TypeName=typeName;
        this.index= index;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArticleTypeEnum getEnumByIndex(int index){
        for (ArticleTypeEnum artocleTypeEnum:values()){
            if (artocleTypeEnum.getIndex()==index){
                return artocleTypeEnum;
            }
        }
        return ArticleTypeEnum.ORTHERWEBSITE;
    }
}
