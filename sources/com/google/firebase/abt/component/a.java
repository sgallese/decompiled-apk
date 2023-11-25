package com.google.firebase.abt.component;

import android.content.Context;
import g8.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbtComponent.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f11253a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f11254b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.b<i8.a> f11255c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, i9.b<i8.a> bVar) {
        this.f11254b = context;
        this.f11255c = bVar;
    }

    protected b a(String str) {
        return new b(this.f11254b, this.f11255c, str);
    }

    public synchronized b b(String str) {
        if (!this.f11253a.containsKey(str)) {
            this.f11253a.put(str, a(str));
        }
        return this.f11253a.get(str);
    }
}
