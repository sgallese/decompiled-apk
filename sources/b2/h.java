package b2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* compiled from: EditProcessor.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private j0 f7768a;

    /* renamed from: b  reason: collision with root package name */
    private i f7769b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProcessor.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<f, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f7770f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h f7771m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, h hVar) {
            super(1);
            this.f7770f = fVar;
            this.f7771m = hVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(f fVar) {
            String str;
            qc.q.i(fVar, "it");
            if (this.f7770f == fVar) {
                str = " > ";
            } else {
                str = "   ";
            }
            return str + this.f7771m.e(fVar);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [qc.h, v1.i0] */
    public h() {
        ?? r42 = 0;
        this.f7768a = new j0(v1.e.g(), v1.i0.f24470b.a(), (v1.i0) r42, (qc.h) null);
        this.f7769b = new i(this.f7768a.e(), this.f7768a.g(), r42);
    }

    private final String c(List<? extends f> list, f fVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f7769b.h() + ", composition=" + this.f7769b.d() + ", selection=" + ((Object) v1.i0.q(this.f7769b.i())) + "):");
        qc.q.h(sb2, "append(value)");
        sb2.append('\n');
        qc.q.h(sb2, "append('\\n')");
        ec.b0.i0(list, sb2, "\n", null, null, 0, null, new a(fVar, this), 60, null);
        String sb3 = sb2.toString();
        qc.q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(f fVar) {
        if (fVar instanceof b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            b bVar = (b) fVar;
            sb2.append(bVar.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(bVar.b());
            sb2.append(')');
            return sb2.toString();
        } else if (fVar instanceof h0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            h0 h0Var = (h0) fVar;
            sb3.append(h0Var.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(h0Var.b());
            sb3.append(')');
            return sb3.toString();
        } else if (fVar instanceof g0) {
            return fVar.toString();
        } else {
            if (fVar instanceof d) {
                return fVar.toString();
            }
            if (fVar instanceof e) {
                return fVar.toString();
            }
            if (fVar instanceof i0) {
                return fVar.toString();
            }
            if (fVar instanceof k) {
                return fVar.toString();
            }
            if (fVar instanceof c) {
                return fVar.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown EditCommand: ");
            String a10 = qc.g0.b(fVar.getClass()).a();
            if (a10 == null) {
                a10 = "{anonymous EditCommand}";
            }
            sb4.append(a10);
            return sb4.toString();
        }
    }

    public final j0 b(List<? extends f> list) {
        f fVar;
        Exception e10;
        qc.q.i(list, "editCommands");
        f fVar2 = null;
        try {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                fVar = list.get(i10);
                try {
                    fVar.a(this.f7769b);
                    i10++;
                    fVar2 = fVar;
                } catch (Exception e11) {
                    e10 = e11;
                    throw new RuntimeException(c(list, fVar), e10);
                }
            }
            j0 j0Var = new j0(this.f7769b.s(), this.f7769b.i(), this.f7769b.d(), (qc.h) null);
            this.f7768a = j0Var;
            return j0Var;
        } catch (Exception e12) {
            fVar = fVar2;
            e10 = e12;
        }
    }

    public final void d(j0 j0Var, r0 r0Var) {
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        boolean z10 = true;
        boolean z11 = !qc.q.d(j0Var.f(), this.f7769b.d());
        boolean z12 = false;
        if (!qc.q.d(this.f7768a.e(), j0Var.e())) {
            this.f7769b = new i(j0Var.e(), j0Var.g(), null);
        } else if (!v1.i0.g(this.f7768a.g(), j0Var.g())) {
            this.f7769b.p(v1.i0.l(j0Var.g()), v1.i0.k(j0Var.g()));
            z10 = false;
            z12 = true;
        } else {
            z10 = false;
        }
        if (j0Var.f() == null) {
            this.f7769b.a();
        } else if (!v1.i0.h(j0Var.f().r())) {
            this.f7769b.n(v1.i0.l(j0Var.f().r()), v1.i0.k(j0Var.f().r()));
        }
        if (z10 || (!z12 && z11)) {
            this.f7769b.a();
            j0Var = j0.d(j0Var, null, 0L, null, 3, null);
        }
        j0 j0Var2 = this.f7768a;
        this.f7768a = j0Var;
        if (r0Var != null) {
            r0Var.f(j0Var2, j0Var);
        }
    }

    public final j0 f() {
        return this.f7768a;
    }
}
