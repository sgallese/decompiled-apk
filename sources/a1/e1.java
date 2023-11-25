package a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f96b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f97a;

    /* compiled from: Brush.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public static /* synthetic */ e1 c(a aVar, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = z0.f.f26354b.b();
            }
            return aVar.b(list, j10);
        }

        public static /* synthetic */ e1 e(a aVar, dc.l[] lVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = v4.f208a.a();
            }
            return aVar.d(lVarArr, f10, f11, i10);
        }

        public final e1 a(dc.l<Float, p1>[] lVarArr, long j10, long j11, int i10) {
            qc.q.i(lVarArr, "colorStops");
            ArrayList arrayList = new ArrayList(lVarArr.length);
            for (dc.l<Float, p1> lVar : lVarArr) {
                arrayList.add(p1.g(lVar.d().y()));
            }
            ArrayList arrayList2 = new ArrayList(lVarArr.length);
            for (dc.l<Float, p1> lVar2 : lVarArr) {
                arrayList2.add(Float.valueOf(lVar2.c().floatValue()));
            }
            return new w3(arrayList, arrayList2, j10, j11, i10, null);
        }

        public final e1 b(List<p1> list, long j10) {
            qc.q.i(list, "colors");
            return new u4(j10, list, null, null);
        }

        public final e1 d(dc.l<Float, p1>[] lVarArr, float f10, float f11, int i10) {
            qc.q.i(lVarArr, "colorStops");
            return a((dc.l[]) Arrays.copyOf(lVarArr, lVarArr.length), z0.g.a(0.0f, f10), z0.g.a(0.0f, f11), i10);
        }
    }

    public /* synthetic */ e1(qc.h hVar) {
        this();
    }

    public abstract void a(long j10, b4 b4Var, float f10);

    private e1() {
        this.f97a = z0.l.f26375b.a();
    }
}
