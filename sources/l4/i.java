package l4;

import android.content.Context;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: e  reason: collision with root package name */
    private static i f19545e;

    /* renamed from: a  reason: collision with root package name */
    private a f19546a;

    /* renamed from: b  reason: collision with root package name */
    private b f19547b;

    /* renamed from: c  reason: collision with root package name */
    private g f19548c;

    /* renamed from: d  reason: collision with root package name */
    private h f19549d;

    private i(Context context, p4.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f19546a = new a(applicationContext, aVar);
        this.f19547b = new b(applicationContext, aVar);
        this.f19548c = new g(applicationContext, aVar);
        this.f19549d = new h(applicationContext, aVar);
    }

    public static synchronized i c(Context context, p4.a aVar) {
        i iVar;
        synchronized (i.class) {
            if (f19545e == null) {
                f19545e = new i(context, aVar);
            }
            iVar = f19545e;
        }
        return iVar;
    }

    public a a() {
        return this.f19546a;
    }

    public b b() {
        return this.f19547b;
    }

    public g d() {
        return this.f19548c;
    }

    public h e() {
        return this.f19549d;
    }
}
