package xb;

import ad.l0;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import io.realm.a1;
import io.realm.d1;
import io.realm.g1;
import io.realm.o0;
import io.realm.u0;
import io.realm.v0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;
import xb.b;

/* compiled from: InternalFlowFactory.kt */
/* loaded from: classes4.dex */
public final class b implements ub.a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f25898a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: InternalFlowFactory.kt */
    @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$3", f = "InternalFlowFactory.kt", l = {116, 142}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a<T> extends l implements p<cd.p<? super g1<T>>, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25899f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f25900m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g1<T> f25901p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v0 f25902q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b f25903r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* renamed from: xb.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0589a extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0589a f25904f = new C0589a();

            C0589a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* renamed from: xb.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0590b extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ o0 f25905f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g1<T> f25906m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ u0<g1<T>> f25907p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0590b(o0 o0Var, g1<T> g1Var, u0<g1<T>> u0Var) {
                super(0);
                this.f25905f = o0Var;
                this.f25906m = g1Var;
                this.f25907p = u0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f25905f.isClosed()) {
                    return;
                }
                this.f25906m.o(this.f25907p);
                this.f25905f.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g1<T> g1Var, v0 v0Var, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f25901p = g1Var;
            this.f25902q = v0Var;
            this.f25903r = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(cd.p pVar, b bVar, g1 g1Var) {
            if (l0.g(pVar)) {
                if (bVar.f25898a) {
                    g1 m10 = g1Var.m();
                    q.h(m10, "listenerResults.freeze()");
                    pVar.p(m10);
                    return;
                }
                pVar.p(g1Var);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f25901p, this.f25902q, this.f25903r, continuation);
            aVar.f25900m = obj;
            return aVar;
        }

        @Override // pc.p
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(cd.p<? super g1<T>> pVar, Continuation<? super w> continuation) {
            return ((a) create(pVar, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f25899f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return w.f13270a;
            }
            n.b(obj);
            final cd.p pVar = (cd.p) this.f25900m;
            if (!this.f25901p.isValid()) {
                C0589a c0589a = C0589a.f25904f;
                this.f25899f = 1;
                if (cd.n.a(pVar, c0589a, this) == d10) {
                    return d10;
                }
                return w.f13270a;
            }
            o0 b12 = o0.b1(this.f25902q);
            final b bVar = this.f25903r;
            u0<g1<T>> u0Var = new u0() { // from class: xb.a
                @Override // io.realm.u0
                public final void a(Object obj2) {
                    b.a.i(cd.p.this, bVar, (g1) obj2);
                }
            };
            this.f25901p.j(u0Var);
            if (this.f25903r.f25898a) {
                g1<T> m10 = this.f25901p.m();
                q.h(m10, "results.freeze()");
                pVar.p(m10);
            } else {
                pVar.p(this.f25901p);
            }
            C0590b c0590b = new C0590b(b12, this.f25901p, u0Var);
            this.f25899f = 2;
            if (cd.n.a(pVar, c0590b, this) == d10) {
                return d10;
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: InternalFlowFactory.kt */
    @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$4", f = "InternalFlowFactory.kt", l = {216, 242}, m = "invokeSuspend")
    /* renamed from: xb.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0591b<T> extends l implements p<cd.p<? super g1<T>>, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25908f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f25909m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g1<T> f25910p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v0 f25911q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b f25912r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* renamed from: xb.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25913f = new a();

            a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* renamed from: xb.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0592b extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ io.realm.n f25914f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g1<T> f25915m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ u0<g1<T>> f25916p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0592b(io.realm.n nVar, g1<T> g1Var, u0<g1<T>> u0Var) {
                super(0);
                this.f25914f = nVar;
                this.f25915m = g1Var;
                this.f25916p = u0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f25914f.isClosed()) {
                    return;
                }
                this.f25915m.o(this.f25916p);
                this.f25914f.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0591b(g1<T> g1Var, v0 v0Var, b bVar, Continuation<? super C0591b> continuation) {
            super(2, continuation);
            this.f25910p = g1Var;
            this.f25911q = v0Var;
            this.f25912r = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(cd.p pVar, b bVar, g1 g1Var) {
            if (l0.g(pVar)) {
                if (bVar.f25898a) {
                    g1 m10 = g1Var.m();
                    q.h(m10, "listenerResults.freeze()");
                    pVar.p(m10);
                    return;
                }
                pVar.p(g1Var);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            C0591b c0591b = new C0591b(this.f25910p, this.f25911q, this.f25912r, continuation);
            c0591b.f25909m = obj;
            return c0591b;
        }

        @Override // pc.p
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(cd.p<? super g1<T>> pVar, Continuation<? super w> continuation) {
            return ((C0591b) create(pVar, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f25908f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return w.f13270a;
            }
            n.b(obj);
            final cd.p pVar = (cd.p) this.f25909m;
            if (!this.f25910p.isValid()) {
                a aVar = a.f25913f;
                this.f25908f = 1;
                if (cd.n.a(pVar, aVar, this) == d10) {
                    return d10;
                }
                return w.f13270a;
            }
            io.realm.n l02 = io.realm.n.l0(this.f25911q);
            final b bVar = this.f25912r;
            u0<g1<T>> u0Var = new u0() { // from class: xb.c
                @Override // io.realm.u0
                public final void a(Object obj2) {
                    b.C0591b.i(cd.p.this, bVar, (g1) obj2);
                }
            };
            this.f25910p.j(u0Var);
            if (this.f25912r.f25898a) {
                g1<T> m10 = this.f25910p.m();
                q.h(m10, "results.freeze()");
                pVar.p(m10);
            } else {
                pVar.p(this.f25910p);
            }
            C0592b c0592b = new C0592b(l02, this.f25910p, u0Var);
            this.f25908f = 2;
            if (cd.n.a(pVar, c0592b, this) == d10) {
                return d10;
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: InternalFlowFactory.kt */
    @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$7", f = "InternalFlowFactory.kt", l = {517, 545}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c<T> extends l implements p<cd.p<? super T>, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25917f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f25918m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ o0 f25919p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v0 f25920q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ a1 f25921r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b f25922s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* loaded from: classes4.dex */
        public static final class a extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25923f = new a();

            a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Incorrect field signature: TT; */
        /* compiled from: InternalFlowFactory.kt */
        /* renamed from: xb.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0593b extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ o0 f25924f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a1 f25925m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ u0<T> f25926p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lio/realm/o0;TT;Lio/realm/u0<TT;>;)V */
            C0593b(o0 o0Var, a1 a1Var, u0 u0Var) {
                super(0);
                this.f25924f = o0Var;
                this.f25925m = a1Var;
                this.f25926p = u0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f25924f.isClosed()) {
                    return;
                }
                d1.removeChangeListener(this.f25925m, (u0<a1>) this.f25926p);
                this.f25924f.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lio/realm/o0;Lio/realm/v0;TT;Lxb/b;Lkotlin/coroutines/Continuation<-Lxb/b$c;>;)V */
        c(o0 o0Var, v0 v0Var, a1 a1Var, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f25919p = o0Var;
            this.f25920q = v0Var;
            this.f25921r = a1Var;
            this.f25922s = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(cd.p pVar, b bVar, a1 a1Var) {
            if (l0.g(pVar)) {
                if (bVar.f25898a) {
                    a1 freeze = d1.freeze(a1Var);
                    if (freeze != null) {
                        pVar.p(freeze);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0");
                }
                pVar.p(a1Var);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f25919p, this.f25920q, this.f25921r, this.f25922s, continuation);
            cVar.f25918m = obj;
            return cVar;
        }

        @Override // pc.p
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(cd.p<? super T> pVar, Continuation<? super w> continuation) {
            return ((c) create(pVar, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f25917f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return w.f13270a;
            }
            n.b(obj);
            final cd.p pVar = (cd.p) this.f25918m;
            if (this.f25919p.isClosed()) {
                a aVar = a.f25923f;
                this.f25917f = 1;
                if (cd.n.a(pVar, aVar, this) == d10) {
                    return d10;
                }
                return w.f13270a;
            }
            o0 b12 = o0.b1(this.f25920q);
            final b bVar = this.f25922s;
            u0 u0Var = new u0() { // from class: xb.d
                @Override // io.realm.u0
                public final void a(Object obj2) {
                    b.c.i(cd.p.this, bVar, (a1) obj2);
                }
            };
            d1.addChangeListener(this.f25921r, u0Var);
            if (d1.isLoaded(this.f25921r)) {
                if (this.f25922s.f25898a) {
                    a1 freeze = d1.freeze(this.f25921r);
                    q.h(freeze, "freeze(realmObject)");
                    pVar.p(freeze);
                } else {
                    pVar.p(this.f25921r);
                }
            }
            C0593b c0593b = new C0593b(b12, this.f25921r, u0Var);
            this.f25917f = 2;
            if (cd.n.a(pVar, c0593b, this) == d10) {
                return d10;
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalFlowFactory.kt */
    @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$8", f = "InternalFlowFactory.kt", l = {622, 650}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends l implements p<cd.p<? super io.realm.p>, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25927f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f25928m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ io.realm.n f25929p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v0 f25930q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ io.realm.p f25931r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b f25932s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* loaded from: classes4.dex */
        public static final class a extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f25933f = new a();

            a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InternalFlowFactory.kt */
        /* renamed from: xb.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0594b extends r implements pc.a<w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ io.realm.n f25934f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ io.realm.p f25935m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ u0<io.realm.p> f25936p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0594b(io.realm.n nVar, io.realm.p pVar, u0<io.realm.p> u0Var) {
                super(0);
                this.f25934f = nVar;
                this.f25935m = pVar;
                this.f25936p = u0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f25934f.isClosed()) {
                    return;
                }
                this.f25935m.removeChangeListener(this.f25936p);
                this.f25934f.close();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(io.realm.n nVar, v0 v0Var, io.realm.p pVar, b bVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f25929p = nVar;
            this.f25930q = v0Var;
            this.f25931r = pVar;
            this.f25932s = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(cd.p pVar, b bVar, io.realm.p pVar2) {
            if (l0.g(pVar)) {
                if (bVar.f25898a) {
                    a1 freeze = pVar2.freeze();
                    q.h(freeze, "listenerObj.freeze()");
                    pVar.p(freeze);
                    return;
                }
                pVar.p(pVar2);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f25929p, this.f25930q, this.f25931r, this.f25932s, continuation);
            dVar.f25928m = obj;
            return dVar;
        }

        @Override // pc.p
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(cd.p<? super io.realm.p> pVar, Continuation<? super w> continuation) {
            return ((d) create(pVar, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f25927f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return w.f13270a;
            }
            n.b(obj);
            final cd.p pVar = (cd.p) this.f25928m;
            if (this.f25929p.isClosed()) {
                a aVar = a.f25933f;
                this.f25927f = 1;
                if (cd.n.a(pVar, aVar, this) == d10) {
                    return d10;
                }
                return w.f13270a;
            }
            io.realm.n l02 = io.realm.n.l0(this.f25930q);
            final b bVar = this.f25932s;
            u0 u0Var = new u0() { // from class: xb.e
                @Override // io.realm.u0
                public final void a(Object obj2) {
                    b.d.i(cd.p.this, bVar, (io.realm.p) obj2);
                }
            };
            this.f25931r.addChangeListener(u0Var);
            if (d1.isLoaded(this.f25931r)) {
                if (this.f25932s.f25898a) {
                    a1 freeze = d1.freeze(this.f25931r);
                    q.h(freeze, "freeze(dynamicRealmObject)");
                    pVar.p(freeze);
                } else {
                    pVar.p(this.f25931r);
                }
            }
            C0594b c0594b = new C0594b(l02, this.f25931r, u0Var);
            this.f25927f = 2;
            if (cd.n.a(pVar, c0594b, this) == d10) {
                return d10;
            }
            return w.f13270a;
        }
    }

    public b(boolean z10) {
        this.f25898a = z10;
    }

    @Override // ub.a
    public <T extends a1> g<T> a(o0 o0Var, T t10) {
        q.i(o0Var, "realm");
        q.i(t10, "realmObject");
        if (o0Var.Y()) {
            return i.B(t10);
        }
        return i.e(new c(o0Var, o0Var.L(), t10, this, null));
    }

    @Override // ub.a
    public g<io.realm.p> b(io.realm.n nVar, io.realm.p pVar) {
        q.i(nVar, "dynamicRealm");
        q.i(pVar, "dynamicRealmObject");
        if (nVar.Y()) {
            return i.B(pVar);
        }
        return i.e(new d(nVar, nVar.L(), pVar, this, null));
    }

    @Override // ub.a
    public <T> g<g1<T>> c(o0 o0Var, g1<T> g1Var) {
        q.i(o0Var, "realm");
        q.i(g1Var, "results");
        if (o0Var.Y()) {
            return i.B(g1Var);
        }
        return i.e(new a(g1Var, o0Var.L(), this, null));
    }

    @Override // ub.a
    public <T> g<g1<T>> d(io.realm.n nVar, g1<T> g1Var) {
        q.i(nVar, "dynamicRealm");
        q.i(g1Var, "results");
        if (nVar.Y()) {
            return i.B(g1Var);
        }
        return i.e(new C0591b(g1Var, nVar.L(), this, null));
    }
}
