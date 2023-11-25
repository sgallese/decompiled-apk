package okio;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: Options.kt */
/* loaded from: classes4.dex */
public final class o0 extends ec.c<f> implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    public static final a f20658q = new a(null);

    /* renamed from: m  reason: collision with root package name */
    private final f[] f20659m;

    /* renamed from: p  reason: collision with root package name */
    private final int[] f20660p;

    /* compiled from: Options.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        private final void a(long j10, c cVar, int i10, List<? extends f> list, int i11, int i12, List<Integer> list2) {
            boolean z10;
            int i13;
            int i14;
            boolean z11;
            int i15;
            int i16;
            c cVar2;
            boolean z12;
            int i17 = i10;
            if (i11 < i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                for (int i18 = i11; i18 < i12; i18++) {
                    if (list.get(i18).D() >= i17) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                f fVar = list.get(i11);
                f fVar2 = list.get(i12 - 1);
                if (i17 == fVar.D()) {
                    int intValue = list2.get(i11).intValue();
                    int i19 = i11 + 1;
                    f fVar3 = list.get(i19);
                    i13 = i19;
                    i14 = intValue;
                    fVar = fVar3;
                } else {
                    i13 = i11;
                    i14 = -1;
                }
                if (fVar.i(i17) != fVar2.i(i17)) {
                    int i20 = 1;
                    for (int i21 = i13 + 1; i21 < i12; i21++) {
                        if (list.get(i21 - 1).i(i17) != list.get(i21).i(i17)) {
                            i20++;
                        }
                    }
                    long c10 = j10 + c(cVar) + 2 + (i20 * 2);
                    cVar.w(i20);
                    cVar.w(i14);
                    for (int i22 = i13; i22 < i12; i22++) {
                        byte i23 = list.get(i22).i(i17);
                        if (i22 == i13 || i23 != list.get(i22 - 1).i(i17)) {
                            cVar.w(i23 & 255);
                        }
                    }
                    c cVar3 = new c();
                    while (i13 < i12) {
                        byte i24 = list.get(i13).i(i17);
                        int i25 = i13 + 1;
                        int i26 = i25;
                        while (true) {
                            if (i26 < i12) {
                                if (i24 != list.get(i26).i(i17)) {
                                    i15 = i26;
                                    break;
                                }
                                i26++;
                            } else {
                                i15 = i12;
                                break;
                            }
                        }
                        if (i25 == i15 && i17 + 1 == list.get(i13).D()) {
                            cVar.w(list2.get(i13).intValue());
                            i16 = i15;
                            cVar2 = cVar3;
                        } else {
                            cVar.w(((int) (c10 + c(cVar3))) * (-1));
                            i16 = i15;
                            cVar2 = cVar3;
                            a(c10, cVar3, i17 + 1, list, i13, i15, list2);
                        }
                        cVar3 = cVar2;
                        i13 = i16;
                    }
                    cVar.g0(cVar3);
                    return;
                }
                int min = Math.min(fVar.D(), fVar2.D());
                int i27 = 0;
                for (int i28 = i17; i28 < min && fVar.i(i28) == fVar2.i(i28); i28++) {
                    i27++;
                }
                long c11 = j10 + c(cVar) + 2 + i27 + 1;
                cVar.w(-i27);
                cVar.w(i14);
                int i29 = i17 + i27;
                while (i17 < i29) {
                    cVar.w(fVar.i(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (i29 == list.get(i13).D()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        cVar.w(list2.get(i13).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                c cVar4 = new c();
                cVar.w(((int) (c(cVar4) + c11)) * (-1));
                a(c11, cVar4, i29, list, i13, i12, list2);
                cVar.g0(cVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j10, c cVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            long j11;
            int i14;
            int i15;
            int i16;
            if ((i13 & 1) != 0) {
                j11 = 0;
            } else {
                j11 = j10;
            }
            if ((i13 & 4) != 0) {
                i14 = 0;
            } else {
                i14 = i10;
            }
            if ((i13 & 16) != 0) {
                i15 = 0;
            } else {
                i15 = i11;
            }
            if ((i13 & 32) != 0) {
                i16 = list.size();
            } else {
                i16 = i12;
            }
            aVar.a(j11, cVar, i14, list, i15, i16, list2);
        }

        private final long c(c cVar) {
            return cVar.s0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.o0 d(okio.f... r17) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.o0.a.d(okio.f[]):okio.o0");
        }
    }

    public /* synthetic */ o0(f[] fVarArr, int[] iArr, qc.h hVar) {
        this(fVarArr, iArr);
    }

    @Override // ec.a
    public int a() {
        return this.f20659m.length;
    }

    @Override // ec.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return e((f) obj);
    }

    public /* bridge */ boolean e(f fVar) {
        return super.contains(fVar);
    }

    @Override // ec.c, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public f get(int i10) {
        return this.f20659m[i10];
    }

    public final f[] h() {
        return this.f20659m;
    }

    public final int[] i() {
        return this.f20660p;
    }

    @Override // ec.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof f)) {
            return -1;
        }
        return j((f) obj);
    }

    public /* bridge */ int j(f fVar) {
        return super.indexOf(fVar);
    }

    public /* bridge */ int k(f fVar) {
        return super.lastIndexOf(fVar);
    }

    @Override // ec.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof f)) {
            return -1;
        }
        return k((f) obj);
    }

    private o0(f[] fVarArr, int[] iArr) {
        this.f20659m = fVarArr;
        this.f20660p = iArr;
    }
}
