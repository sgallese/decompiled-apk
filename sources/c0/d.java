package c0;

import a1.s1;
import a2.l;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import j0.j1;
import j0.z1;
import java.util.List;
import java.util.Map;
import v1.d;

/* compiled from: BasicText.kt */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f8205f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8206m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8207p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<v1.g0, dc.w> f8208q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f8209r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f8210s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f8211t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f8212u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ s1 f8213v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f8214w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f8215x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, androidx.compose.ui.e eVar, v1.k0 k0Var, pc.l<? super v1.g0, dc.w> lVar, int i10, boolean z10, int i11, int i12, s1 s1Var, int i13, int i14) {
            super(2);
            this.f8205f = str;
            this.f8206m = eVar;
            this.f8207p = k0Var;
            this.f8208q = lVar;
            this.f8209r = i10;
            this.f8210s = z10;
            this.f8211t = i11;
            this.f8212u = i12;
            this.f8213v = s1Var;
            this.f8214w = i13;
            this.f8215x = i14;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            d.b(this.f8205f, this.f8206m, this.f8207p, this.f8208q, this.f8209r, this.f8210s, this.f8211t, this.f8212u, this.f8213v, lVar, z1.a(this.f8214w | 1), this.f8215x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<List<? extends z0.h>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1<List<z0.h>> f8216f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j1<List<z0.h>> j1Var) {
            super(1);
            this.f8216f = j1Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(List<? extends z0.h> list) {
            invoke2((List<z0.h>) list);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<z0.h> list) {
            qc.q.i(list, "it");
            this.f8216f.setValue(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.a<List<? extends z0.h>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1<List<z0.h>> f8217f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j1<List<z0.h>> j1Var) {
            super(0);
            this.f8217f = j1Var;
        }

        @Override // pc.a
        public final List<? extends z0.h> invoke() {
            return this.f8217f.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* renamed from: c0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0198d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v1.d f8218f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8219m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8220p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<v1.g0, dc.w> f8221q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f8222r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f8223s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f8224t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f8225u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ Map<String, p> f8226v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ s1 f8227w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f8228x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f8229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0198d(v1.d dVar, androidx.compose.ui.e eVar, v1.k0 k0Var, pc.l<? super v1.g0, dc.w> lVar, int i10, boolean z10, int i11, int i12, Map<String, p> map, s1 s1Var, int i13, int i14) {
            super(2);
            this.f8218f = dVar;
            this.f8219m = eVar;
            this.f8220p = k0Var;
            this.f8221q = lVar;
            this.f8222r = i10;
            this.f8223s = z10;
            this.f8224t = i11;
            this.f8225u = i12;
            this.f8226v = map;
            this.f8227w = s1Var;
            this.f8228x = i13;
            this.f8229y = i14;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            d.a(this.f8218f, this.f8219m, this.f8220p, this.f8221q, this.f8222r, this.f8223s, this.f8224t, this.f8225u, this.f8226v, this.f8227w, lVar, z1.a(this.f8228x | 1), this.f8229y);
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.a<p1.g> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f8230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pc.a aVar) {
            super(0);
            this.f8230f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [p1.g, java.lang.Object] */
        @Override // pc.a
        public final p1.g invoke() {
            return this.f8230f.invoke();
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.a<p1.g> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f8231f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(pc.a aVar) {
            super(0);
            this.f8231f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [p1.g, java.lang.Object] */
        @Override // pc.a
        public final p1.g invoke() {
            return this.f8231f.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.d r51, androidx.compose.ui.e r52, v1.k0 r53, pc.l<? super v1.g0, dc.w> r54, int r55, boolean r56, int r57, int r58, java.util.Map<java.lang.String, c0.p> r59, a1.s1 r60, j0.l r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.a(v1.d, androidx.compose.ui.e, v1.k0, pc.l, int, boolean, int, int, java.util.Map, a1.s1, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r47, androidx.compose.ui.e r48, v1.k0 r49, pc.l<? super v1.g0, dc.w> r50, int r51, boolean r52, int r53, int r54, a1.s1 r55, j0.l r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.b(java.lang.String, androidx.compose.ui.e, v1.k0, pc.l, int, boolean, int, int, a1.s1, j0.l, int, int):void");
    }

    private static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, v1.d dVar, v1.k0 k0Var, pc.l<? super v1.g0, dc.w> lVar, int i10, boolean z10, int i11, int i12, l.b bVar, List<d.b<v1.u>> list, pc.l<? super List<z0.h>, dc.w> lVar2, d0.h hVar, s1 s1Var) {
        if (hVar == null) {
            return eVar.a(androidx.compose.ui.e.f2335a).a(new TextAnnotatedStringElement(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, null, s1Var, null));
        }
        return eVar.a(hVar.f()).a(new SelectableTextAnnotatedStringElement(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, s1Var, null));
    }
}
