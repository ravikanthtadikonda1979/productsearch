package com.amazon.productsearch;

public class Form {
    private String Sort;
    private String operation;
    private String KeyWords;
    private String SearchIndex;
    private String Timestamp;

    public String getOperation() {
        return operation;
    }

    public void setOperation(final String operation) {
        this.operation = operation;
    }

    public String getSort() {
        return Sort;
    }

    public void setSort(final String sort) {
        Sort = sort;
    }

    public String getKeyWords() {
        return KeyWords;
    }

    public void setKeyWords(final String keyWords) {
        KeyWords = keyWords;
    }

    public String getSearchIndex() {
        return SearchIndex;
    }

    public void setSearchIndex(final String searchIndex) {
        SearchIndex = searchIndex;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(final String timestamp) {
        Timestamp = timestamp;
    }
}
