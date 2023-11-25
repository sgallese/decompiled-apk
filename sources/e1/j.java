package e1;

import e1.i;
import java.util.List;

/* compiled from: PathNode.kt */
/* loaded from: classes.dex */
public final class j {
    public static final void a(char c10, List<i> list, float[] fArr, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        qc.q.i(list, "nodes");
        qc.q.i(fArr, "args");
        int i11 = 0;
        if (c10 == 'z' || c10 == 'Z') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            list.add(i.b.f13818c);
        } else if (c10 == 'm') {
            int i12 = i10 - 2;
            while (i11 <= i12) {
                int i13 = i11 + 1;
                i nVar = new i.n(fArr[i11], fArr[i13]);
                if ((nVar instanceof i.f) && i11 > 0) {
                    nVar = new i.e(fArr[i11], fArr[i13]);
                } else if (i11 > 0) {
                    nVar = new i.m(fArr[i11], fArr[i13]);
                }
                list.add(nVar);
                i11 += 2;
            }
        } else if (c10 == 'M') {
            int i14 = i10 - 2;
            while (i11 <= i14) {
                int i15 = i11 + 1;
                i fVar = new i.f(fArr[i11], fArr[i15]);
                if (i11 > 0) {
                    fVar = new i.e(fArr[i11], fArr[i15]);
                } else if ((fVar instanceof i.n) && i11 > 0) {
                    fVar = new i.m(fArr[i11], fArr[i15]);
                }
                list.add(fVar);
                i11 += 2;
            }
        } else if (c10 == 'l') {
            int i16 = i10 - 2;
            while (i11 <= i16) {
                int i17 = i11 + 1;
                i mVar = new i.m(fArr[i11], fArr[i17]);
                if ((mVar instanceof i.f) && i11 > 0) {
                    mVar = new i.e(fArr[i11], fArr[i17]);
                } else if ((mVar instanceof i.n) && i11 > 0) {
                    mVar = new i.m(fArr[i11], fArr[i17]);
                }
                list.add(mVar);
                i11 += 2;
            }
        } else if (c10 == 'L') {
            int i18 = i10 - 2;
            while (i11 <= i18) {
                int i19 = i11 + 1;
                i eVar = new i.e(fArr[i11], fArr[i19]);
                if ((eVar instanceof i.f) && i11 > 0) {
                    eVar = new i.e(fArr[i11], fArr[i19]);
                } else if ((eVar instanceof i.n) && i11 > 0) {
                    eVar = new i.m(fArr[i11], fArr[i19]);
                }
                list.add(eVar);
                i11 += 2;
            }
        } else if (c10 == 'h') {
            int i20 = i10 - 1;
            while (i11 <= i20) {
                i lVar = new i.l(fArr[i11]);
                if ((lVar instanceof i.f) && i11 > 0) {
                    lVar = new i.e(fArr[i11], fArr[i11 + 1]);
                } else if ((lVar instanceof i.n) && i11 > 0) {
                    lVar = new i.m(fArr[i11], fArr[i11 + 1]);
                }
                list.add(lVar);
                i11++;
            }
        } else if (c10 == 'H') {
            int i21 = i10 - 1;
            while (i11 <= i21) {
                i dVar = new i.d(fArr[i11]);
                if ((dVar instanceof i.f) && i11 > 0) {
                    dVar = new i.e(fArr[i11], fArr[i11 + 1]);
                } else if ((dVar instanceof i.n) && i11 > 0) {
                    dVar = new i.m(fArr[i11], fArr[i11 + 1]);
                }
                list.add(dVar);
                i11++;
            }
        } else if (c10 == 'v') {
            int i22 = i10 - 1;
            while (i11 <= i22) {
                i rVar = new i.r(fArr[i11]);
                if ((rVar instanceof i.f) && i11 > 0) {
                    rVar = new i.e(fArr[i11], fArr[i11 + 1]);
                } else if ((rVar instanceof i.n) && i11 > 0) {
                    rVar = new i.m(fArr[i11], fArr[i11 + 1]);
                }
                list.add(rVar);
                i11++;
            }
        } else if (c10 == 'V') {
            int i23 = i10 - 1;
            while (i11 <= i23) {
                i sVar = new i.s(fArr[i11]);
                if ((sVar instanceof i.f) && i11 > 0) {
                    sVar = new i.e(fArr[i11], fArr[i11 + 1]);
                } else if ((sVar instanceof i.n) && i11 > 0) {
                    sVar = new i.m(fArr[i11], fArr[i11 + 1]);
                }
                list.add(sVar);
                i11++;
            }
        } else if (c10 == 'c') {
            int i24 = i10 - 6;
            while (i11 <= i24) {
                int i25 = i11 + 1;
                i kVar = new i.k(fArr[i11], fArr[i25], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]);
                if ((kVar instanceof i.f) && i11 > 0) {
                    kVar = new i.e(fArr[i11], fArr[i25]);
                } else if ((kVar instanceof i.n) && i11 > 0) {
                    kVar = new i.m(fArr[i11], fArr[i25]);
                }
                list.add(kVar);
                i11 += 6;
            }
        } else if (c10 == 'C') {
            int i26 = i10 - 6;
            while (i11 <= i26) {
                int i27 = i11 + 1;
                i cVar = new i.c(fArr[i11], fArr[i27], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]);
                if ((cVar instanceof i.f) && i11 > 0) {
                    cVar = new i.e(fArr[i11], fArr[i27]);
                } else if ((cVar instanceof i.n) && i11 > 0) {
                    cVar = new i.m(fArr[i11], fArr[i27]);
                }
                list.add(cVar);
                i11 += 6;
            }
        } else if (c10 == 's') {
            int i28 = i10 - 4;
            while (i11 <= i28) {
                int i29 = i11 + 1;
                i pVar = new i.p(fArr[i11], fArr[i29], fArr[i11 + 2], fArr[i11 + 3]);
                if ((pVar instanceof i.f) && i11 > 0) {
                    pVar = new i.e(fArr[i11], fArr[i29]);
                } else if ((pVar instanceof i.n) && i11 > 0) {
                    pVar = new i.m(fArr[i11], fArr[i29]);
                }
                list.add(pVar);
                i11 += 4;
            }
        } else if (c10 == 'S') {
            int i30 = i10 - 4;
            while (i11 <= i30) {
                int i31 = i11 + 1;
                i hVar = new i.h(fArr[i11], fArr[i31], fArr[i11 + 2], fArr[i11 + 3]);
                if ((hVar instanceof i.f) && i11 > 0) {
                    hVar = new i.e(fArr[i11], fArr[i31]);
                } else if ((hVar instanceof i.n) && i11 > 0) {
                    hVar = new i.m(fArr[i11], fArr[i31]);
                }
                list.add(hVar);
                i11 += 4;
            }
        } else if (c10 == 'q') {
            int i32 = i10 - 4;
            while (i11 <= i32) {
                int i33 = i11 + 1;
                i oVar = new i.o(fArr[i11], fArr[i33], fArr[i11 + 2], fArr[i11 + 3]);
                if ((oVar instanceof i.f) && i11 > 0) {
                    oVar = new i.e(fArr[i11], fArr[i33]);
                } else if ((oVar instanceof i.n) && i11 > 0) {
                    oVar = new i.m(fArr[i11], fArr[i33]);
                }
                list.add(oVar);
                i11 += 4;
            }
        } else if (c10 == 'Q') {
            int i34 = i10 - 4;
            while (i11 <= i34) {
                int i35 = i11 + 1;
                i gVar = new i.g(fArr[i11], fArr[i35], fArr[i11 + 2], fArr[i11 + 3]);
                if ((gVar instanceof i.f) && i11 > 0) {
                    gVar = new i.e(fArr[i11], fArr[i35]);
                } else if ((gVar instanceof i.n) && i11 > 0) {
                    gVar = new i.m(fArr[i11], fArr[i35]);
                }
                list.add(gVar);
                i11 += 4;
            }
        } else if (c10 == 't') {
            int i36 = i10 - 2;
            while (i11 <= i36) {
                int i37 = i11 + 1;
                i qVar = new i.q(fArr[i11], fArr[i37]);
                if ((qVar instanceof i.f) && i11 > 0) {
                    qVar = new i.e(fArr[i11], fArr[i37]);
                } else if ((qVar instanceof i.n) && i11 > 0) {
                    qVar = new i.m(fArr[i11], fArr[i37]);
                }
                list.add(qVar);
                i11 += 2;
            }
        } else if (c10 == 'T') {
            int i38 = i10 - 2;
            while (i11 <= i38) {
                int i39 = i11 + 1;
                i c0330i = new i.C0330i(fArr[i11], fArr[i39]);
                if ((c0330i instanceof i.f) && i11 > 0) {
                    c0330i = new i.e(fArr[i11], fArr[i39]);
                } else if ((c0330i instanceof i.n) && i11 > 0) {
                    c0330i = new i.m(fArr[i11], fArr[i39]);
                }
                list.add(c0330i);
                i11 += 2;
            }
        } else if (c10 == 'a') {
            int i40 = i10 - 7;
            for (int i41 = 0; i41 <= i40; i41 += 7) {
                float f10 = fArr[i41];
                int i42 = i41 + 1;
                float f11 = fArr[i42];
                float f12 = fArr[i41 + 2];
                if (Float.compare(fArr[i41 + 3], 0.0f) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (Float.compare(fArr[i41 + 4], 0.0f) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i jVar = new i.j(f10, f11, f12, z13, z14, fArr[i41 + 5], fArr[i41 + 6]);
                if ((jVar instanceof i.f) && i41 > 0) {
                    jVar = new i.e(fArr[i41], fArr[i42]);
                } else if ((jVar instanceof i.n) && i41 > 0) {
                    jVar = new i.m(fArr[i41], fArr[i42]);
                }
                list.add(jVar);
            }
        } else if (c10 == 'A') {
            int i43 = i10 - 7;
            for (int i44 = 0; i44 <= i43; i44 += 7) {
                float f13 = fArr[i44];
                int i45 = i44 + 1;
                float f14 = fArr[i45];
                float f15 = fArr[i44 + 2];
                if (Float.compare(fArr[i44 + 3], 0.0f) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (Float.compare(fArr[i44 + 4], 0.0f) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i aVar = new i.a(f13, f14, f15, z11, z12, fArr[i44 + 5], fArr[i44 + 6]);
                if ((aVar instanceof i.f) && i44 > 0) {
                    aVar = new i.e(fArr[i44], fArr[i45]);
                } else if ((aVar instanceof i.n) && i44 > 0) {
                    aVar = new i.m(fArr[i44], fArr[i45]);
                }
                list.add(aVar);
            }
        } else {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }
}
