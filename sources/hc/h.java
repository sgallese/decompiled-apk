package hc;

import dc.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: SafeContinuationJvm.kt */
/* loaded from: classes4.dex */
public final class h<T> implements Continuation<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: m  reason: collision with root package name */
    private static final a f16602m = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<h<?>, Object> f16603p = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    /* renamed from: f  reason: collision with root package name */
    private final Continuation<T> f16604f;
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Continuation<? super T> continuation, Object obj) {
        q.i(continuation, "delegate");
        this.f16604f = continuation;
        this.result = obj;
    }

    public final Object a() {
        Object d10;
        Object d11;
        Object d12;
        Object obj = this.result;
        ic.a aVar = ic.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f16603p;
            d11 = ic.d.d();
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, aVar, d11)) {
                d12 = ic.d.d();
                return d12;
            }
            obj = this.result;
        }
        if (obj == ic.a.RESUMED) {
            d10 = ic.d.d();
            return d10;
        } else if (!(obj instanceof m.b)) {
            return obj;
        } else {
            throw ((m.b) obj).f13254f;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f16604f;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public f getContext() {
        return this.f16604f.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object d10;
        Object d11;
        while (true) {
            Object obj2 = this.result;
            ic.a aVar = ic.a.UNDECIDED;
            if (obj2 != aVar) {
                d10 = ic.d.d();
                if (obj2 == d10) {
                    AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f16603p;
                    d11 = ic.d.d();
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d11, ic.a.RESUMED)) {
                        this.f16604f.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (androidx.concurrent.futures.b.a(f16603p, this, aVar, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f16604f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Continuation<? super T> continuation) {
        this(continuation, ic.a.UNDECIDED);
        q.i(continuation, "delegate");
    }
}
