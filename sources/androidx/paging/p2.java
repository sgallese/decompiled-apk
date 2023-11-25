package androidx.paging;

import androidx.paging.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.AbstractMap;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: WrapperDataSource.kt */
/* loaded from: classes.dex */
public class p2<Key, ValueFrom, ValueTo> extends o<Key, ValueTo> {

    /* renamed from: a  reason: collision with root package name */
    private final o<Key, ValueFrom> f5989a;

    /* renamed from: b  reason: collision with root package name */
    private final n.a<List<ValueFrom>, List<ValueTo>> f5990b;

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<ValueTo, Key> f5991c;

    /* compiled from: WrapperDataSource.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5992a;

        static {
            int[] iArr = new int[o.e.values().length];
            try {
                iArr[o.e.ITEM_KEYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5992a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WrapperDataSource.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.kt", l = {68}, m = "load$suspendImpl")
    /* loaded from: classes.dex */
    public static final class b<Key, ValueFrom, ValueTo> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f5993f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f5994m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p2<Key, ValueFrom, ValueTo> f5995p;

        /* renamed from: q  reason: collision with root package name */
        int f5996q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p2<Key, ValueFrom, ValueTo> p2Var, Continuation<? super b> continuation) {
            super(continuation);
            this.f5995p = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5994m = obj;
            this.f5996q |= RecyclerView.UNDEFINED_DURATION;
            return p2.c(this.f5995p, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(o<Key, ValueFrom> oVar, n.a<List<ValueFrom>, List<ValueTo>> aVar) {
        super(oVar.getType$paging_common());
        IdentityHashMap<ValueTo, Key> identityHashMap;
        qc.q.i(oVar, "source");
        qc.q.i(aVar, "listFunction");
        this.f5989a = oVar;
        this.f5990b = aVar;
        if (a.f5992a[oVar.getType$paging_common().ordinal()] == 1) {
            identityHashMap = new IdentityHashMap<>();
        } else {
            identityHashMap = null;
        }
        this.f5991c = identityHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <Key, ValueFrom, ValueTo> java.lang.Object c(androidx.paging.p2<Key, ValueFrom, ValueTo> r4, androidx.paging.o.f<Key> r5, kotlin.coroutines.Continuation<? super androidx.paging.o.a<ValueTo>> r6) {
        /*
            boolean r0 = r6 instanceof androidx.paging.p2.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.p2$b r0 = (androidx.paging.p2.b) r0
            int r1 = r0.f5996q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5996q = r1
            goto L18
        L13:
            androidx.paging.p2$b r0 = new androidx.paging.p2$b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5994m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f5996q
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f5993f
            androidx.paging.p2 r4 = (androidx.paging.p2) r4
            dc.n.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            dc.n.b(r6)
            androidx.paging.o<Key, ValueFrom> r6 = r4.f5989a
            r0.f5993f = r4
            r0.f5996q = r3
            java.lang.Object r6 = r6.load$paging_common(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            androidx.paging.o$a r6 = (androidx.paging.o.a) r6
            androidx.paging.o$a$a r5 = androidx.paging.o.a.f5949f
            n.a<java.util.List<ValueFrom>, java.util.List<ValueTo>> r0 = r4.f5990b
            androidx.paging.o$a r5 = r5.a(r6, r0)
            java.util.List<Value> r6 = r6.f5950a
            java.util.List<Value> r0 = r5.f5950a
            r4.d(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p2.c(androidx.paging.p2, androidx.paging.o$f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.paging.o
    public void addInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f5989a.addInvalidatedCallback(dVar);
    }

    public final void d(List<? extends ValueFrom> list, List<? extends ValueTo> list2) {
        qc.q.i(list, "source");
        qc.q.i(list2, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.f5991c;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AbstractMap abstractMap = (IdentityHashMap<ValueTo, Key>) this.f5991c;
                    ValueTo valueto = list2.get(i10);
                    o<Key, ValueFrom> oVar = this.f5989a;
                    qc.q.g(oVar, "null cannot be cast to non-null type androidx.paging.ItemKeyedDataSource<Key of androidx.paging.WrapperDataSource.stashKeysIfNeeded$lambda$1, ValueFrom of androidx.paging.WrapperDataSource.stashKeysIfNeeded$lambda$1>");
                    abstractMap.put(valueto, ((i0) oVar).h(list.get(i10)));
                }
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    @Override // androidx.paging.o
    public Key getKeyInternal$paging_common(ValueTo valueto) {
        Key key;
        qc.q.i(valueto, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.f5991c;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                key = this.f5991c.get(valueto);
                qc.q.f(key);
            }
            return key;
        }
        throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
    }

    @Override // androidx.paging.o
    public void invalidate() {
        this.f5989a.invalidate();
    }

    @Override // androidx.paging.o
    public boolean isInvalid() {
        return this.f5989a.isInvalid();
    }

    @Override // androidx.paging.o
    public Object load$paging_common(o.f<Key> fVar, Continuation<? super o.a<ValueTo>> continuation) {
        return c(this, fVar, continuation);
    }

    @Override // androidx.paging.o
    public void removeInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f5989a.removeInvalidatedCallback(dVar);
    }
}
