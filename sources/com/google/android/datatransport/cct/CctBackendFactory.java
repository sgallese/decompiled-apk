package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import j6.h;
import j6.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements j6.d {
    @Override // j6.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
