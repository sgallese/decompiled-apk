package io.noties.markwon.image;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncDrawableLoaderBuilder.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    ExecutorService f17192a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, r> f17193b = new HashMap(3);

    /* renamed from: c  reason: collision with root package name */
    final Map<String, q> f17194c = new HashMap(3);

    /* renamed from: d  reason: collision with root package name */
    q f17195d;

    /* renamed from: e  reason: collision with root package name */
    boolean f17196e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        b(hb.d.c());
        b(lb.a.d());
        if (mb.b.a()) {
            a(mb.a.c());
        }
        if (kb.b.a()) {
            a(kb.a.c());
        }
        this.f17195d = h.c();
    }

    private void d() {
        if (!this.f17196e) {
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }

    void a(q qVar) {
        d();
        Iterator<String> it = qVar.b().iterator();
        while (it.hasNext()) {
            this.f17194c.put(it.next(), qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(r rVar) {
        d();
        Iterator<String> it = rVar.b().iterator();
        while (it.hasNext()) {
            this.f17193b.put(it.next(), rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b c() {
        d();
        this.f17196e = true;
        if (this.f17192a == null) {
            this.f17192a = Executors.newCachedThreadPool();
        }
        return new d(this);
    }
}
