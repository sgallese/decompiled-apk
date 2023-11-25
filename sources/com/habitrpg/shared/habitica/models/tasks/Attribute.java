package com.habitrpg.shared.habitica.models.tasks;

import jc.a;
import jc.b;
import qc.h;
import qc.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Attribute.kt */
/* loaded from: classes4.dex */
public final class Attribute {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Attribute[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final Attribute STRENGTH = new Attribute("STRENGTH", 0, "str");
    public static final Attribute INTELLIGENCE = new Attribute("INTELLIGENCE", 1, "int");
    public static final Attribute CONSTITUTION = new Attribute("CONSTITUTION", 2, "con");
    public static final Attribute PERCEPTION = new Attribute("PERCEPTION", 3, "per");

    /* compiled from: Attribute.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Attribute from(String str) {
            for (Attribute attribute : Attribute.values()) {
                if (q.d(attribute.getValue(), str)) {
                    return attribute;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ Attribute[] $values() {
        return new Attribute[]{STRENGTH, INTELLIGENCE, CONSTITUTION, PERCEPTION};
    }

    static {
        Attribute[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private Attribute(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a<Attribute> getEntries() {
        return $ENTRIES;
    }

    public static Attribute valueOf(String str) {
        return (Attribute) Enum.valueOf(Attribute.class, str);
    }

    public static Attribute[] values() {
        return (Attribute[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
