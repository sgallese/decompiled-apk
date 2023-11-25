package t0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import okhttp3.internal.http.StatusLine;

/* compiled from: SnapshotIdSet.kt */
/* loaded from: classes.dex */
public final class j implements Iterable<Integer>, rc.a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f23321r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static final j f23322s = new j(0, 0, 0, null);

    /* renamed from: f  reason: collision with root package name */
    private final long f23323f;

    /* renamed from: m  reason: collision with root package name */
    private final long f23324m;

    /* renamed from: p  reason: collision with root package name */
    private final int f23325p;

    /* renamed from: q  reason: collision with root package name */
    private final int[] f23326q;

    /* compiled from: SnapshotIdSet.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final j a() {
            return j.f23322s;
        }
    }

    /* compiled from: SnapshotIdSet.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.k implements pc.p<xc.i<? super Integer>, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f23327m;

        /* renamed from: p  reason: collision with root package name */
        int f23328p;

        /* renamed from: q  reason: collision with root package name */
        int f23329q;

        /* renamed from: r  reason: collision with root package name */
        int f23330r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f23331s;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(xc.i<? super Integer> iVar, Continuation<? super dc.w> continuation) {
            return ((b) create(iVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f23331s = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private j(long j10, long j11, int i10, int[] iArr) {
        this.f23323f = j10;
        this.f23324m = j11;
        this.f23325p = i10;
        this.f23326q = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        xc.g b10;
        b10 = xc.k.b(new b(null));
        return b10.iterator();
    }

    public final j j(j jVar) {
        qc.q.i(jVar, "bits");
        j jVar2 = f23322s;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        int i10 = jVar.f23325p;
        int i11 = this.f23325p;
        if (i10 == i11) {
            int[] iArr = jVar.f23326q;
            int[] iArr2 = this.f23326q;
            if (iArr == iArr2) {
                return new j(this.f23323f & (~jVar.f23323f), this.f23324m & (~jVar.f23324m), i11, iArr2);
            }
        }
        Iterator<Integer> it = jVar.iterator();
        j jVar3 = this;
        while (it.hasNext()) {
            jVar3 = jVar3.k(it.next().intValue());
        }
        return jVar3;
    }

    public final j k(int i10) {
        int[] iArr;
        int b10;
        int i11 = this.f23325p;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f23324m;
            if ((j11 & j10) != 0) {
                return new j(this.f23323f, j11 & (~j10), i11, this.f23326q);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f23323f;
            if ((j13 & j12) != 0) {
                return new j(j13 & (~j12), this.f23324m, i11, this.f23326q);
            }
        } else if (i12 < 0 && (iArr = this.f23326q) != null && (b10 = k.b(iArr, i10)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new j(this.f23323f, this.f23324m, this.f23325p, null);
            }
            int[] iArr2 = new int[length];
            if (b10 > 0) {
                ec.o.g(iArr, iArr2, 0, 0, b10);
            }
            if (b10 < length) {
                ec.o.g(iArr, iArr2, b10, b10 + 1, length + 1);
            }
            return new j(this.f23323f, this.f23324m, this.f23325p, iArr2);
        }
        return this;
    }

    public final boolean l(int i10) {
        int[] iArr;
        int i11 = i10 - this.f23325p;
        boolean z10 = true;
        if (i11 >= 0 && i11 < 64) {
            if (((1 << i11) & this.f23324m) != 0) {
                return true;
            }
            return false;
        } else if (i11 >= 64 && i11 < 128) {
            if (((1 << (i11 - 64)) & this.f23323f) != 0) {
                return true;
            }
            return false;
        } else if (i11 > 0 || (iArr = this.f23326q) == null) {
            return false;
        } else {
            if (k.b(iArr, i10) < 0) {
                z10 = false;
            }
            return z10;
        }
    }

    public final int m(int i10) {
        int c10;
        int c11;
        int[] iArr = this.f23326q;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f23324m;
        if (j10 != 0) {
            int i11 = this.f23325p;
            c11 = k.c(j10);
            return i11 + c11;
        }
        long j11 = this.f23323f;
        if (j11 != 0) {
            int i12 = this.f23325p + 64;
            c10 = k.c(j11);
            return i12 + c10;
        }
        return i10;
    }

    public final j n(j jVar) {
        qc.q.i(jVar, "bits");
        j jVar2 = f23322s;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar;
        }
        int i10 = jVar.f23325p;
        int i11 = this.f23325p;
        if (i10 == i11) {
            int[] iArr = jVar.f23326q;
            int[] iArr2 = this.f23326q;
            if (iArr == iArr2) {
                return new j(this.f23323f | jVar.f23323f, this.f23324m | jVar.f23324m, i11, iArr2);
            }
        }
        if (this.f23326q == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                jVar = jVar.o(it.next().intValue());
            }
            return jVar;
        }
        Iterator<Integer> it2 = jVar.iterator();
        j jVar3 = this;
        while (it2.hasNext()) {
            jVar3 = jVar3.o(it2.next().intValue());
        }
        return jVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        r3 = ec.b0.B0(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t0.j o(int r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.j.o(int):t0.j");
    }

    public String toString() {
        int s10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        s10 = ec.u.s(this, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(t0.a.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
