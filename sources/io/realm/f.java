package io.realm;

/* compiled from: Case.java */
/* loaded from: classes4.dex */
public enum f {
    SENSITIVE(true),
    INSENSITIVE(false);

    private final boolean value;

    f(boolean z10) {
        this.value = z10;
    }

    public boolean getValue() {
        return this.value;
    }
}
