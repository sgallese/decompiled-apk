package com.habitrpg.shared.habitica.models.responses;

/* compiled from: HabiticaError.kt */
/* loaded from: classes4.dex */
public final class HabiticaError {
    private String message;
    private String param;
    private String value;

    public final String getMessage() {
        return this.message;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setParam(String str) {
        this.param = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
