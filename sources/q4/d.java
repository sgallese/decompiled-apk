package q4;

import android.graphics.Bitmap;
import b5.h;
import b5.l;
import b5.q;

/* compiled from: EventListener.kt */
/* loaded from: classes.dex */
public interface d extends h.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21389a = b.f21391a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f21390b = new a();

    /* compiled from: EventListener.kt */
    /* loaded from: classes.dex */
    public static final class a implements d {
        a() {
        }

        @Override // q4.d, b5.h.b
        public /* synthetic */ void a(b5.h hVar, b5.e eVar) {
            q4.c.j(this, hVar, eVar);
        }

        @Override // q4.d, b5.h.b
        public /* synthetic */ void b(b5.h hVar) {
            q4.c.i(this, hVar);
        }

        @Override // q4.d, b5.h.b
        public /* synthetic */ void c(b5.h hVar, q qVar) {
            q4.c.l(this, hVar, qVar);
        }

        @Override // q4.d, b5.h.b
        public /* synthetic */ void d(b5.h hVar) {
            q4.c.k(this, hVar);
        }

        @Override // q4.d
        public /* synthetic */ void e(b5.h hVar, String str) {
            q4.c.e(this, hVar, str);
        }

        @Override // q4.d
        public /* synthetic */ void f(b5.h hVar, c5.i iVar) {
            q4.c.m(this, hVar, iVar);
        }

        @Override // q4.d
        public /* synthetic */ void g(b5.h hVar, f5.c cVar) {
            q4.c.r(this, hVar, cVar);
        }

        @Override // q4.d
        public /* synthetic */ void h(b5.h hVar, t4.i iVar, l lVar, t4.g gVar) {
            q4.c.a(this, hVar, iVar, lVar, gVar);
        }

        @Override // q4.d
        public /* synthetic */ void i(b5.h hVar, Object obj) {
            q4.c.h(this, hVar, obj);
        }

        @Override // q4.d
        public /* synthetic */ void j(b5.h hVar, Object obj) {
            q4.c.f(this, hVar, obj);
        }

        @Override // q4.d
        public /* synthetic */ void k(b5.h hVar) {
            q4.c.n(this, hVar);
        }

        @Override // q4.d
        public /* synthetic */ void l(b5.h hVar, w4.i iVar, l lVar, w4.h hVar2) {
            q4.c.c(this, hVar, iVar, lVar, hVar2);
        }

        @Override // q4.d
        public /* synthetic */ void m(b5.h hVar, Object obj) {
            q4.c.g(this, hVar, obj);
        }

        @Override // q4.d
        public /* synthetic */ void n(b5.h hVar, w4.i iVar, l lVar) {
            q4.c.d(this, hVar, iVar, lVar);
        }

        @Override // q4.d
        public /* synthetic */ void o(b5.h hVar, Bitmap bitmap) {
            q4.c.p(this, hVar, bitmap);
        }

        @Override // q4.d
        public /* synthetic */ void p(b5.h hVar, f5.c cVar) {
            q4.c.q(this, hVar, cVar);
        }

        @Override // q4.d
        public /* synthetic */ void q(b5.h hVar, Bitmap bitmap) {
            q4.c.o(this, hVar, bitmap);
        }

        @Override // q4.d
        public /* synthetic */ void r(b5.h hVar, t4.i iVar, l lVar) {
            q4.c.b(this, hVar, iVar, lVar);
        }
    }

    /* compiled from: EventListener.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f21391a = new b();

        private b() {
        }
    }

    /* compiled from: EventListener.kt */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21392a = a.f21394a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f21393b = new c() { // from class: q4.e
            @Override // q4.d.c
            public final d a(b5.h hVar) {
                return f.a(hVar);
            }
        };

        /* compiled from: EventListener.kt */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f21394a = new a();

            private a() {
            }
        }

        d a(b5.h hVar);
    }

    @Override // b5.h.b
    void a(b5.h hVar, b5.e eVar);

    @Override // b5.h.b
    void b(b5.h hVar);

    @Override // b5.h.b
    void c(b5.h hVar, q qVar);

    @Override // b5.h.b
    void d(b5.h hVar);

    void e(b5.h hVar, String str);

    void f(b5.h hVar, c5.i iVar);

    void g(b5.h hVar, f5.c cVar);

    void h(b5.h hVar, t4.i iVar, l lVar, t4.g gVar);

    void i(b5.h hVar, Object obj);

    void j(b5.h hVar, Object obj);

    void k(b5.h hVar);

    void l(b5.h hVar, w4.i iVar, l lVar, w4.h hVar2);

    void m(b5.h hVar, Object obj);

    void n(b5.h hVar, w4.i iVar, l lVar);

    void o(b5.h hVar, Bitmap bitmap);

    void p(b5.h hVar, f5.c cVar);

    void q(b5.h hVar, Bitmap bitmap);

    void r(b5.h hVar, t4.i iVar, l lVar);
}
