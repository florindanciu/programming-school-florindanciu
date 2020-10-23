package com.programing_school;

public enum Module {

    PROGRAMING_BASICS(Language.PYTHON),
    WEB(Language.WEB),
    OOP(Language.JAVA_SE),
    ADVANCED(Language.JAVA_EE);

    private final Language language;

    Module(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }
}
