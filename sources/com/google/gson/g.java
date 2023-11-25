package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GsonBuilder.java */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: h  reason: collision with root package name */
    private String f12112h;

    /* renamed from: a  reason: collision with root package name */
    private Excluder f12105a = Excluder.f12122t;

    /* renamed from: b  reason: collision with root package name */
    private r f12106b = r.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private e f12107c = d.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, h<?>> f12108d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<t> f12109e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<t> f12110f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f12111g = false;

    /* renamed from: i  reason: collision with root package name */
    private int f12113i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f12114j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12115k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12116l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12117m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12118n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12119o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12120p = false;

    private void a(String str, int i10, int i11, List<t> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a(Date.class, str);
            aVar2 = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else if (i10 != 2 && i11 != 2) {
            a aVar4 = new a(Date.class, i10, i11);
            a aVar5 = new a(Timestamp.class, i10, i11);
            a aVar6 = new a(java.sql.Date.class, i10, i11);
            aVar = aVar4;
            aVar2 = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(TypeAdapters.b(Date.class, aVar));
        list.add(TypeAdapters.b(Timestamp.class, aVar2));
        list.add(TypeAdapters.b(java.sql.Date.class, aVar3));
    }

    public f b() {
        List<t> arrayList = new ArrayList<>(this.f12109e.size() + this.f12110f.size() + 3);
        arrayList.addAll(this.f12109e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f12110f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f12112h, this.f12113i, this.f12114j, arrayList);
        return new f(this.f12105a, this.f12107c, this.f12108d, this.f12111g, this.f12115k, this.f12119o, this.f12117m, this.f12118n, this.f12120p, this.f12116l, this.f12106b, this.f12112h, this.f12113i, this.f12114j, this.f12109e, this.f12110f, arrayList);
    }

    public g c(Type type, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof q;
        if (!z11 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof s)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ga.a.a(z10);
        if (obj instanceof h) {
            this.f12108d.put(type, (h) obj);
        }
        if (z11 || (obj instanceof k)) {
            this.f12109e.add(TreeTypeAdapter.b(TypeToken.get(type), obj));
        }
        if (obj instanceof s) {
            this.f12109e.add(TypeAdapters.a(TypeToken.get(type), (s) obj));
        }
        return this;
    }

    public g d() {
        this.f12111g = true;
        return this;
    }

    public g e(String str) {
        this.f12112h = str;
        return this;
    }
}
