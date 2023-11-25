package c0;

import android.view.KeyEvent;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f8458a;

    /* renamed from: b  reason: collision with root package name */
    private final e0.v f8459b;

    /* renamed from: c  reason: collision with root package name */
    private final b2.j0 f8460c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8461d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8462e;

    /* renamed from: f  reason: collision with root package name */
    private final e0.y f8463f;

    /* renamed from: g  reason: collision with root package name */
    private final b2.x f8464g;

    /* renamed from: h  reason: collision with root package name */
    private final a1 f8465h;

    /* renamed from: i  reason: collision with root package name */
    private final i f8466i;

    /* renamed from: j  reason: collision with root package name */
    private final s f8467j;

    /* renamed from: k  reason: collision with root package name */
    private final pc.l<b2.j0, dc.w> f8468k;

    /* renamed from: l  reason: collision with root package name */
    private final int f8469l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldKeyInput.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<b2.j0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8470f = new a();

        a() {
            super(1);
        }

        public final void a(b2.j0 j0Var) {
            qc.q.i(j0Var, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(b2.j0 j0Var) {
            a(j0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: TextFieldKeyInput.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<e0.t, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f8471f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l0 f8472m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ qc.b0 f8473p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<e0.t, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f8474f = new a();

            a() {
                super(1);
            }

            public final void a(e0.t tVar) {
                qc.q.i(tVar, "$this$collapseLeftOr");
                tVar.C();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(e0.t tVar) {
                a(tVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* renamed from: c0.l0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0208b extends qc.r implements pc.l<e0.t, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0208b f8475f = new C0208b();

            C0208b() {
                super(1);
            }

            public final void a(e0.t tVar) {
                qc.q.i(tVar, "$this$collapseRightOr");
                tVar.K();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(e0.t tVar) {
                a(tVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.l<e0.t, b2.f> {

            /* renamed from: f  reason: collision with root package name */
            public static final c f8476f = new c();

            c() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b2.f invoke(e0.t tVar) {
                qc.q.i(tVar, "$this$deleteIfSelectedOr");
                return new b2.d(v1.i0.i(tVar.w()) - tVar.s(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.l<e0.t, b2.f> {

            /* renamed from: f  reason: collision with root package name */
            public static final d f8477f = new d();

            d() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b2.f invoke(e0.t tVar) {
                qc.q.i(tVar, "$this$deleteIfSelectedOr");
                int l10 = tVar.l();
                if (l10 != -1) {
                    return new b2.d(0, l10 - v1.i0.i(tVar.w()));
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class e extends qc.r implements pc.l<e0.t, b2.f> {

            /* renamed from: f  reason: collision with root package name */
            public static final e f8478f = new e();

            e() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b2.f invoke(e0.t tVar) {
                qc.q.i(tVar, "$this$deleteIfSelectedOr");
                Integer v10 = tVar.v();
                if (v10 != null) {
                    return new b2.d(v1.i0.i(tVar.w()) - v10.intValue(), 0);
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class f extends qc.r implements pc.l<e0.t, b2.f> {

            /* renamed from: f  reason: collision with root package name */
            public static final f f8479f = new f();

            f() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b2.f invoke(e0.t tVar) {
                qc.q.i(tVar, "$this$deleteIfSelectedOr");
                Integer m10 = tVar.m();
                if (m10 != null) {
                    return new b2.d(0, m10.intValue() - v1.i0.i(tVar.w()));
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class g extends qc.r implements pc.l<e0.t, b2.f> {

            /* renamed from: f  reason: collision with root package name */
            public static final g f8480f = new g();

            g() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b2.f invoke(e0.t tVar) {
                qc.q.i(tVar, "$this$deleteIfSelectedOr");
                Integer i10 = tVar.i();
                if (i10 != null) {
                    return new b2.d(v1.i0.i(tVar.w()) - i10.intValue(), 0);
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public static final class h extends qc.r implements pc.l<e0.t, b2.f> {

            /* renamed from: f  reason: collision with root package name */
            public static final h f8481f = new h();

            h() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b2.f invoke(e0.t tVar) {
                qc.q.i(tVar, "$this$deleteIfSelectedOr");
                Integer f10 = tVar.f();
                if (f10 != null) {
                    return new b2.d(0, f10.intValue() - v1.i0.i(tVar.w()));
                }
                return null;
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class i {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f8482a;

            static {
                int[] iArr = new int[q.values().length];
                try {
                    iArr[q.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[q.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[q.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[q.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[q.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[q.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[q.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[q.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[q.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[q.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[q.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[q.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[q.LINE_END.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[q.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[q.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[q.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[q.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[q.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[q.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[q.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[q.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[q.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[q.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[q.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[q.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[q.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[q.SELECT_LEFT_CHAR.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[q.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[q.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[q.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[q.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[q.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[q.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[q.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[q.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[q.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[q.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[q.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[q.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[q.SELECT_PAGE_DOWN.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[q.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[q.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[q.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[q.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[q.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[q.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                f8482a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, l0 l0Var, qc.b0 b0Var) {
            super(1);
            this.f8471f = qVar;
            this.f8472m = l0Var;
            this.f8473p = b0Var;
        }

        public final void a(e0.t tVar) {
            b2.j0 g10;
            b2.j0 c10;
            qc.q.i(tVar, "$this$commandExecutionContext");
            switch (i.f8482a[this.f8471f.ordinal()]) {
                case 1:
                    this.f8472m.h().k(false);
                    return;
                case 2:
                    this.f8472m.h().L();
                    return;
                case 3:
                    this.f8472m.h().o();
                    return;
                case 4:
                    tVar.b(a.f8474f);
                    return;
                case 5:
                    tVar.c(C0208b.f8475f);
                    return;
                case 6:
                    tVar.D();
                    return;
                case 7:
                    tVar.L();
                    return;
                case 8:
                    tVar.I();
                    return;
                case 9:
                    tVar.F();
                    return;
                case 10:
                    tVar.S();
                    return;
                case 11:
                    tVar.B();
                    return;
                case 12:
                    tVar.e0();
                    return;
                case 13:
                    tVar.d0();
                    return;
                case 14:
                    tVar.R();
                    return;
                case 15:
                    tVar.O();
                    return;
                case 16:
                    tVar.P();
                    return;
                case 17:
                    tVar.Q();
                    return;
                case 18:
                    tVar.N();
                    return;
                case 19:
                    tVar.M();
                    return;
                case 20:
                    List<b2.f> a02 = tVar.a0(c.f8476f);
                    if (a02 != null) {
                        this.f8472m.f(a02);
                        return;
                    }
                    return;
                case 21:
                    List<b2.f> a03 = tVar.a0(d.f8477f);
                    if (a03 != null) {
                        this.f8472m.f(a03);
                        return;
                    }
                    return;
                case 22:
                    List<b2.f> a04 = tVar.a0(e.f8478f);
                    if (a04 != null) {
                        this.f8472m.f(a04);
                        return;
                    }
                    return;
                case 23:
                    List<b2.f> a05 = tVar.a0(f.f8479f);
                    if (a05 != null) {
                        this.f8472m.f(a05);
                        return;
                    }
                    return;
                case 24:
                    List<b2.f> a06 = tVar.a0(g.f8480f);
                    if (a06 != null) {
                        this.f8472m.f(a06);
                        return;
                    }
                    return;
                case 25:
                    List<b2.f> a07 = tVar.a0(h.f8481f);
                    if (a07 != null) {
                        this.f8472m.f(a07);
                        return;
                    }
                    return;
                case 26:
                    if (!this.f8472m.i()) {
                        this.f8472m.e(new b2.b("\n", 1));
                        return;
                    } else {
                        this.f8472m.j().i().invoke(b2.o.i(this.f8472m.f8469l));
                        return;
                    }
                case 27:
                    if (!this.f8472m.i()) {
                        this.f8472m.e(new b2.b("\t", 1));
                        return;
                    } else {
                        this.f8473p.f21657f = false;
                        return;
                    }
                case 28:
                    tVar.T();
                    return;
                case 29:
                    tVar.C().U();
                    return;
                case 30:
                    tVar.K().U();
                    return;
                case 31:
                    tVar.D().U();
                    return;
                case 32:
                    tVar.L().U();
                    return;
                case 33:
                    tVar.I().U();
                    return;
                case 34:
                    tVar.F().U();
                    return;
                case 35:
                    tVar.R().U();
                    return;
                case 36:
                    tVar.O().U();
                    return;
                case 37:
                    tVar.P().U();
                    return;
                case 38:
                    tVar.Q().U();
                    return;
                case 39:
                    tVar.S().U();
                    return;
                case 40:
                    tVar.B().U();
                    return;
                case 41:
                    tVar.e0().U();
                    return;
                case 42:
                    tVar.d0().U();
                    return;
                case 43:
                    tVar.N().U();
                    return;
                case 44:
                    tVar.M().U();
                    return;
                case 45:
                    tVar.d();
                    return;
                case 46:
                    a1 k10 = this.f8472m.k();
                    if (k10 != null) {
                        k10.b(tVar.b0());
                    }
                    a1 k11 = this.f8472m.k();
                    if (k11 != null && (g10 = k11.g()) != null) {
                        this.f8472m.f8468k.invoke(g10);
                        return;
                    }
                    return;
                case 47:
                    a1 k12 = this.f8472m.k();
                    if (k12 != null && (c10 = k12.c()) != null) {
                        this.f8472m.f8468k.invoke(c10);
                        return;
                    }
                    return;
                case 48:
                    r.b();
                    return;
                default:
                    return;
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(e0.t tVar) {
            a(tVar);
            return dc.w.f13270a;
        }
    }

    public /* synthetic */ l0(t0 t0Var, e0.v vVar, b2.j0 j0Var, boolean z10, boolean z11, e0.y yVar, b2.x xVar, a1 a1Var, i iVar, s sVar, pc.l lVar, int i10, qc.h hVar) {
        this(t0Var, vVar, j0Var, z10, z11, yVar, xVar, a1Var, iVar, sVar, lVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(b2.f fVar) {
        List<? extends b2.f> d10;
        d10 = ec.s.d(fVar);
        f(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List<? extends b2.f> list) {
        List<? extends b2.f> F0;
        b2.h k10 = this.f8458a.k();
        F0 = ec.b0.F0(list);
        F0.add(0, new b2.k());
        this.f8468k.invoke(k10.b(F0));
    }

    private final void g(pc.l<? super e0.t, dc.w> lVar) {
        e0.t tVar = new e0.t(this.f8460c, this.f8464g, this.f8458a.g(), this.f8463f);
        lVar.invoke(tVar);
        if (!v1.i0.g(tVar.w(), this.f8460c.g()) || !qc.q.d(tVar.e(), this.f8460c.e())) {
            this.f8468k.invoke(tVar.b0());
        }
    }

    private final b2.b m(KeyEvent keyEvent) {
        Integer a10;
        if (!n0.a(keyEvent) || (a10 = this.f8466i.a(keyEvent)) == null) {
            return null;
        }
        String sb2 = c0.a(new StringBuilder(), a10.intValue()).toString();
        qc.q.h(sb2, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new b2.b(sb2, 1);
    }

    public final e0.v h() {
        return this.f8459b;
    }

    public final boolean i() {
        return this.f8462e;
    }

    public final t0 j() {
        return this.f8458a;
    }

    public final a1 k() {
        return this.f8465h;
    }

    public final boolean l(KeyEvent keyEvent) {
        q a10;
        qc.q.i(keyEvent, "event");
        b2.b m10 = m(keyEvent);
        if (m10 != null) {
            if (this.f8461d) {
                e(m10);
                this.f8463f.b();
                return true;
            }
            return false;
        } else if (!i1.c.e(i1.d.b(keyEvent), i1.c.f16951a.a()) || (a10 = this.f8467j.a(keyEvent)) == null || (a10.getEditsText() && !this.f8461d)) {
            return false;
        } else {
            qc.b0 b0Var = new qc.b0();
            b0Var.f21657f = true;
            g(new b(a10, this, b0Var));
            a1 a1Var = this.f8465h;
            if (a1Var != null) {
                a1Var.a();
            }
            return b0Var.f21657f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0(t0 t0Var, e0.v vVar, b2.j0 j0Var, boolean z10, boolean z11, e0.y yVar, b2.x xVar, a1 a1Var, i iVar, s sVar, pc.l<? super b2.j0, dc.w> lVar, int i10) {
        qc.q.i(t0Var, "state");
        qc.q.i(vVar, "selectionManager");
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(yVar, "preparedSelectionState");
        qc.q.i(xVar, "offsetMapping");
        qc.q.i(iVar, "keyCombiner");
        qc.q.i(sVar, "keyMapping");
        qc.q.i(lVar, "onValueChange");
        this.f8458a = t0Var;
        this.f8459b = vVar;
        this.f8460c = j0Var;
        this.f8461d = z10;
        this.f8462e = z11;
        this.f8463f = yVar;
        this.f8464g = xVar;
        this.f8465h = a1Var;
        this.f8466i = iVar;
        this.f8467j = sVar;
        this.f8468k = lVar;
        this.f8469l = i10;
    }

    public /* synthetic */ l0(t0 t0Var, e0.v vVar, b2.j0 j0Var, boolean z10, boolean z11, e0.y yVar, b2.x xVar, a1 a1Var, i iVar, s sVar, pc.l lVar, int i10, int i11, qc.h hVar) {
        this(t0Var, vVar, (i11 & 4) != 0 ? new b2.j0((String) null, 0L, (v1.i0) null, 7, (qc.h) null) : j0Var, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, yVar, (i11 & 64) != 0 ? b2.x.f7863a.a() : xVar, (i11 & 128) != 0 ? null : a1Var, iVar, (i11 & 512) != 0 ? u.a() : sVar, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? a.f8470f : lVar, i10, null);
    }
}
