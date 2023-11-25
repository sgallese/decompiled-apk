package io.noties.markwon.image;

import android.text.Spanned;
import android.widget.TextView;
import cb.g;
import cb.j;

/* compiled from: ImagesPlugin.java */
/* loaded from: classes4.dex */
public class p extends cb.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f17224a;

    /* compiled from: ImagesPlugin.java */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* compiled from: ImagesPlugin.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(p pVar);
    }

    p() {
        this(new c());
    }

    public static p b(b bVar) {
        p pVar = new p();
        bVar.a(pVar);
        return pVar;
    }

    public p a(r rVar) {
        this.f17224a.b(rVar);
        return this;
    }

    @Override // cb.a, cb.i
    public void afterSetText(TextView textView) {
        f.b(textView);
    }

    @Override // cb.a, cb.i
    public void beforeSetText(TextView textView, Spanned spanned) {
        f.c(textView);
    }

    @Override // cb.a, cb.i
    public void configureConfiguration(g.b bVar) {
        bVar.h(this.f17224a.c());
    }

    @Override // cb.a, cb.i
    public void configureSpansFactory(j.a aVar) {
        aVar.a(td.m.class, new o());
    }

    p(c cVar) {
        this.f17224a = cVar;
    }
}
