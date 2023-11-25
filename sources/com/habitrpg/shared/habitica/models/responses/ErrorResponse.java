package com.habitrpg.shared.habitica.models.responses;

import java.util.List;
import yc.v;

/* compiled from: ErrorResponse.kt */
/* loaded from: classes4.dex */
public final class ErrorResponse {
    private List<HabiticaError> errors;
    private String message;

    public final String getDisplayMessage() {
        boolean z10;
        HabiticaError habiticaError;
        String message;
        boolean u10;
        boolean z11 = false;
        if (this.errors != null && (!r0.isEmpty()) == true) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            List<HabiticaError> list = this.errors;
            if (list != null) {
                habiticaError = list.get(0);
            } else {
                habiticaError = null;
            }
            if (habiticaError != null && (message = habiticaError.getMessage()) != null) {
                u10 = v.u(message);
                if ((!u10) == true) {
                    z11 = true;
                }
            }
            if (z11) {
                String message2 = habiticaError.getMessage();
                if (message2 == null) {
                    return "";
                }
                return message2;
            }
        }
        String str = this.message;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<HabiticaError> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setErrors(List<HabiticaError> list) {
        this.errors = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
