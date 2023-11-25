package qd;

import td.x;

/* compiled from: Bracket.java */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final x f21699a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21700b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21701c;

    /* renamed from: d  reason: collision with root package name */
    public final e f21702d;

    /* renamed from: e  reason: collision with root package name */
    public final f f21703e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21704f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21705g = false;

    private e(x xVar, int i10, e eVar, f fVar, boolean z10) {
        this.f21699a = xVar;
        this.f21700b = i10;
        this.f21701c = z10;
        this.f21702d = eVar;
        this.f21703e = fVar;
    }

    public static e a(x xVar, int i10, e eVar, f fVar) {
        return new e(xVar, i10, eVar, fVar, true);
    }

    public static e b(x xVar, int i10, e eVar, f fVar) {
        return new e(xVar, i10, eVar, fVar, false);
    }
}
