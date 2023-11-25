package xc;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public class m extends l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f25966a;

        public a(Iterator it) {
            this.f25966a = it;
        }

        @Override // xc.g
        public Iterator<T> iterator() {
            return this.f25966a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    static final class b<T> extends qc.r implements pc.a<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f25967f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T t10) {
            super(0);
            this.f25967f = t10;
        }

        @Override // pc.a
        public final T invoke() {
            return this.f25967f;
        }
    }

    public static <T> g<T> c(Iterator<? extends T> it) {
        qc.q.i(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> d(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        if (!(gVar instanceof xc.a)) {
            return new xc.a(gVar);
        }
        return gVar;
    }

    public static <T> g<T> e() {
        return d.f25948a;
    }

    public static <T> g<T> f(T t10, pc.l<? super T, ? extends T> lVar) {
        qc.q.i(lVar, "nextFunction");
        if (t10 == null) {
            return d.f25948a;
        }
        return new f(new b(t10), lVar);
    }

    public static <T> g<T> g(pc.a<? extends T> aVar, pc.l<? super T, ? extends T> lVar) {
        qc.q.i(aVar, "seedFunction");
        qc.q.i(lVar, "nextFunction");
        return new f(aVar, lVar);
    }
}
