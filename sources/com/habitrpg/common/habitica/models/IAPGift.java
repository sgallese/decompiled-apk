package com.habitrpg.common.habitica.models;

import qc.h;

/* compiled from: IAPGift.kt */
/* loaded from: classes4.dex */
public final class IAPGift {
    private String uuid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IAPGift() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.common.habitica.models.IAPGift.<init>():void");
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public IAPGift(String str) {
        this.uuid = str;
    }

    public /* synthetic */ IAPGift(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
