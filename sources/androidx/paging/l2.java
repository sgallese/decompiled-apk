package androidx.paging;

import java.util.Arrays;
import java.util.List;

/* compiled from: TransformablePage.kt */
/* loaded from: classes.dex */
public final class l2<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5867e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final l2<Object> f5868f;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f5869a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f5870b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5871c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Integer> f5872d;

    /* compiled from: TransformablePage.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final l2<Object> a() {
            return l2.f5868f;
        }
    }

    static {
        List i10;
        i10 = ec.t.i();
        f5868f = new l2<>(0, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l2(int[] iArr, List<? extends T> list, int i10, List<Integer> list2) {
        qc.q.i(iArr, "originalPageOffsets");
        qc.q.i(list, "data");
        this.f5869a = iArr;
        this.f5870b = list;
        this.f5871c = i10;
        this.f5872d = list2;
        if ((!(iArr.length == 0)) != false) {
            if (list2 == null || list2.size() == list.size()) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("If originalIndices (size = ");
            qc.q.f(list2);
            sb2.append(list2.size());
            sb2.append(") is provided, it must be same length as data (size = ");
            sb2.append(list.size());
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    public final List<T> b() {
        return this.f5870b;
    }

    public final int[] c() {
        return this.f5869a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r0 = ec.t.j(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.paging.o2.a d(int r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.paging.o2$a r7 = new androidx.paging.o2$a
            int r1 = r8.f5871c
            java.util.List<java.lang.Integer> r0 = r8.f5872d
            r2 = 0
            if (r0 == 0) goto L19
            java.util.Collection r0 = (java.util.Collection) r0
            vc.f r0 = ec.r.j(r0)
            if (r0 == 0) goto L19
            boolean r0 = r0.m(r9)
            r3 = 1
            if (r0 != r3) goto L19
            r2 = 1
        L19:
            if (r2 == 0) goto L27
            java.util.List<java.lang.Integer> r0 = r8.f5872d
            java.lang.Object r9 = r0.get(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        L27:
            r2 = r9
            r0 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l2.d(int, int, int, int, int):androidx.paging.o2$a");
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!qc.q.d(l2.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        l2 l2Var = (l2) obj;
        if (Arrays.equals(this.f5869a, l2Var.f5869a) && qc.q.d(this.f5870b, l2Var.f5870b) && this.f5871c == l2Var.f5871c && qc.q.d(this.f5872d, l2Var.f5872d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((Arrays.hashCode(this.f5869a) * 31) + this.f5870b.hashCode()) * 31) + this.f5871c) * 31;
        List<Integer> list = this.f5872d;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f5869a) + ", data=" + this.f5870b + ", hintOriginalPageOffset=" + this.f5871c + ", hintOriginalIndices=" + this.f5872d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l2(int i10, List<? extends T> list) {
        this(new int[]{i10}, list, i10, null);
        qc.q.i(list, "data");
    }
}
