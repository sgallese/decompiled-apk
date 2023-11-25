package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.focus.k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.http2.Http2;
import p1.j0;
import p1.u0;
import p1.z0;
import qc.b0;

/* compiled from: FocusOwnerImpl.kt */
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements y0.j {

    /* renamed from: a  reason: collision with root package name */
    private FocusTargetNode f2351a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.e f2352b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.compose.ui.e f2353c;

    /* renamed from: d  reason: collision with root package name */
    public j2.r f2354d;

    /* compiled from: FocusOwnerImpl.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2355a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2356b;

        static {
            int[] iArr = new int[y0.a.values().length];
            try {
                iArr[y0.a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2355a = iArr;
            int[] iArr2 = new int[y0.p.values().length];
            try {
                iArr2[y0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[y0.p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[y0.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[y0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f2356b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusOwnerImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<FocusTargetNode, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2357f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f2358m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b0 f2359p;

        /* compiled from: FocusOwnerImpl.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f2360a;

            static {
                int[] iArr = new int[y0.a.values().length];
                try {
                    iArr[y0.a.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y0.a.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y0.a.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[y0.a.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f2360a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, int i10, b0 b0Var) {
            super(1);
            this.f2357f = focusTargetNode;
            this.f2358m = i10;
            this.f2359p = b0Var;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            e.c cVar;
            boolean z10;
            androidx.compose.ui.node.a i02;
            boolean z11;
            boolean z12;
            qc.q.i(focusTargetNode, "destination");
            if (qc.q.d(focusTargetNode, this.f2357f)) {
                return Boolean.FALSE;
            }
            int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
            if (focusTargetNode.getNode().p1()) {
                e.c m12 = focusTargetNode.getNode().m1();
                j0 k10 = p1.k.k(focusTargetNode);
                loop0: while (true) {
                    cVar = null;
                    z10 = true;
                    if (k10 == null) {
                        break;
                    }
                    if ((k10.i0().k().f1() & a10) != 0) {
                        while (m12 != null) {
                            if ((m12.k1() & a10) != 0) {
                                e.c cVar2 = m12;
                                k0.f fVar = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof FocusTargetNode) {
                                        cVar = cVar2;
                                        break loop0;
                                    }
                                    if ((cVar2.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && (cVar2 instanceof p1.l)) {
                                        int i10 = 0;
                                        for (e.c J1 = ((p1.l) cVar2).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a10) != 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar2 = J1;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new k0.f(new e.c[16], 0);
                                                    }
                                                    if (cVar2 != null) {
                                                        fVar.d(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    fVar.d(J1);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    cVar2 = p1.k.g(fVar);
                                }
                            }
                            m12 = m12.m1();
                        }
                    }
                    k10 = k10.l0();
                    if (k10 != null && (i02 = k10.i0()) != null) {
                        m12 = i02.o();
                    } else {
                        m12 = null;
                    }
                }
                if (cVar != null) {
                    int i11 = a.f2360a[o.h(focusTargetNode, this.f2358m).ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            if (i11 == 4) {
                                z10 = o.i(focusTargetNode);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            this.f2359p.f21657f = true;
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
    }

    public FocusOwnerImpl(pc.l<? super pc.a<w>, w> lVar) {
        qc.q.i(lVar, "onRequestApplyChangesListener");
        this.f2351a = new FocusTargetNode();
        this.f2352b = new y0.e(lVar);
        this.f2353c = new u0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return false;
            }

            @Override // p1.u0
            public int hashCode() {
                return FocusOwnerImpl.this.p().hashCode();
            }

            @Override // p1.u0
            /* renamed from: v  reason: merged with bridge method [inline-methods] */
            public FocusTargetNode e() {
                return FocusOwnerImpl.this.p();
            }

            @Override // p1.u0
            /* renamed from: x  reason: merged with bridge method [inline-methods] */
            public void m(FocusTargetNode focusTargetNode) {
                qc.q.i(focusTargetNode, "node");
            }
        };
    }

    private final e.c q(p1.j jVar) {
        boolean z10;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL) | z0.a(8192);
        if (jVar.getNode().p1()) {
            e.c node = jVar.getNode();
            e.c cVar = null;
            if ((node.f1() & a10) != 0) {
                for (e.c g12 = node.g1(); g12 != null; g12 = g12.g1()) {
                    if ((g12.k1() & a10) != 0) {
                        if ((z0.a(UserVerificationMethods.USER_VERIFY_ALL) & g12.k1()) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            return cVar;
                        }
                        cVar = g12;
                    }
                }
            }
            return cVar;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    private final boolean r(int i10) {
        boolean l10;
        if (this.f2351a.O1().getHasFocus() && !this.f2351a.O1().isFocused()) {
            d.a aVar = d.f2368b;
            if (d.l(i10, aVar.e())) {
                l10 = true;
            } else {
                l10 = d.l(i10, aVar.f());
            }
            if (l10) {
                m(false);
                if (!this.f2351a.O1().isFocused()) {
                    return false;
                }
                return j(i10);
            }
        }
        return false;
    }

    @Override // y0.j
    public void a(j2.r rVar) {
        qc.q.i(rVar, "<set-?>");
        this.f2354d = rVar;
    }

    @Override // y0.j
    public void b(FocusTargetNode focusTargetNode) {
        qc.q.i(focusTargetNode, "node");
        this.f2352b.d(focusTargetNode);
    }

    @Override // y0.j
    public androidx.compose.ui.e c() {
        return this.f2353c;
    }

    @Override // y0.j
    public void d(y0.c cVar) {
        qc.q.i(cVar, "node");
        this.f2352b.f(cVar);
    }

    @Override // y0.j
    public void e() {
        if (this.f2351a.O1() == y0.p.Inactive) {
            this.f2351a.R1(y0.p.Active);
        }
    }

    @Override // y0.j
    public void f(y0.k kVar) {
        qc.q.i(kVar, "node");
        this.f2352b.g(kVar);
    }

    @Override // y0.j
    public void g(boolean z10, boolean z11) {
        y0.p pVar;
        if (!z10) {
            int i10 = a.f2355a[o.e(this.f2351a, d.f2368b.c()).ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return;
            }
        }
        y0.p O1 = this.f2351a.O1();
        if (o.c(this.f2351a, z10, z11)) {
            FocusTargetNode focusTargetNode = this.f2351a;
            int i11 = a.f2356b[O1.ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                if (i11 == 4) {
                    pVar = y0.p.Inactive;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                pVar = y0.p.Active;
            }
            focusTargetNode.R1(pVar);
        }
    }

    @Override // y0.j
    public boolean h(m1.b bVar) {
        m1.a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int size;
        androidx.compose.ui.node.a i02;
        boolean z14;
        boolean z15;
        e.c cVar;
        androidx.compose.ui.node.a i03;
        boolean z16;
        boolean z17;
        qc.q.i(bVar, "event");
        FocusTargetNode b10 = p.b(this.f2351a);
        if (b10 != null) {
            int a10 = z0.a(Http2.INITIAL_MAX_FRAME_SIZE);
            if (b10.getNode().p1()) {
                e.c m12 = b10.getNode().m1();
                j0 k10 = p1.k.k(b10);
                loop0: while (true) {
                    if (k10 != null) {
                        if ((k10.i0().k().f1() & a10) != 0) {
                            while (m12 != null) {
                                if ((m12.k1() & a10) != 0) {
                                    k0.f fVar = null;
                                    cVar = m12;
                                    while (cVar != null) {
                                        if (cVar instanceof m1.a) {
                                            break loop0;
                                        }
                                        if ((cVar.k1() & a10) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16 && (cVar instanceof p1.l)) {
                                            int i10 = 0;
                                            for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                                if ((J1.k1() & a10) != 0) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        cVar = J1;
                                                    } else {
                                                        if (fVar == null) {
                                                            fVar = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            fVar.d(cVar);
                                                            cVar = null;
                                                        }
                                                        fVar.d(J1);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        cVar = p1.k.g(fVar);
                                    }
                                }
                                m12 = m12.m1();
                            }
                        }
                        k10 = k10.l0();
                        if (k10 != null && (i03 = k10.i0()) != null) {
                            m12 = i03.o();
                        } else {
                            m12 = null;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                aVar = (m1.a) cVar;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int a11 = z0.a(Http2.INITIAL_MAX_FRAME_SIZE);
            if (aVar.getNode().p1()) {
                e.c m13 = aVar.getNode().m1();
                j0 k11 = p1.k.k(aVar);
                ArrayList arrayList = null;
                while (k11 != null) {
                    if ((k11.i0().k().f1() & a11) != 0) {
                        while (m13 != null) {
                            if ((m13.k1() & a11) != 0) {
                                e.c cVar2 = m13;
                                k0.f fVar2 = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof m1.a) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVar2);
                                    } else {
                                        if ((cVar2.k1() & a11) != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14 && (cVar2 instanceof p1.l)) {
                                            int i11 = 0;
                                            for (e.c J12 = ((p1.l) cVar2).J1(); J12 != null; J12 = J12.g1()) {
                                                if ((J12.k1() & a11) != 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (z15) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVar2 = J12;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar2 != null) {
                                                            fVar2.d(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        fVar2.d(J12);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                    }
                                    cVar2 = p1.k.g(fVar2);
                                }
                            }
                            m13 = m13.m1();
                        }
                    }
                    k11 = k11.l0();
                    if (k11 != null && (i02 = k11.i0()) != null) {
                        m13 = i02.o();
                    } else {
                        m13 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (((m1.a) arrayList.get(size)).Y0(bVar)) {
                            return true;
                        }
                        if (i12 < 0) {
                            break;
                        }
                        size = i12;
                    }
                }
                e.c node = aVar.getNode();
                k0.f fVar3 = null;
                while (node != null) {
                    if (node instanceof m1.a) {
                        if (((m1.a) node).Y0(bVar)) {
                            return true;
                        }
                    } else {
                        if ((node.k1() & a11) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12 && (node instanceof p1.l)) {
                            int i13 = 0;
                            for (e.c J13 = ((p1.l) node).J1(); J13 != null; J13 = J13.g1()) {
                                if ((J13.k1() & a11) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    i13++;
                                    if (i13 == 1) {
                                        node = J13;
                                    } else {
                                        if (fVar3 == null) {
                                            fVar3 = new k0.f(new e.c[16], 0);
                                        }
                                        if (node != null) {
                                            fVar3.d(node);
                                            node = null;
                                        }
                                        fVar3.d(J13);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                    }
                    node = p1.k.g(fVar3);
                }
                e.c node2 = aVar.getNode();
                k0.f fVar4 = null;
                while (node2 != null) {
                    if (node2 instanceof m1.a) {
                        if (((m1.a) node2).q0(bVar)) {
                            return true;
                        }
                    } else {
                        if ((node2.k1() & a11) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && (node2 instanceof p1.l)) {
                            int i14 = 0;
                            for (e.c J14 = ((p1.l) node2).J1(); J14 != null; J14 = J14.g1()) {
                                if ((J14.k1() & a11) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    i14++;
                                    if (i14 == 1) {
                                        node2 = J14;
                                    } else {
                                        if (fVar4 == null) {
                                            fVar4 = new k0.f(new e.c[16], 0);
                                        }
                                        if (node2 != null) {
                                            fVar4.d(node2);
                                            node2 = null;
                                        }
                                        fVar4.d(J14);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                    }
                    node2 = p1.k.g(fVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        if (((m1.a) arrayList.get(i15)).q0(bVar)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // y0.j
    public z0.h i() {
        FocusTargetNode b10 = p.b(this.f2351a);
        if (b10 != null) {
            return p.d(b10);
        }
        return null;
    }

    @Override // y0.g
    public boolean j(int i10) {
        FocusTargetNode b10 = p.b(this.f2351a);
        if (b10 == null) {
            return false;
        }
        k a10 = p.a(b10, i10, o());
        k.a aVar = k.f2395b;
        if (a10 != aVar.b()) {
            if (a10 == aVar.a() || !a10.c()) {
                return false;
            }
            return true;
        }
        b0 b0Var = new b0();
        boolean e10 = p.e(this.f2351a, i10, o(), new b(b10, i10, b0Var));
        if (b0Var.f21657f) {
            return false;
        }
        if (!e10 && !r(i10)) {
            return false;
        }
        return true;
    }

    @Override // y0.j
    public boolean k(KeyEvent keyEvent) {
        i1.g gVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int size;
        androidx.compose.ui.node.a i02;
        boolean z14;
        boolean z15;
        e.c cVar;
        androidx.compose.ui.node.a i03;
        boolean z16;
        boolean z17;
        qc.q.i(keyEvent, "keyEvent");
        FocusTargetNode b10 = p.b(this.f2351a);
        if (b10 != null) {
            int a10 = z0.a(131072);
            if (b10.getNode().p1()) {
                e.c m12 = b10.getNode().m1();
                j0 k10 = p1.k.k(b10);
                loop0: while (true) {
                    if (k10 != null) {
                        if ((k10.i0().k().f1() & a10) != 0) {
                            while (m12 != null) {
                                if ((m12.k1() & a10) != 0) {
                                    k0.f fVar = null;
                                    cVar = m12;
                                    while (cVar != null) {
                                        if (cVar instanceof i1.g) {
                                            break loop0;
                                        }
                                        if ((cVar.k1() & a10) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16 && (cVar instanceof p1.l)) {
                                            int i10 = 0;
                                            for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                                if ((J1.k1() & a10) != 0) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        cVar = J1;
                                                    } else {
                                                        if (fVar == null) {
                                                            fVar = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            fVar.d(cVar);
                                                            cVar = null;
                                                        }
                                                        fVar.d(J1);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        cVar = p1.k.g(fVar);
                                    }
                                }
                                m12 = m12.m1();
                            }
                        }
                        k10 = k10.l0();
                        if (k10 != null && (i03 = k10.i0()) != null) {
                            m12 = i03.o();
                        } else {
                            m12 = null;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                gVar = (i1.g) cVar;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            gVar = null;
        }
        if (gVar != null) {
            int a11 = z0.a(131072);
            if (gVar.getNode().p1()) {
                e.c m13 = gVar.getNode().m1();
                j0 k11 = p1.k.k(gVar);
                ArrayList arrayList = null;
                while (k11 != null) {
                    if ((k11.i0().k().f1() & a11) != 0) {
                        while (m13 != null) {
                            if ((m13.k1() & a11) != 0) {
                                e.c cVar2 = m13;
                                k0.f fVar2 = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof i1.g) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVar2);
                                    } else {
                                        if ((cVar2.k1() & a11) != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14 && (cVar2 instanceof p1.l)) {
                                            int i11 = 0;
                                            for (e.c J12 = ((p1.l) cVar2).J1(); J12 != null; J12 = J12.g1()) {
                                                if ((J12.k1() & a11) != 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (z15) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVar2 = J12;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar2 != null) {
                                                            fVar2.d(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        fVar2.d(J12);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                    }
                                    cVar2 = p1.k.g(fVar2);
                                }
                            }
                            m13 = m13.m1();
                        }
                    }
                    k11 = k11.l0();
                    if (k11 != null && (i02 = k11.i0()) != null) {
                        m13 = i02.o();
                    } else {
                        m13 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (((i1.g) arrayList.get(size)).G(keyEvent)) {
                            return true;
                        }
                        if (i12 < 0) {
                            break;
                        }
                        size = i12;
                    }
                }
                e.c node = gVar.getNode();
                k0.f fVar3 = null;
                while (node != null) {
                    if (node instanceof i1.g) {
                        if (((i1.g) node).G(keyEvent)) {
                            return true;
                        }
                    } else {
                        if ((node.k1() & a11) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12 && (node instanceof p1.l)) {
                            int i13 = 0;
                            for (e.c J13 = ((p1.l) node).J1(); J13 != null; J13 = J13.g1()) {
                                if ((J13.k1() & a11) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    i13++;
                                    if (i13 == 1) {
                                        node = J13;
                                    } else {
                                        if (fVar3 == null) {
                                            fVar3 = new k0.f(new e.c[16], 0);
                                        }
                                        if (node != null) {
                                            fVar3.d(node);
                                            node = null;
                                        }
                                        fVar3.d(J13);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                    }
                    node = p1.k.g(fVar3);
                }
                e.c node2 = gVar.getNode();
                k0.f fVar4 = null;
                while (node2 != null) {
                    if (node2 instanceof i1.g) {
                        if (((i1.g) node2).s0(keyEvent)) {
                            return true;
                        }
                    } else {
                        if ((node2.k1() & a11) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && (node2 instanceof p1.l)) {
                            int i14 = 0;
                            for (e.c J14 = ((p1.l) node2).J1(); J14 != null; J14 = J14.g1()) {
                                if ((J14.k1() & a11) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    i14++;
                                    if (i14 == 1) {
                                        node2 = J14;
                                    } else {
                                        if (fVar4 == null) {
                                            fVar4 = new k0.f(new e.c[16], 0);
                                        }
                                        if (node2 != null) {
                                            fVar4.d(node2);
                                            node2 = null;
                                        }
                                        fVar4.d(J14);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                    }
                    node2 = p1.k.g(fVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        if (((i1.g) arrayList.get(i15)).s0(keyEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // y0.j
    public void l() {
        o.c(this.f2351a, true, true);
    }

    @Override // y0.g
    public void m(boolean z10) {
        g(z10, true);
    }

    @Override // y0.j
    public boolean n(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int size;
        androidx.compose.ui.node.a i02;
        boolean z14;
        boolean z15;
        e.c cVar;
        androidx.compose.ui.node.a i03;
        boolean z16;
        boolean z17;
        qc.q.i(keyEvent, "keyEvent");
        FocusTargetNode b10 = p.b(this.f2351a);
        if (b10 != null) {
            e.c q10 = q(b10);
            if (q10 == null) {
                int a10 = z0.a(8192);
                if (b10.getNode().p1()) {
                    e.c m12 = b10.getNode().m1();
                    j0 k10 = p1.k.k(b10);
                    loop0: while (true) {
                        if (k10 != null) {
                            if ((k10.i0().k().f1() & a10) != 0) {
                                while (m12 != null) {
                                    if ((m12.k1() & a10) != 0) {
                                        k0.f fVar = null;
                                        cVar = m12;
                                        while (cVar != null) {
                                            if (cVar instanceof i1.e) {
                                                break loop0;
                                            }
                                            if ((cVar.k1() & a10) != 0) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            if (z16 && (cVar instanceof p1.l)) {
                                                int i10 = 0;
                                                for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                                    if ((J1.k1() & a10) != 0) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            cVar = J1;
                                                        } else {
                                                            if (fVar == null) {
                                                                fVar = new k0.f(new e.c[16], 0);
                                                            }
                                                            if (cVar != null) {
                                                                fVar.d(cVar);
                                                                cVar = null;
                                                            }
                                                            fVar.d(J1);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            cVar = p1.k.g(fVar);
                                        }
                                    }
                                    m12 = m12.m1();
                                }
                            }
                            k10 = k10.l0();
                            if (k10 != null && (i03 = k10.i0()) != null) {
                                m12 = i03.o();
                            } else {
                                m12 = null;
                            }
                        } else {
                            cVar = null;
                            break;
                        }
                    }
                    i1.e eVar = (i1.e) cVar;
                    if (eVar != null) {
                        q10 = eVar.getNode();
                    } else {
                        q10 = null;
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            if (q10 != null) {
                int a11 = z0.a(8192);
                if (q10.getNode().p1()) {
                    e.c m13 = q10.getNode().m1();
                    j0 k11 = p1.k.k(q10);
                    ArrayList arrayList = null;
                    while (k11 != null) {
                        if ((k11.i0().k().f1() & a11) != 0) {
                            while (m13 != null) {
                                if ((m13.k1() & a11) != 0) {
                                    e.c cVar2 = m13;
                                    k0.f fVar2 = null;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof i1.e) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(cVar2);
                                        } else {
                                            if ((cVar2.k1() & a11) != 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14 && (cVar2 instanceof p1.l)) {
                                                int i11 = 0;
                                                for (e.c J12 = ((p1.l) cVar2).J1(); J12 != null; J12 = J12.g1()) {
                                                    if ((J12.k1() & a11) != 0) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (z15) {
                                                        i11++;
                                                        if (i11 == 1) {
                                                            cVar2 = J12;
                                                        } else {
                                                            if (fVar2 == null) {
                                                                fVar2 = new k0.f(new e.c[16], 0);
                                                            }
                                                            if (cVar2 != null) {
                                                                fVar2.d(cVar2);
                                                                cVar2 = null;
                                                            }
                                                            fVar2.d(J12);
                                                        }
                                                    }
                                                }
                                                if (i11 == 1) {
                                                }
                                            }
                                        }
                                        cVar2 = p1.k.g(fVar2);
                                    }
                                }
                                m13 = m13.m1();
                            }
                        }
                        k11 = k11.l0();
                        if (k11 != null && (i02 = k11.i0()) != null) {
                            m13 = i02.o();
                        } else {
                            m13 = null;
                        }
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            if (((i1.e) arrayList.get(size)).A(keyEvent)) {
                                return true;
                            }
                            if (i12 < 0) {
                                break;
                            }
                            size = i12;
                        }
                    }
                    e.c node = q10.getNode();
                    k0.f fVar3 = null;
                    while (node != null) {
                        if (node instanceof i1.e) {
                            if (((i1.e) node).A(keyEvent)) {
                                return true;
                            }
                        } else {
                            if ((node.k1() & a11) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12 && (node instanceof p1.l)) {
                                int i13 = 0;
                                for (e.c J13 = ((p1.l) node).J1(); J13 != null; J13 = J13.g1()) {
                                    if ((J13.k1() & a11) != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i13++;
                                        if (i13 == 1) {
                                            node = J13;
                                        } else {
                                            if (fVar3 == null) {
                                                fVar3 = new k0.f(new e.c[16], 0);
                                            }
                                            if (node != null) {
                                                fVar3.d(node);
                                                node = null;
                                            }
                                            fVar3.d(J13);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                        }
                        node = p1.k.g(fVar3);
                    }
                    e.c node2 = q10.getNode();
                    k0.f fVar4 = null;
                    while (node2 != null) {
                        if (node2 instanceof i1.e) {
                            if (((i1.e) node2).Y(keyEvent)) {
                                return true;
                            }
                        } else {
                            if ((node2.k1() & a11) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (node2 instanceof p1.l)) {
                                int i14 = 0;
                                for (e.c J14 = ((p1.l) node2).J1(); J14 != null; J14 = J14.g1()) {
                                    if ((J14.k1() & a11) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        i14++;
                                        if (i14 == 1) {
                                            node2 = J14;
                                        } else {
                                            if (fVar4 == null) {
                                                fVar4 = new k0.f(new e.c[16], 0);
                                            }
                                            if (node2 != null) {
                                                fVar4.d(node2);
                                                node2 = null;
                                            }
                                            fVar4.d(J14);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                        }
                        node2 = p1.k.g(fVar4);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            if (((i1.e) arrayList.get(i15)).Y(keyEvent)) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    public j2.r o() {
        j2.r rVar = this.f2354d;
        if (rVar != null) {
            return rVar;
        }
        qc.q.z("layoutDirection");
        return null;
    }

    public final FocusTargetNode p() {
        return this.f2351a;
    }
}
