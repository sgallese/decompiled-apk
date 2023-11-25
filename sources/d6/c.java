package d6;

import a1.r1;
import pc.l;

/* compiled from: SystemUiController.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ void a(d dVar, long j10, boolean z10, boolean z11, l lVar, int i10, Object obj) {
        boolean z12;
        l lVar2;
        if (obj == null) {
            if ((i10 & 2) != 0) {
                if (r1.i(j10) > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            boolean z13 = z10;
            if ((i10 & 4) != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            l lVar3 = lVar;
            if ((i10 & 8) != 0) {
                lVar2 = e.f13127b;
                lVar3 = lVar2;
            }
            dVar.b(j10, z13, z12, lVar3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(d dVar, long j10, boolean z10, l lVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                if (r1.i(j10) > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if ((i10 & 4) != 0) {
                lVar = e.f13127b;
            }
            dVar.a(j10, z10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
    }
}
