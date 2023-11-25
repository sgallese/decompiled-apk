package com.habitrpg.android.habitica.ui.views;

import a1.p1;
import ad.k0;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import j0.d3;
import j0.g2;
import j0.h0;
import j0.i2;
import j0.j1;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import j0.x;
import n1.i0;
import p1.g;
import pc.p;
import pc.q;
import v0.b;
import w.a;

/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
public final class LoadingButtonKt {

    /* compiled from: LoadingButton.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingButtonState.values().length];
            try {
                iArr[LoadingButtonState.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingButtonState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LoadingButton(com.habitrpg.android.habitica.ui.views.LoadingButtonState r38, pc.a<dc.w> r39, androidx.compose.ui.e r40, com.habitrpg.android.habitica.ui.views.LoadingButtonType r41, f0.h r42, a1.q4 r43, t.g r44, f0.f r45, w.s r46, pc.q<? super w.a0, ? super j0.l, ? super java.lang.Integer, dc.w> r47, pc.q<? super w.a0, ? super j0.l, ? super java.lang.Integer, dc.w> r48, pc.q<? super w.a0, ? super j0.l, ? super java.lang.Integer, dc.w> r49, j0.l r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.LoadingButtonKt.LoadingButton(com.habitrpg.android.habitica.ui.views.LoadingButtonState, pc.a, androidx.compose.ui.e, com.habitrpg.android.habitica.ui.views.LoadingButtonType, f0.h, a1.q4, t.g, f0.f, w.s, pc.q, pc.q, pc.q, j0.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(j0.l lVar, int i10) {
        j0.l lVar2;
        j0.l q10 = lVar.q(-99621024);
        if (i10 == 0 && q10.t()) {
            q10.z();
            lVar2 = q10;
        } else {
            if (n.K()) {
                n.V(-99621024, i10, -1, "com.habitrpg.android.habitica.ui.views.Preview (LoadingButton.kt:211)");
            }
            q10.e(-492369756);
            Object f10 = q10.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                f10 = d3.e(LoadingButtonState.CONTENT, null, 2, null);
                q10.J(f10);
            }
            q10.N();
            j1 j1Var = (j1) f10;
            q10.e(773894976);
            q10.e(-492369756);
            Object f11 = q10.f();
            if (f11 == aVar.a()) {
                x xVar = new x(h0.h(hc.g.f16601f, q10));
                q10.J(xVar);
                f11 = xVar;
            }
            q10.N();
            k0 a10 = ((x) f11).a();
            q10.N();
            b.InterfaceC0571b f12 = v0.b.f24258a.f();
            float f13 = 8;
            a.e m10 = w.a.f25135a.m(j2.h.j(f13));
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e i11 = androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.m.s(aVar2, j2.h.j((float) m.e.DEFAULT_DRAG_ANIMATION_DURATION)), j2.h.j(f13));
            q10.e(-483455358);
            i0 a11 = w.h.a(m10, f12, q10, 54);
            q10.e(-1323940314);
            int a12 = j0.j.a(q10, 0);
            v F = q10.F();
            g.a aVar3 = p1.g.f20790l;
            pc.a<p1.g> a13 = aVar3.a();
            q<i2<p1.g>, j0.l, Integer, w> a14 = n1.x.a(i11);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a13);
            } else {
                q10.H();
            }
            j0.l a15 = l3.a(q10);
            l3.b(a15, a11, aVar3.e());
            l3.b(a15, F, aVar3.g());
            p<p1.g, Integer, w> b10 = aVar3.b();
            if (a15.n() || !qc.q.d(a15.f(), Integer.valueOf(a12))) {
                a15.J(Integer.valueOf(a12));
                a15.I(Integer.valueOf(a12), b10);
            }
            a14.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            w.k kVar = w.k.f25176a;
            LoadingButtonState Preview$lambda$2 = Preview$lambda$2(j1Var);
            androidx.compose.ui.e h10 = androidx.compose.foundation.layout.m.h(aVar2, 0.0f, 1, null);
            LoadingButtonKt$Preview$1$1 loadingButtonKt$Preview$1$1 = new LoadingButtonKt$Preview$1$1(a10, j1Var);
            ComposableSingletons$LoadingButtonKt composableSingletons$LoadingButtonKt = ComposableSingletons$LoadingButtonKt.INSTANCE;
            lVar2 = q10;
            LoadingButton(Preview$lambda$2, loadingButtonKt$Preview$1$1, h10, null, null, null, null, null, null, composableSingletons$LoadingButtonKt.m151getLambda1$Habitica_2311256681_prodRelease(), null, composableSingletons$LoadingButtonKt.m153getLambda2$Habitica_2311256681_prodRelease(), q10, 805306752, 48, 1528);
            LoadingButtonState loadingButtonState = LoadingButtonState.LOADING;
            LoadingButton(loadingButtonState, LoadingButtonKt$Preview$1$2.INSTANCE, null, null, null, null, null, f0.g.f14733a.a(HabiticaTheme.INSTANCE.getColors(lVar2, 6).m131getSuccessBackground0d7_KjU(), p1.f146b.f(), 0L, 0L, lVar2, (f0.g.f14744l << 12) | 48, 12), null, null, null, composableSingletons$LoadingButtonKt.m154getLambda3$Habitica_2311256681_prodRelease(), lVar2, 54, 48, 1916);
            LoadingButton(loadingButtonState, LoadingButtonKt$Preview$1$3.INSTANCE, androidx.compose.foundation.layout.m.h(aVar2, 0.0f, 1, null), null, null, null, null, null, null, null, null, composableSingletons$LoadingButtonKt.m155getLambda4$Habitica_2311256681_prodRelease(), lVar2, 438, 48, 2040);
            LoadingButtonState loadingButtonState2 = LoadingButtonState.FAILED;
            LoadingButton(loadingButtonState2, LoadingButtonKt$Preview$1$4.INSTANCE, null, null, null, null, null, null, null, null, null, composableSingletons$LoadingButtonKt.m156getLambda5$Habitica_2311256681_prodRelease(), lVar2, 54, 48, 2044);
            LoadingButton(loadingButtonState2, LoadingButtonKt$Preview$1$5.INSTANCE, null, null, null, null, null, null, null, null, composableSingletons$LoadingButtonKt.m157getLambda6$Habitica_2311256681_prodRelease(), composableSingletons$LoadingButtonKt.m158getLambda7$Habitica_2311256681_prodRelease(), lVar2, 54, 54, 1020);
            LoadingButtonState loadingButtonState3 = LoadingButtonState.SUCCESS;
            LoadingButton(loadingButtonState3, LoadingButtonKt$Preview$1$6.INSTANCE, null, null, null, null, null, null, null, null, null, composableSingletons$LoadingButtonKt.m159getLambda8$Habitica_2311256681_prodRelease(), lVar2, 54, 48, 2044);
            LoadingButton(loadingButtonState3, LoadingButtonKt$Preview$1$7.INSTANCE, null, null, null, null, null, null, null, composableSingletons$LoadingButtonKt.m160getLambda9$Habitica_2311256681_prodRelease(), null, composableSingletons$LoadingButtonKt.m152getLambda10$Habitica_2311256681_prodRelease(), lVar2, 805306422, 48, 1532);
            lVar2.N();
            lVar2.O();
            lVar2.N();
            lVar2.N();
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = lVar2.w();
        if (w10 != null) {
            w10.a(new LoadingButtonKt$Preview$2(i10));
        }
    }

    private static final LoadingButtonState Preview$lambda$2(j1<LoadingButtonState> j1Var) {
        return j1Var.getValue();
    }
}
