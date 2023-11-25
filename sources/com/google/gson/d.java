package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes3.dex */
public abstract class d implements com.google.gson.e {
    private static final /* synthetic */ d[] $VALUES;
    public static final d IDENTITY;
    public static final d LOWER_CASE_WITH_DASHES;
    public static final d LOWER_CASE_WITH_DOTS;
    public static final d LOWER_CASE_WITH_UNDERSCORES;
    public static final d UPPER_CAMEL_CASE;
    public static final d UPPER_CAMEL_CASE_WITH_SPACES;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: classes3.dex */
    enum a extends d {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.d, com.google.gson.e
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        d dVar = new d("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.d.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d, com.google.gson.e
            public String translateName(Field field) {
                return d.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = dVar;
        d dVar2 = new d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.d.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d, com.google.gson.e
            public String translateName(Field field) {
                return d.upperCaseFirstLetter(d.separateCamelCase(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = dVar2;
        d dVar3 = new d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.d.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d, com.google.gson.e
            public String translateName(Field field) {
                return d.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = dVar3;
        d dVar4 = new d("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.d.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d, com.google.gson.e
            public String translateName(Field field) {
                return d.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = dVar4;
        d dVar5 = new d("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.d.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d, com.google.gson.e
            public String translateName(Field field) {
                return d.separateCamelCase(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = dVar5;
        $VALUES = new d[]{aVar, dVar, dVar2, dVar3, dVar4, dVar5};
    }

    private d(String str, int i10) {
    }

    private static String modifyString(char c10, String str, int i10) {
        if (i10 < str.length()) {
            return c10 + str.substring(i10);
        }
        return String.valueOf(c10);
    }

    static String separateCamelCase(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String upperCaseFirstLetter(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb2.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (!Character.isUpperCase(charAt)) {
            sb2.append(modifyString(Character.toUpperCase(charAt), str, i10 + 1));
            return sb2.toString();
        }
        return str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // com.google.gson.e
    public abstract /* synthetic */ String translateName(Field field);

    /* synthetic */ d(String str, int i10, a aVar) {
        this(str, i10);
    }
}
