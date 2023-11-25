package gb;

import android.text.style.StrikethroughSpan;
import cb.g;
import cb.j;
import cb.l;
import cb.r;
import cb.t;
import java.util.Collections;
import ud.d;

/* compiled from: StrikethroughPlugin.java */
/* loaded from: classes4.dex */
public class a extends cb.a {

    /* compiled from: StrikethroughPlugin.java */
    /* renamed from: gb.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0383a implements t {
        C0383a() {
        }

        @Override // cb.t
        public Object a(g gVar, r rVar) {
            return new StrikethroughSpan();
        }
    }

    /* compiled from: StrikethroughPlugin.java */
    /* loaded from: classes4.dex */
    class b implements l.c<od.a> {
        b() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(l lVar, od.a aVar) {
            int length = lVar.length();
            lVar.n(aVar);
            lVar.w(aVar, length);
        }
    }

    public static a a() {
        return new a();
    }

    @Override // cb.a, cb.i
    public void configureParser(d.b bVar) {
        bVar.h(Collections.singleton(od.b.b()));
    }

    @Override // cb.a, cb.i
    public void configureSpansFactory(j.a aVar) {
        aVar.a(od.a.class, new C0383a());
    }

    @Override // cb.a, cb.i
    public void configureVisitor(l.b bVar) {
        bVar.a(od.a.class, new b());
    }
}
