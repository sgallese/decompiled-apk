package w9;

import android.util.SparseIntArray;

/* compiled from: FrameMetricsCalculator.java */
/* loaded from: classes3.dex */
public class g {

    /* compiled from: FrameMetricsCalculator.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f25483a;

        /* renamed from: b  reason: collision with root package name */
        int f25484b;

        /* renamed from: c  reason: collision with root package name */
        int f25485c;

        public a(int i10, int i11, int i12) {
            this.f25483a = i10;
            this.f25484b = i11;
            this.f25485c = i12;
        }

        public a a(a aVar) {
            return new a(this.f25483a - aVar.d(), this.f25484b - aVar.c(), this.f25485c - aVar.b());
        }

        public int b() {
            return this.f25485c;
        }

        public int c() {
            return this.f25484b;
        }

        public int d() {
            return this.f25483a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr != null && (sparseIntArray = sparseIntArrayArr[0]) != null) {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i11 += valueAt;
                }
                if (keyAt > 16) {
                    i10 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new a(i12, i10, i11);
    }
}
