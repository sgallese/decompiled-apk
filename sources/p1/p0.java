package p1;

import java.util.List;
import p1.t0;

/* compiled from: LayoutTreeConsistencyChecker.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f20914a;

    /* renamed from: b  reason: collision with root package name */
    private final n f20915b;

    /* renamed from: c  reason: collision with root package name */
    private final List<t0.a> f20916c;

    public p0(j0 j0Var, n nVar, List<t0.a> list) {
        qc.q.i(j0Var, "root");
        qc.q.i(nVar, "relayoutNodes");
        qc.q.i(list, "postponedMeasureRequests");
        this.f20914a = j0Var;
        this.f20915b = nVar;
        this.f20916c = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean b(p1.j0 r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.p0.b(p1.j0):boolean");
    }

    private final boolean c(j0 j0Var) {
        if (!b(j0Var)) {
            return false;
        }
        List<j0> F = j0Var.F();
        int size = F.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(F.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        qc.q.h(sb2, "append(value)");
        sb2.append('\n');
        qc.q.h(sb2, "append('\\n')");
        e(this, sb2, this.f20914a, 0);
        String sb3 = sb2.toString();
        qc.q.h(sb3, "stringBuilder.toString()");
        return sb3;
    }

    private static final void e(p0 p0Var, StringBuilder sb2, j0 j0Var, int i10) {
        boolean z10;
        String f10 = p0Var.f(j0Var);
        if (f10.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(f10);
            qc.q.h(sb2, "append(value)");
            sb2.append('\n');
            qc.q.h(sb2, "append('\\n')");
            i10++;
        }
        List<j0> F = j0Var.F();
        int size = F.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(p0Var, sb2, F.get(i12), i10);
        }
    }

    private final String f(j0 j0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j0Var);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(j0Var.V());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!j0Var.f()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + j0Var.e0() + ']');
        if (!b(j0Var)) {
            sb2.append("[INCONSISTENT]");
        }
        String sb4 = sb2.toString();
        qc.q.h(sb4, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb4;
    }

    public final void a() {
        if ((!c(this.f20914a)) == false) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
